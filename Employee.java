public class Employee{
	
	public static void main(String[] args){
		System.out.println("Hii ...");
		System.out.println("Bye ...");
		System.out.println("Third line ...");
	}

	public void sum(){
	   int a = 10;
	   int b = 20;
	   int c = a + b;
	   System.out.println(c);
	   System.out.println("Bye");
	   System.out.println("Sum method executed ...");
	}

	public void sub(){
	   int a = 10;
	   int b = 20;
	   int c = a - b;
	   System.out.println(c);
	   System.out.println("Bye");
	   System.out.println("Sub method executed ...");
	}

	public void div(){
	   int a = 10;
	   int b = 20;
	   int c = a / b;
	   System.out.println(c);
	   System.out.println("Bye");
	   System.out.println("Div method executed ...");
	}

	public void mul(){
	   int a = 10;
	   int b = 20;
	   int c = a * b;
	   System.out.println(c);
	   System.out.println("Bye");
	   System.out.println("Multiplication method executed ...");
	}

	public void mod(){
	   int a = 10;
	   int b = 20;
	   int c = a % b;
	   System.out.println(c);
	   System.out.println("Bye");
	   System.out.println("Mod method executed ...");
	}

	public void abs(){
	   int a = -10;
	   int c = Math.abs(a);
	   System.out.println(c);
	   System.out.println("Bye");
	   System.out.println("Abs method executed ...");
	}

	public void sqrt(){
	   int a = 10;
	   double c = Math.sqrt(a);
	   System.out.println(c);
	   System.out.println("Bye");
	   System.out.println("Sqrt method executed ...");
	}

	public void pow(){
	   int d = 10;
	   int e = 20;
	   double c = Math.pow(d, e);
	   System.out.println(c);
	}
}