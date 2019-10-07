class A {
		int x=67;
		void display(int x) {
		this.x=x;
		System.out.println(this.x);
		System.out.println(x);
		}
	}
	class C{
	public static void main(String s[]) {
	A a1=new A();
	a1.display(3);
	System.out.println(a1.x);
	}
}
