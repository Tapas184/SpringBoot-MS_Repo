package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.MarageSeeker;
import com.nt.service.IMarageManagementService;
@Component
public class MarrigeRunner implements CommandLineRunner {
	@Autowired
	private IMarageManagementService service;
	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = sc.nextLine();
		System.out.println("Enter Your Address");
		String cadd = sc.nextLine();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Enter your Fully Image Path");
		String imagePath = sc.nextLine();
		System.out.println("Enter your Fully biodata File path");
		String bioPath=sc.nextLine();
		System.out.println("Are you Indian(true/false)");
		boolean isIndian = sc.nextBoolean();
		
		//convert imagePath to byte[]
		InputStream is = new FileInputStream(imagePath);
		byte [] image=new byte[is.available()];
		image=is.readAllBytes();
		
	 	//convert biopath to char[]
		File file = new File(bioPath);
		FileReader fr = new FileReader(file);
		char[] files = new char[(int) file.length()];
		fr.read(files);
		
		MarageSeeker seeker = new MarageSeeker(name, cadd, age, image, files);
		
		service.getIdByDetails(seeker);
		}//run

}//class
