// Write a program to print Employee details by reading inputs diring runtime (or) execution time?

import java.util.Scanner;
class  EmployeeDetails
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee name");
		String s = sc.nextLine();
		System.out.println("Employee salary");
		int n = sc.nextInt();
		System.out.println("Employee attendence");
		Double d = sc.nextDouble();
		System.out.println("Employee rating");
		char ch = sc.next().CharAt(0);
		System.out.println("Employee promoted");
		boolean b = sc.nextboolean();
		System.out.println(s);
		System.out.println(n);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(b);

	}
}
