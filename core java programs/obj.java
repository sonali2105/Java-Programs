class obj{
		static public void main(String s[]){
		Emp a=new Emp();
		Emp b=new Emp();
		Emp c=new Emp();
		Emp d=new Emp();
		a.input("Ramkumar",9800,"ABC");
		a.show();
		b.input("Ramesh",5600,"HCL");
		b.show();
		c.input("Lokesh",4500,"HAWELI");
		c.show();
		d.input("Harsh",890000,"OWN");
		d.show();
		
		}
	}
class  Emp{
		String name;
		int salary;
		String cname;
		void input(String n,int s,String c){
			name=n;
			salary=s;
			cname=c;
		}
		void show()
		{
			System.out.println(name+" "+salary+" "+cname);
		}
	}