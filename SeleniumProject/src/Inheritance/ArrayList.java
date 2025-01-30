package Inheritance;

import java.util.ArrayList;

public class Main { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    cars.remove(0);// remove values
    cars.set(0, "Opel");//set new value
    
    cars.clear();
    System.out.println(cars);
    System.out.println(cars.size());///get size of arraylist
  } 
}

