package Culminating;

import java.util.Scanner;
import java.text.Normalizer;

public class Part1PairwiseCiphers {

public static String enCodedkey3;
public static String enCodedfinalKey;
public static String keyAlphabet;

public static String deCodedmessagesArrayFinal;

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			double encodeOrDecode;
			
			System.out.println("Please indicate whether you would like\nto encode or decode a message ('1' for encoding or '2' for decoding)"
					+ "\nPlease note that any other number will terminate the program : ");
			
			encodeOrDecode = input.nextDouble();
			
			if (encodeOrDecode == 1 || encodeOrDecode == 2);
			{
			
				if (encodeOrDecode == 1)
				{
						Scanner input1 = new Scanner(System.in); 
						String key;
						String message;
	
						System.out.println("\nPlease enter the key:");
	
						key = input1.nextLine();
						
	
						System.out.println("\nPlease enter the message:");
	
						message = input1.nextLine();
						
						System.out.println("\nThe key is: " + enCodingKey(key));
	
						System.out.println("\nThe message is: " + enCodingMessage(message));
						
				}

			
				if (encodeOrDecode == 2)
				{
						Scanner input1 = new Scanner(System.in);
	
						String message;
	
						System.out.println("\nPlease enter the key:");
	
						keyAlphabet = input1.nextLine();
						
	
						System.out.println("\nPlease enter the message:");
	
						message = input1.nextLine();
						
	
						System.out.println("\nThe message is: " + deCodingMessage(message));
						
				}
			
			} 
		
			if (encodeOrDecode != 1 || encodeOrDecode != 2)
			{
				System.out.println("\nThe program is terminated please run again.");
			}
		
	}
	
/*
 * 
 * 
 * 
 * 
 * DECODING STARTS HERE!
 * 
 * 
 * 
 * 
 * */	
	
	
	public static String enCodingKey(String key)
	{
				
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		enCodedfinalKey = key.replaceAll(" ", "").toUpperCase();
		
		enCodedfinalKey.replaceAll(" ", "X");
		
		enCodedfinalKey = enCodedfinalKey + alphabet;
		
		keyAlphabet = "";

		for (int i = 0; i < enCodedfinalKey.length() ; i ++)
		{
			
			if (keyAlphabet.indexOf(enCodedfinalKey.charAt(i)) == -1)
			{
				keyAlphabet += enCodedfinalKey.charAt(i);
				
			}
			
		}
		
		return keyAlphabet;
		
	}
	
	public static String enCodingMessage(String message)
		{
			String message1; 
			String message2 = "";
		
			message1 = message.toUpperCase().replaceAll("X", "KS");
				
			message1 = message1.replaceAll(" ", "X");
		
			if (message1.length() % 2 != 0)
			{
				message1 += "X";
				
			}
		
		
			for (int i = 0; i < message1.length(); i+=2)
			{

				char character1 = message1.charAt(i);
				char character2 = message1.charAt(i+1);
				
				int indexOfchar2 = keyAlphabet.indexOf(character2);
				int indexOfchar1 = keyAlphabet.indexOf(character1);
			
				if (indexOfchar2 == 25)
				{
					message2 += keyAlphabet.charAt(0);
			
				} else {
				
					message2 += keyAlphabet.charAt(indexOfchar2 + 1);
				}
			
				if (indexOfchar1 == 0)
				{
					message2 += keyAlphabet.charAt(25);
				
				} else {
				
					message2 += keyAlphabet.charAt(indexOfchar1 - 1);
				}
				
			}
			
		
		return message2;
		
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * DECODING STARTS HERE!!
	 * 
	 * 
	 * 
	 * 
	 * */	
	
	public static String deCodingMessage(String message1)
	{
		
		String message2 = "";
		
		
		for (int i = 0; i < message1.length(); i += 2)
		{

			char character1 = message1.charAt(i);
			char character2 = message1.charAt(i+1);
			
			int indexOfchar2 = keyAlphabet.indexOf(character2);
			int indexOfchar1 = keyAlphabet.indexOf(character1);
		
			if (indexOfchar2 == 25)
			{
				message2 += keyAlphabet.charAt(0);
		
			} else {
			
				message2 += keyAlphabet.charAt(indexOfchar2 + 1);
			}
		
			if (indexOfchar1 == 0)
			{
				message2 += keyAlphabet.charAt(25);
			
			} else {
			
				message2 += keyAlphabet.charAt(indexOfchar1 - 1);
			}
			
		}
		message2 = message2.replaceAll("X", " ");
		
		message2 = message2.toUpperCase().replaceAll("KS", "X");
		
	
		return message2;
	
	}
}
	


	
