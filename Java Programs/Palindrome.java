// Write a program to perform summation of numbers from 1 to 10 and check whether summation is palindrome (or) not?

import java.util.Scanner;
class  Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("m value");
		int m = sc.nextInt();
		System.out.println("n value");
		int n = sc.nextInt();
		int sum = 0;
		for (int i=m;i<=n;i++)
		{
			sum = sum+i;
		}
		System.out.println(sum);
		int k = sum;
		int reverse = 0;
		while (k!=0)
		{
			int digit = k%10;
			reverse = reverse*10+digit;
			k = k/10;
		}
		if (reverse==sum)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
	}
}