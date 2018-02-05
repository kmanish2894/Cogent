package com.manish;
// Java program to demonstrate working of Scanner in Java
import java.util.Scanner;

 
class User extends Password
{
	private String altEmail;
	private static Integer mailboxCapacity = 2000;
    public static void main(String args[])
    {
    	
    	
    	
        // Using Scanner for Getting Input from User
        Scanner in  = new Scanner(System.in);
        
        System.out.println("Welcome to Cogent Infotech. Enter following details to create your id");
        System.out.println("Enter your first name");
        String firstname = in.nextLine();
        System.out.println("Your first name is  "+firstname);
        System.out.println("Enter your last name");
 
        String lastname = in.nextLine();
        System.out.println("Your Last name is "+lastname);
        System.out.println("Select a department: sales, development, accounting");
 
        String department = in.nextLine();
        System.out.println("Your department is "+department);
        System.out.println("Thank you for details");
        String id = firstname+"."+lastname+"@"+department+"."+"cogent"+".com";
        System.out.println("Your id is:");
        System.out.println(id);
        System.out.println("Your password is: ");
        System.out.println(p.getPassword());
     
        
        
        
  }
    
    	public String getAltEmail() {
		return altEmail;
	}

    	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}

		public static Integer getMailboxCapacity() {
			return mailboxCapacity;
		}

		public static void setMailboxCapacity(Integer mailboxCapacity) {
			User.mailboxCapacity = mailboxCapacity;
		}

   
}
