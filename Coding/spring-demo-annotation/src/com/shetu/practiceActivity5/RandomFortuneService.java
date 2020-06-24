package com.shetu.practiceActivity5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private List<String> data = readFileByBufferedReader();
	private Random random = new Random();
	
	@Override
	public String getDailyFortune() {
		int randomIndex = random.nextInt(data.size());
		String fortune = data.get(randomIndex);
		return fortune;
	}

	// File Read operation using buffered Reader
	public static List<String> readFileByBufferedReader() {
		// Create an object of file
		File file = new File("E:\\Personal\\Online courses\\Udemy\\Courses\\Udemy Spring Hibernate for  Beginners\\Udemy_Spring_Hibernate_For_Beginners\\Coding\\spring-demo-annotation\\src\\com\\shetu\\practiceActivity5\\demo.txt");
			// create an object of Buffered reader
		BufferedReader bufferedReader = null;
		try {
		  bufferedReader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String line;
		List<String> list = new LinkedList<String>();
		try {
			while((line=bufferedReader.readLine())!=null) {
				list.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
}
