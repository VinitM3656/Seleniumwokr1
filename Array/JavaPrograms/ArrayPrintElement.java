package JavaPrograms;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayPrintElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // Changed type parameter to Integer
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        
        arr.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer item) {
			    System.out.println("Element:");
			    System.out.println(item);

			}
		});

    }
}
