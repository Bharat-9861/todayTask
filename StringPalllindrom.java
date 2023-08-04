package todayTask;

import java.util.Scanner;

public class StringPalllindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		String rev="";
		
		//logic for reverse the string
		for(int i=s.length()-1; i>=0;i--) {
			rev+=s.charAt(i);
		}
		
		//check if original string is equal or not to rev
		if(s.equals(rev)) {
			System.out.println("String is Pallindrom");
		}
		else {
			System.out.println("String is not Pallindrom");
		}

	}

}
