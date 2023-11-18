class Sample1{
	Sample1(Object o){
		System.out.println("Object Class");
		}
	Sample1(String s){
		System.out.println("String Class");
		}
	public static void main(String args[])
	{
		//Sample1 obj1 = new Sample1
		new Sample1();
		Sample1 obj2 = new Sample1("Christ");
		Sample1 onj3 = new Sample1(null);
	}
}
