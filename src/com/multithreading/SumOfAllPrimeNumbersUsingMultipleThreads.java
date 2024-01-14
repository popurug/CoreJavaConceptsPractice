package com.multithreading;

public class SumOfAllPrimeNumbersUsingMultipleThreads {
	private static final int numThreads = 4;

	static class PrimeSumTask implements Runnable {
		private int start;
		private int end;
		private long sum;

		public PrimeSumTask(int start, int end) {
			this.start = start;
			this.end = end;
			this.sum = 0;
		}

		public long getSum() {
			return sum;
		}

		private boolean isPrime(int number) {
			if (number < 2) {
				return false;
			}
			return true;
		}

		@Override
		public void run() {
			for (int i = start; i <= end; i++) {
				if (isPrime(i)) {
					sum += i;
				}
			}
		}

	}

	public static void main(String[] args) {

		int limit = 100;
		Thread[] threads = new Thread[numThreads];
		PrimeSumTask[] tasks = new PrimeSumTask[numThreads];

		int segmentSize = limit / numThreads;
		int start = 2;
		int end = segmentSize;

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < numThreads; i++) {
			if (i == numThreads - 1) {
				// Last thread takes care of remaining numbers
				end = limit;
			}

			tasks[i] = new PrimeSumTask(start, end);
			threads[i] = new Thread(tasks[i]);
			threads[i].start();

			start = end + 1;
			end += segmentSize;
		}

		long sum = 0;
		for (int i = 0; i < numThreads; i++) {
			try {
				threads[i].join();
				sum += tasks[i].getSum();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();

		System.out.println("Sum of prime numbers upto " + limit + " : " + sum);
		System.out.println("Time taken: " + (endTime - startTime) + " milliSeconds");
	}

}
