package com.fkart.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//Utility class for scanner implementation and converting string to date
public class Utility {

	private static Scanner scanner=null;
	private static Date date = null;

	public static Scanner getScanner() {

		if (null == scanner)
			return new Scanner(System.in);
		else
			return scanner;
	}
	
	public static Date getDate(String dateChange) throws Exception{
		if(null==date) {
			return new SimpleDateFormat("dd/MM/yyyy").parse(dateChange);
		}
		else {
			return date;
		}
	}
}