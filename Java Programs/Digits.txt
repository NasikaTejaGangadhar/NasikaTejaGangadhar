// Write a program to print summation of largest digit and smallest digit of a given number?


class  Digits
{
	public static void main(String[] args) 
	{
		int n = 1234;
		int smallest = 9;
		int largest = 0;
		int sum = 0;
		while (n!=0)
		{
			int digit = n%10;
			if (digit<smallest)
			{
				smallest = digit;
			}
			if (digit>largest)
			{
				largest = digit;
			}
			n = n/10;
		}
		sum = smallest + largest;
		System.out.println(sum);
	}
}
