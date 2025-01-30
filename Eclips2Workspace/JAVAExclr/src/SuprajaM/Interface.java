package SuprajaM;



	

	 
interface Drawable{  
void draw();  
}  
 
class Rectangle implements Drawable{ 
 
public void draw(){System.out.println("drawing rectangle");}  
}


  
class Circle implements Drawable{  

public void draw(){System.out.println("drawing circle");}  
}  

public class Interface {
 
public static void main(String args[]){ 
 
Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
d.draw();  
}}  
