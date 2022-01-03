package com.JimWilson.threads;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AdderMulti implements Runnable {

	private String inFile;
	private String outFile;

	public AdderMulti(String inFile, String outFile) {
		this.inFile = inFile;
		this.outFile = outFile;
	}

	public void doAdd() throws IOException {
		int total = 0;
		String line = null;

		try (BufferedReader reader = Files.newBufferedReader(Paths.get(inFile))) {
			while ((line = reader.readLine()) != null) {
				total += Integer.parseInt(line);
			}
			try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outFile))) {
				writer.write("Total : " + total);
			}

		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
		}

	}

	@Override
	public void run() {
		try {
			doAdd();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
