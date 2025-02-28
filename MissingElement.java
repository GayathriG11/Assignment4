package assignment.week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,10,6,8};
		
		List<Integer> list = new ArrayList<Integer>();
		
for( int num:array) {
			
			list.add(num);
			
		}
		
		Collections.sort(list);
		
		System.out.println("Missing numbers are : ");
		
		for(int i=0;i<list.size()-1;i++) {
			
			//check for gaps
			
			if(list.get(i)+1!=list.get(i+1)) {
				
				//get the next expected number in the sequence
				
				for(int j= list.get(i)+1;j<list.get(i+1);j++) {
					
					System.out.println(j);
					
					
				}
			}
		}
	}

}
