//Write a program to perform summation of numbers which has Odd digit in it between m and n and print the second largest digit of the summation value?


class  Summation
{
	public static void main(String[] args) 
	{
		int m = 10;
		int n = 20;
		int sum = 0;
		for (int i=m;i<=n;i++)
		{
			int k = i;
			while (k!=0)
			{
				int digit = k%10;
				if (digit%2!=0)
				{
					sum = sum+i;
					break;
				}
			    k = k/10;
			}
		}
		int largest = 0;
		int secondlargest = 0;
		while (sum!=0)
		{
			int digit = sum%10;
			if (digit>largest)
			{
				secondlargest = largest;
				largest = digit;
			}
			else if ((digit>=secondlargest) && (digit!=largest))
			{
				secondlargest = digit;
			}
			sum = sum/10;
		}
		System.out.println(secondlargest);
	}
}
