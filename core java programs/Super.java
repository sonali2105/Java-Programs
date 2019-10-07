class A {
		int x=2;
		void m1() {
		System.out.println("I am super class");
		}
	}
	class B extends A{
		int x=6;
		void m2() {
		int x=7;
		System.out.println(super.x);
		System.out.println(this.x);
		System.out.println(x);
		}
	}
	class Super{
	public static void main(String s[]) {
	B b=new B();
	b.m2();
	System.out.println(b.x);
	//System.out.println(b.super.x);
	}
}