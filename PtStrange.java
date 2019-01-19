class PtStrange {
	public static void main(String[] ars){
		int h = Integer.parseInt(ars[0]);
		if(h >= 2 && h <= 24){
			for(int i = 0; i < h; i++ ){
				for(int j = 0; j < i; j++){
					System.out.print("*");
				}
				System.out.println("");
			}
		} else{
			System.out.print("Enter value of h: ");
		}
	}
}