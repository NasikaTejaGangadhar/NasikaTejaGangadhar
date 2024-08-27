class  Numbers2
{
	public static void main(String[] args) 
	{
		int [] num = {10,39,46,8,75};
		int largest = num[0];
		int smallest = num[0];
		for (int i=1;i<num.length;i++)
		{
			if (num[i]>largest)
			{
				largest=num[i];
			}
			else if (num[i]<smallest)
			{
				smallest=num[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
	}
}
