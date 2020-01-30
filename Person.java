
public class Person {
	private String name;
	private int age;

	public Person() // default constructor
	{
		this("Anonymaus", -1);
		// Constructor calling another constructor_constructor chaining

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("Name:" + name + "\tAge:" + age);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name :" + name + "\tAge" + age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (p.name.equals(this.name) && p.age == this.age)
				return true;
		}
		return false;
	}

	@Override
	protected void finalize() throws Throwable {// cleanup operation
		// TODO Auto-generated method stub
		System.out.println("person is no more");
	}
	/*
	 * public static void main(String[]args) {
	 * 
	 * Person p1= new Person("Polo",21); p1.print();
	 * System.out.println(p1.hashCode()); System.out.println(p1);//implicitly calls
	 * toString() Person p2= new Person("Polo",21);
	 * System.out.println(p1.equals(p2));//equals() compares hashcodes of objects
	 * //p2.print();
	 * 
	 * Person p=null; for(int c=1;c<5;c++) p=new Person(); System.gc(); }
	 */
}
