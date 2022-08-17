package com.revature.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManagement {
	
	public static void main(String[] args) {
		
		/*
		 * Reading a file using BufferedReader
		 */
		File file = new File("src/com/revature/fileio/file.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String st;
			
			while ((st = br.readLine()) != null) {
				System.out.println(st);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		/*
		 * Reading using Scanner Class
		 */
		
		Scanner sc;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * Writing to a file
		 * FileWriter
		 */
		
		try{
			FileWriter fw = new FileWriter("src/com/revature/fileio/file.txt");
			
			fw.write("This is a new edit, I have not wrote this yet");
			
			fw.close();
			
			System.out.println("Done!");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
