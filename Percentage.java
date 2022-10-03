package CoreJAva;

import java.util.Scanner;

public class Percentage {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		//taking input from the user
		System.out.println("enter first sub no;");
		int sub1=sc.nextInt();
		System.out.println("enter Second sub no;");
		int sub2=sc.nextInt();
		System.out.println("enter third sub no;");
		int sub3=sc.nextInt();
		System.out.println("enter fourth sub no;");
		int sub4=sc.nextInt();
		System.out.println("enter fifth sub no;");
		int sub5=sc.nextInt();
		
		//calculating percentage
	      float perc=((sub1+sub2+sub3+sub4+sub5)/500)*100;
	      
	      
	      //Applying on condition
	      if(perc>=60) {
	    	  System.out.println("Pass");
	    	  
	      }
		
	      else {
	    	  System.out.println("fail");
	      }
		
		
			
			
			
			
			
	
	}

}
