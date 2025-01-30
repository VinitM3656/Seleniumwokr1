package Inheritance;



	
	import java.util.LinkedList;

	public class Linkedlist { 
	  public static void main(String[] args) { 
	    LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    

	    
	    cars.addFirst("Mazda");// addfirst gives you addvalue to first
	   
	    
	    
	    // Use addLast() to add the item to the end
	    cars.addLast("Mazda");//// Use addLast() to add the item to the end
	
	    
	    
	    
	    cars.removeFirst(); // Use removeFirst() remove the first item from the list
	    
	    
	    // Use removeLast() remove the last item from the list
	    cars.removeLast();
	    
	 // Use getLast() to display the last item in the list
	    System.out.println(cars.getLast());
	    System.out.println(cars);
	  } 
	}


