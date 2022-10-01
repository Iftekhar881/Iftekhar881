package CoreJAva;

public class Methodoverriding2 extends Methodoveriding{
			void display() {
				System.out.println("I am from sub class Method_Overiding2");
			}
			
			public static void main(String args[]) {
				//Maiking objects
				Methodoverriding2 m = new Methodoverriding2();
				
				// here it will over ride the supperclass and run the local class
				m.display();
				
				
			}

		}


