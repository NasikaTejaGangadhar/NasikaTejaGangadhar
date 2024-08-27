// Write a program which accepts the marks of a student into a 1D array from the keyboard and finds total marks and percentage?

import java.io.*;
class  Arrays
{
	public static void main(String[] args) 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many subjects?");
		int n = Integer.parseInt(br.readLine());
		int[] marks = new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter marks: ");
			marks[i] = Integer.parseInt(br.readLine());
		}
		int total = 0;
		for (int i=0;i<n;i++)
		{
			total = total+marks[i];
		}
		System.out.println(total);
		float percentage = (float)total/n;
		System.out.println(percentage);
	}
}
