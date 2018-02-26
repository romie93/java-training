class AppendStringBuilder2 {
	
	public static void main ( String args[]) {
		StringBuilder sb1 = new StringBuilder ();
		sb1.append ("Java");
		System.out.println(sb1);

		Person p1 = new Person ("Oracle");
		System.out.println(p1);

		sb1.append (new Person("Oracle") );
		System.out.println(sb1);
	}
}

class Person {
	String name;
	Person (String str) {
	name = str;
	}
}