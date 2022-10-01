package CoreJAva;
abstract class Qcar {
	//method's
	abstract void drive();//abstract method
	public void gearchange() {
		System.out.println("GearChange.....");
	}
	
}

class Tesla extends Qcar
{
	public void drive() //body and definition of that abstract method of super class
	{
		System.out.println("Drive..Safely");
	}
	
	//Main Method
	
	public static void main(String args[]) {
		//creating object
		Tesla T = new Tesla();
		
		//calling method's
		
		T.drive();
		T.gearchange();
	}
}