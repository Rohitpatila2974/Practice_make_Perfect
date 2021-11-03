package Patil_Hospital;
import java.io.*;
public class Doctor implements Serializable
{
	String dname;
	String Address;
	int regno;
	String Specilization;
	
	public void setDname(String dname) 
	{
		this.dname =dname;
	}
	
	public String getDname()
	{
		return dname;
	}
	
	public void setAddress(String address) 
	{
		Address =address;
	}
	public String getAddress() 
	{
		return Address;
	}
	
	public void setRegno(int regno) 
	{
		this.regno =regno;
	}
	public int getRegno() {
		return regno;
	}
	
	public void setSpecilization(String specilization) 
	{
		Specilization =Specilization;
	}
	public String getSpecilization() 
	{
		return Specilization;
		
	}
	
	void ShowRecord()
	{
		System.out.println("DOCTOR NAME :"+getDname());
		System.out.println("ADDRESS OF DOCTOR :"+getAddress());
		System.out.println("REGISTRATION NUMBER :"+getRegno());
		System.out.println("SPECILIZATIONA OF DOCTOR :"+getSpecilization());
	}
	
	public void  countD(int x)
	{
      System.out.println("\n TOTAL RECORDS OF DOCTOR IS :"+x);
	}

}
