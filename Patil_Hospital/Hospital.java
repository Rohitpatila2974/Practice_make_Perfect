package Patil_Hospital;
import java.io.*;
import java.util.Scanner;
class hospi extends ObjectOutputStream
{
	public hospi (OutputStream out) throws IOException
	{
		super(out);
		
	}
	
	protected void writeStreamHeader()
	{
		
		
	}	
}

public class Hospital 
{
	
	public static void main(String args[]) throws Exception
	{
		
		Scanner s=new Scanner (System.in);
		System.out.println("a.Pationt");
		System.out.println("b.Doctor");
		
		System.out.println("Enter The Choice :");
		char choice=s.next().charAt(0);
		
		
		
	
		switch(choice)
		{
		
		case 'a':
		{
			Pationt p=new Pationt();
			p.setdata();
			
			File f=new File("Pationt.ser");
			FileOutputStream fo=new FileOutputStream("Pationt.ser",true);
			
			if(f.length()<=0)
			{

			ObjectOutputStream o=new ObjectOutputStream(fo);
			o.writeObject(p);
			}
			else
			{
				
				hospi hs=new hospi(fo);
				hs.writeObject(p);
				
			}
			try {
				FileInputStream fi=new FileInputStream("Pationt.ser");
				ObjectInputStream oi=new ObjectInputStream(fi);
				int count=0;
				do {
					p=(Pationt)oi.readObject();
					p.Display();
					count++;
					p.countP(count);
				}while(p!=null);
				oi.close();
				
				}catch(Exception e)
				
				{
					System.out.println("\n.....PATIONT RECORD STORED.....");	
				}
			break;
			
		}
		
		
		case 'b':
		{
			Doctor d=new Doctor();
			d.setDname("ROHINI");
			d.setAddress("EDAS");
			d.setRegno(4512345);
			d.setSpecilization("ORTHO");
			
			File fd=new File("Doctor.ser");
			
			FileOutputStream fdo=new FileOutputStream("Doctor.ser",true);
			
			if(fd.length()<=0)
			{
				ObjectOutputStream od=new ObjectOutputStream(fdo);
				od.writeUnshared(d);
			}
			else
			{
				hospi hs=new hospi(fdo);
				hs.writeObject(d);
			}
			
			
		try {
			
			FileInputStream fdi=new FileInputStream("Doctor.ser");
			ObjectInputStream odi=new ObjectInputStream(fdi);
			int count=0;
			do {
				d=(Doctor)odi.readObject();
				d.ShowRecord();
				count++;
				d.countD(count);
			}while(d!=null);
				
			odi.close();
			}catch (Exception r)
		{
				System.out.println("\n....DOCTOR RECORD STORED....");
		}
		  break;		
		}
		
		
		
		default :
		{
			System.out.println("...WRONG CHARACTER ENTERED...");
			System.out.println(".....APPLICATION CLOSED...");
			
		}
		break;
		}
		
		System.out.println("\n....THANK YOU FOR VISITING OUR HOSPITAL....");
		
	}
	

}
