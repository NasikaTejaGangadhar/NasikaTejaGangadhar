import java.io.*;
class Arrays2 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		System.out.print("How Many Subjects? ");
		int n = Integer.parseInt(br.readLine());
		int [] marks = new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.print("Enter Marks");
			marks[i] = Integer.parseInt(br.readLine());
		}
		int total = 0;
		for (int i=0;i<n;i++)
		{
			total = total+marks[i];
		}
			System.out.println("Total marks= "+total);
			float percentage = total/n;
			System.out.println("Percentage "+ percentage);
	}
}