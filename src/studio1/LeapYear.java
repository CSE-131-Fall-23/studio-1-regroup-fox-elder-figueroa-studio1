package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		boolean leapyear;
		leapyear=((n1%4 == 0 && n1%100 != 0) || (n1%400 == 0));
		System.out.print(leapyear);
	}

}
