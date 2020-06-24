package com.shetu.practiceActivity5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadOperation {
public static void main(String[] args) throws IOException {
	readFileByBufferedReader();
}

// File Read operation using buffered Reader
public static void readFileByBufferedReader() throws IOException {
	// Create an object of file
	File file = new File("E:\\Personal\\Online courses\\Udemy\\Courses\\Udemy Spring Hibernate for  Beginners\\Udemy_Spring_Hibernate_For_Beginners\\Coding\\spring-demo-annotation\\src\\practice_activity_5\\demo.txt");
		// create an object of Buffered reader
	BufferedReader bufferedReader = null;
	try {
	  bufferedReader = new BufferedReader(new FileReader(file));
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}

	String line;
	while((line=bufferedReader.readLine())!=null) {
		System.out.println(line);
	}
}


//File Read operation using Scanner Class
public static void readFileByScanner(){
	// Create an object of file
	File file = new File("E:\\Personal\\Online courses\\Udemy\\Courses\\Udemy Spring Hibernate for  Beginners\\Udemy_Spring_Hibernate_For_Beginners\\Coding\\spring-demo-annotation\\src\\practice_activity_5\\demo.txt");
		// create an object of Scanner class
	Scanner scanner = null;
	try {
		 scanner = new Scanner(file);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	while(scanner.hasNext()) {
		System.out.println(scanner.nextLine());
	}
}

//File Read operation using File Reader
public static void readFileByFileReader() {
	// Create an object of file
	File file = new File("E:\\Personal\\Online courses\\Udemy\\Courses\\Udemy Spring Hibernate for  Beginners\\Udemy_Spring_Hibernate_For_Beginners\\Coding\\spring-demo-annotation\\src\\practice_activity_5\\demo.txt");
	FileReader fileReader = null;
	try {
		
		 fileReader = new FileReader(file);
	} catch (Exception e) {
		e.printStackTrace();
	}
	int line;
	try {
		while((line=fileReader.read()) != -1) {
			System.out.println((char)line);
		}
	} catch (Exception e) {
		
	}
	
}

}
