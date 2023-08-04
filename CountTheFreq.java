package todayTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountTheFreq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String s=sc.nextLine();
		
		//Tree map gives the out put in ascending order  
		Map<Character,Integer> map=new TreeMap<>();
		//remove the White Space
		s=s.replace(" ","");
		//convert string to array
		char arr[]=s.toCharArray();
//		int i=0;
//		int j=arr.length-1;
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			map.put(arr[i],count);
		}
		System.out.println(map);

	}

}
