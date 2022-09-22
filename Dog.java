package java1;
//use of extends keywords to perform inheritance
class Dog extends Animals
{//method and fields of animal 
//methods and fields of dog
public void display(){
System.out.println("My name is:"+ name);
}
public static void main(String[] args){
//creating an object of sub clas
Dog d=new Dog();
//accessing field of super class
d,name="bulldog";
d.display();
//called method of super class using object of sub class
d.eat();
}
}