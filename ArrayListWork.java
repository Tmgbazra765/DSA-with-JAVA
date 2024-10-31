package basic;

import java.util.ArrayList;

public class ArrayListWork {
	public static void main(String[] args) {
		ArrayList<String> cars= new ArrayList<String>();
		cars.add("Farrarii");
		cars.add("Bugati");
		cars.add("RengeRover");
		cars.add("BMW");
		
		cars.set(1, "RoyelsRover");
		cars.remove(3);
		//cars.clear();
		cars.retainAll(cars);
		
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
	}

}
