package com.JimWilson.threads;

public class MultiThread {

	public static void main(String[] args) {
		String[] inFiles = { ".//src//main//resources//iFile1.txt", ".//src//main//resources//iFile2.txt",
				".//src//main//resources//iFile3.txt" };
		String[] outFiles = { ".//src//main//resources//oFile1.txt", ".//src//main//resources//oFile2.txt",
				".//src//main//resources//oFile3.txt" };

//		we are looping thru 3 files and creating separate thread for processing each file
//		to move it mutli thread capability , we create thread class and adder as constructor
//		pass runnable interface implementation as constructor to thread class
//		this will run each adder class in seperate thread
//		but there is problem with this. main thread finishes before all threads are completed
//		look at MultiThreadUseJoin.java

		for (int i = 0; i < outFiles.length; i++) {
			AdderMulti adder = new AdderMulti(inFiles[i], outFiles[i]);
//				adder.doAdd(); // single thread way
			Thread thread = new Thread(adder);
			thread.start();
		}
	}

}


