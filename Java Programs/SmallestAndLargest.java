import java.util.Scanner;
class  SmallestAndLargest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		System.out.println("Enter 5 numbers");
		for (int i = 0;i < 5;i++)
		{
			numbers[i] = sc.nextInt();
		}
		int largest = numbers[0];
		int smallest = numbers[0];
		for (int i = 1;i < 5 ; i++)
		{
			largest = (numbers[i] > largest) ? numbers[i] : largest;
			smallest = (numbers[i] < smallest) ? numbers[i] : smallest;
		}
		System.out.println("Largest number: "+ largest);
		System.out.println("Smallest number: "+ smallest);
		sc.close();
	}
}
