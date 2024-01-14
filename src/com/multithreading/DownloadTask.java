package com.multithreading;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;

class DownloadTask implements Runnable {
	private final String url;
	private Map<String, BufferedImage> imageMap;
	
	public DownloadTask(String url, Map<String, BufferedImage> imageMap) {
		this.url = url;
		this.imageMap = imageMap;
	}
	
	@Override
	public void run() {
		try {
		//Download image data and convert to buffered image
		BufferedImage image = downloadAndConvertImage(url);
		//Store image in thread safe map with associated URL
		imageMap.put(url, image);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	private BufferedImage downloadAndConvertImage(String url2) throws IOException {
		//Implementation to download and convert image data..
		//This can involve libraries like URLConnection, ImageIO, etc.
		//Replace this with your actual implementation.
		return new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB); //Placeholder image
	}
	

}
