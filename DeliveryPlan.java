package CodeExamples;

import java.lang.Math;
import java.util.*;

class Solution {
	//Find the shortest route using x^2 + y^2 = z^2
	public static List<List<Integer>> limitedPlan(List<List<Integer>> allLocation, int numDelivery) {
		List<List<Integer>> DeliveryList = new ArrayList<>();
		List<Double> distance = new ArrayList<>();		//contains distance for each location
		
		//check if empty
		//else check if allLocation equal to the size of delivery
		if(allLocation.isEmpty()) {
			return null;
		} else if(allLocation.size() == numDelivery) {
			return allLocation;
		}
		
		//add the distance for each location
		for(int i = 0; i < allLocation.size(); i++) {
			List<Integer> currlocation = allLocation.get(i);		//gets the current x,y position for one location
			int x = currlocation.get(0);
			int y = currlocation.get(1);
			double total = (double)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			
			distance.add(total);
		}
		
		//find the N number of shortest delivery 
		int counter = 0;
		while(counter < numDelivery) {
			double shortDistance = distance.get(0);	//base is first location of list
			int delivered = 0;
			for(int i = 0; i < distance.size(); i++) {		//find shortest route
				if(shortDistance > distance.get(i)) {
					shortDistance = distance.get(i);
					delivered = i;
				}
			}
			
			//add shortest route
			//then remove from the list
			DeliveryList.add(allLocation.get(delivered));
			allLocation.remove(delivered);
			distance.remove(delivered);
			counter++;
		}
		
		
		return DeliveryList;
	}
}


public class DeliveryPlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> listDelivery = new ArrayList<>();
		int numDelivery = 2;
		
		//the 3 location
		List<Integer> listA = new ArrayList<>();
		List<Integer> listB = new ArrayList<>();
		List<Integer> listC = new ArrayList<>();
		
		//adding location position
		listA.add(1);
		listA.add(2);
		listB.add(3);
		listB.add(4);
		listC.add(1);
		listC.add(-1);
		
		//adding to the delivery list
		listDelivery.add(listA);
		listDelivery.add(listB);
		listDelivery.add(listC);
		
		/*
		//display the list of location position
		for (int i = 0; i < listDelivery.size(); i++) {
			System.out.println(listDelivery.get(i));
		}
		 */
		
		
		List<List<Integer>> possibleDelivery = Solution.limitedPlan(listDelivery, numDelivery);
		
		//print the result
		for (int i = 0; i < possibleDelivery.size(); i++) {
			System.out.println(possibleDelivery.get(i));
		}

	}

}
