

package CoreJAva;

import java.util.Scanner;

class ORoperator {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter first no;");
		 int num1=sc.nextInt();
		 System.out.println("enter second no;");
		 int num2=sc.nextInt();
		 System.out.println("enter third no;");
		 int num3=sc.nextInt();
		 if((num1<num2)||(num2==num3)) {
			 int sum=num1+num2+num3;
			 System.out.println("the sum is;" +sum);}
		 else {
			 System.out.println("false condition");
		 }
	 }

}


