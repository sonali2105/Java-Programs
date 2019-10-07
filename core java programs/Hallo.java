class A {
		int x;
		String y;
		public void show() {
		System.out.println(x+y);
		}
		static {
		System.out.println("Hello");
		}
		A(int a,String b) {
		System.out.println("Hi");
		x=a;
		y=b;
		}
	}
	class Hallo{
	public static void main(String s[]) {
	A a=new A(4,"yoyo");
	A b=new A(2,"Lalu");
	//A c=new A();
	a.show();
	b.show();
	//c.show();
	}
}
	