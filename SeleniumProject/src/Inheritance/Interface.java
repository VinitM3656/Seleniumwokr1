

//An interface is declared by using the interface keyword. It provides total
//abstraction; means all the methods in an interface are declared with the empty
//body, and all the fields are public, static and final by default. A class that
//implements an interface must implement all the methods declared in the interface



package Inheritance;

interface printable{  
void print();  
}  
class A6 implements printable{  
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
A6 obj = new A6();  
obj.print();  
 }  
}  