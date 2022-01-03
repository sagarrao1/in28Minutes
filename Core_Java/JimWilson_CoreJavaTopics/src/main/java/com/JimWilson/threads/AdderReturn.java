package com.JimWilson.threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

/*Here doAdd method returns value in this case we need to use Callable interface instead on runnable
 
 
*/ 
public class AdderReturn implements Callable<Integer> {

	private String inFile;

	public AdderReturn(String inFile) {
		this.inFile = inFile;
	}

	public int doAdd() throws IOException {
		int total = 0;
		String line = null;

		try (BufferedReader reader = Files.newBufferedReader(Paths.get(inFile))) {
			while ((line = reader.readLine()) != null) {
				total += Integer.parseInt(line);
			}
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
		}
		return total;
	}

	@Override
	public Integer call() throws Exception {
		return doAdd();
	}

	
}
