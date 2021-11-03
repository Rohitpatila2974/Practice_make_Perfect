package Patil_Hospital;
import java.io.*;
import java.util.Scanner;

public class Pationt implements Serializable
{
	
	String Pationtname;
	int Pationtid;
	String PationtAddress;
	long MobileNo;
	
	
	  void setdata()
	  {
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter The Name Of Pationt :");
		  Pationtname=s.nextLine();
		  System.out.println("Enter The Pationt ID :");
		  Pationtid=s.nextInt();
		  System.out.println("Enter The Address Of Pationt :");
		  PationtAddress=s.next();
		  System.out.println("Enter The Mobile Number Of Pationt :");
		  MobileNo=s.nextLong();  
	  }
	  
	  void Display()
	  {
		  System.out.println("NAME OF PATIONT :"+Pationtname);
		  System.out.println("PATIONT ID :"+Pationtid);
		  System.out.println("PATIONT ADDRESS :"+PationtAddress);
		  System.out.println("PATIONT MOBILE NUMBER :"+MobileNo);
	  }
	  
	  public void countP(int y)
	  {
		System.out.println("\n TOTAL RECORDS OF PATIONT IS :"+y); 
	  }

}
