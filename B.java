class  B
{
	public static void main(String[] args)
	{ 
		int a=9;
	    int b=9;
		int c=9;
		a=c++ + b++ + a++  ;
		System.out.println(a);
		b=c-- + b-- + a--;
		System.out.println(b);
		c= a-- + --b + ++c + ++b;
		System.out.println(c); c

		
	}

}