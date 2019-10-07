class A{
		int x=10;
		static int y=20;
		void m1()
		{
		   int z=30;
		   System.out.println(z);
		   //System.out.println(x);
		   //System.out.println(y);
		}
		void m2()
		{
		  //System.out.println(z);
		  System.out.println(x);
		  System.out.println(y);
		}
}
		class Var {
			public static void main(String s[]){
			//System.out.println(x);
			//System.out.println(y);
			System.out.println(A.y);
			A a=new A();
			System.out.println(a.x);
			//System.out.println(A.z);
			//System.out.println(a.z);
		}
	}

