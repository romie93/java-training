class multiArr {

	public static void main (String args[]) {
		int [] multiArr [];
		multiArr = new int [2] [3];

		for (int i = 0; i<multiArr.length; i++) {

		   for (int j = 0; j<multiArr[i].length; j++) {
			multiArr [i] [j] = i+j;
			System.out.println (i+j + ":" + multiArr[i][j]);
			
		}
		}
	
	multiArr [0] [0] = 10;
	multiArr [1] [0] = 1210;
	multiArr [0] [0] = 110;
	multiArr [0] [0] = 1087;


		//int x[] = {1,2,3,4};
		//System.out.println (x[4]);		//can't access in the array

		int intArray[] = new int [2];
		System.out.println(intArray[-10]);
	}
}