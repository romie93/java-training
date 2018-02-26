class StringEqual {

	public static void main (String args[]) {
		String x1 = "Japan";
		String x2 = "Japan";
		System.out.println ( x1 == x2 );	//comparing in same pool

		String x3 = new String ("Japan");
		String x4 = new String ("Japan");

		System.out.println ( x1 == x3 );	//comparing obj reference
		System.out.println ( x1.equals(x2) );
		System.out.println ( x3.equals(x4));	//comparing actual value of object


	}
}