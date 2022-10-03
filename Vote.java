package CoreJAva;

import java.util.Scanner;


public class Vote {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		//taking input from the user
		System.out.println("Enter age;");
		int age=sc.nextInt();
		
		
		//Applying condition
		if(age>=18)
		{
			System.out.println("you can vote ");
		}
		else
		{
		System.out.println("not eligiable for vote");
		}
	}

}
