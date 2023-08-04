package todayTask;

import java.util.Scanner;

public class NoofVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String s=sc.nextLine();
		//convert string to lower case
		s=s.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("Total no of Vowels:"+count);

	}

}
