class Numbers 
{
	public static void main(String[] args) 
	{
		int a = 25;
		int b = 35;
		int c = 20;
		int d = 48;
		int e = 17;
		int res = (a<b)&&(a<c)&&(a<d)&&(a<e)?"a is smallest"= "+a":(b<c)&&(b<d)&&(b<e)&&(b<a)?"b is smallest"="+b":(c<d)&&(c<e)&&(c<a)&&(c<b)?"c is smallest"="+c"  :(d<e)&&(d<a)&&(d<b)&&(d<c)?"d is smallest":"e is smallest";
		System.out.println(res);
	}
}
