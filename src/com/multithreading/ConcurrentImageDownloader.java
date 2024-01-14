package com.multithreading;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentImageDownloader {
	private static final String[] Image_Urls = { "https://example.com/image1.jpg", "https://example.com/image2.png",
			"https://example.com/image3.gif", };

	public static void main(String[] args) throws IOException, InterruptedException {

		// Thread pool with maximum 5 threads for download tasks
		ExecutorService executor = Executors.newFixedThreadPool(5);

		// Thread safe map to store downloaded and processed images
		Map<String, BufferedImage> imageMap = new HashMap<>();

		// Submit download tasks for each image URL
		for (String url : Image_Urls) {
			executor.submit(new DownloadTask(url, imageMap));
		}

		// Wait for all download tasks to finish
		executor.shutdown();
		executor.awaitTermination(10, TimeUnit.SECONDS);

		// Access downloaded images from the map
		for (String url : Image_Urls) {
			BufferedImage image = imageMap.get(url);
			if (image != null) {
				// Process image further or update UI with the image..
				System.out.println("Downloaded and processed image from: " + url);
			} else {
				System.err.println("Failed to download or process image: " + url);
			}
		}
	}

}
