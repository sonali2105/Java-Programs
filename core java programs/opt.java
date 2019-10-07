class opt{
		public static void main(String s[]) {
		int a=10,b;
		b=++a+a+a--;
		System.out.println(a);
		System.out.println(b);
		b=--a+a++-++a;
		System.out.println(a);
		System.out.println(b);
		int c;
		b=5;
		c=++b*a--%a++ - ++b/a+ --a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		}
	}