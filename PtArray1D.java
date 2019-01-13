class PtArray1D{
	public static void main(String[] ars){
		int s = 0;
		int[] n = new int[5];
		n[0] = 10;
		n[1] = 20;
		n[2] = 30;
		n[3] = 40;
		n[4] = 50;
	for(int i = 0; i < n.length; i++){
		System.out.print(" " + n[i] + " ");
		s = s + n[i];
	}
	System.out.println("Sum is: "+ s);
 	}
}