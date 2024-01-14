package com.bayoneproblems;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class ThreadDump {

	private static String threadDump(boolean lockedMonitors, boolean lockedSynchronizers) {
		StringBuffer threadDump = new StringBuffer(System.lineSeparator());
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		for (ThreadInfo threadInfo : threadMXBean.dumpAllThreads(lockedMonitors, lockedSynchronizers)) {
			threadDump.append(threadInfo.toString());
		}
		return threadDump.toString();
	}

	public static void main(String[] args) {

	/*	boolean lockedSynchronizers = false;
		boolean lockedMonitors = false;
		ThreadDump.threadDump(lockedMonitors, lockedSynchronizers);  */
		
		ThreadDump td = new ThreadDump();
		boolean lockedSynchronizers = false;
		boolean lockedMonitors = false;
		td.threadDump(lockedMonitors, lockedSynchronizers);
	}

}
