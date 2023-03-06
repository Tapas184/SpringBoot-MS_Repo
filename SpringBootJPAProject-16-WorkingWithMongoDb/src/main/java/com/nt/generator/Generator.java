package com.nt.generator;

import java.util.UUID;

//class for random id generator
public class Generator {
	
	public static String randomIdGenerator() {
		
		return UUID.randomUUID().toString().replace("-","").substring(0, 11);
	}

}//class
