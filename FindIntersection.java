package assignment.week4.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		List<Integer> list2= List.of(4,5,6,7,8);
		
		List<Integer> intersection = new ArrayList<>();
		
		
		
		
for(int i=0;i<list1.size();i++) {
			
	int num = list1.get(i);
	
			for(int j=0;j<list2.size();j++) {
				
				int num1= list2.get(j);
				
				if(num==num1) {
					
					intersection.add(num);
					
					
				}
			}
		}
		
		System.out.println("Intersection :" + intersection);
	}
	}


