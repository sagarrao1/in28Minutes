package com.JimWilson.threads;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadUsingThreadPool {

	public static void main(String[] args) {
		String[] inFiles = { ".//src//main//resources//iFile1.txt", ".//src//main//resources//iFile2.txt",
				".//src//main//resources//iFile3.txt" };
		String[] outFiles = { ".//src//main//resources//oFile1.txt", ".//src//main//resources//oFile2.txt",
				".//src//main//resources//oFile3.txt" };

//		ThreadPool is used to manage to assign tasks to thread or shutdown threads , wait for all thread to complete
//		other features like we create dynamically sized threads, fixed limeted size threads means max that no of threas will be created
//		ThreadPool has 2 concepts.  1. ExecutorSerive is interface to create custom ThreadPool classes
//		2. Executors is class
		
//		Thread[] threads=  new Thread[outFiles.length];		
		ExecutorService es = Executors.newFixedThreadPool(2);
//		this will make sure it won't allow more than 2 threads to run at same time
//		Let's assume if we are reading 1000 files read/write, this will allow 1000 thread to create and to run parallel , to avoid tha
//		we create fixedthread like 5 threads at same time and these 5 threads will take opening 1000 files read/write
		
//		Main concept here is no matter whether 6 files ot 6000 files to process, it only opens fixed no.of threads(2 here) at same time to complete task.
		 
		for (int i = 0; i < outFiles.length; i++) {
			AdderMulti adder = new AdderMulti(inFiles[i], outFiles[i]);
//			threads[i] = new Thread(adder);
//			threads[i].start();
			es.submit(adder);
		}
		
		try {
			es.shutdown();
			es.awaitTermination(60, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}


