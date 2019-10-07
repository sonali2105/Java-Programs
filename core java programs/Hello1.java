class Emp{
		private String name;
		private int salary;
		private String cname;
		public void input(String n,int s,String c)
		{  name=n;
		   salary=s;
		   cname=c;
		}
		void show()
		{
		System.out.println(name+" "+salary+" "+cname);
		}
}
class Hello1 {
		static public void main(String s[]) {
		Emp a=new Emp();
		Emp b=new Emp();
		Emp c=new Emp();
		Emp d=new Emp();
		a.show();
		b.show();
		c.show();
		d.show();
	}
}
		
		