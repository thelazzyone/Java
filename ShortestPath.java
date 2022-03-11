import java.lang.Math;
import java.util.*;

class Solution {
	//Find the shortest route using x^2 + y^2 = z^2
	public static List<List<Integer>> shortPath(List<List<Integer>> allLocation, int pathlimit) {
		List<List<Integer>> shortestPath = new ArrayList<>();
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
		while(counter < pathlimit) {
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
			shortestPath.add(allLocation.get(delivered));
			allLocation.remove(delivered);
			distance.remove(delivered);
			counter++;
		}
		
		
		return shortestPath;
	}
}


public class ShortestPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> pathlist = new ArrayList<>();
		int pathlimit = 2;
		
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
		pathlist.add(listA);
		pathlist.add(listB);
		pathlist.add(listC);
		
		/*
		//display the list of location position
		for (int i = 0; i < pathlist.size(); i++) {
			System.out.println(pathlist.get(i));
		}
		 */
		
		
		List<List<Integer>> shortPath = Solution.limitedPlan(pathlist, pathlimit);
		
		//print the result
		for (int i = 0; i < shortPath.size(); i++) {
			System.out.println(shortPath.get(i));
		}

	}

}
