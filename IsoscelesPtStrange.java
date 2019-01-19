class IsoscelesPtStrange{
	public static void main(String[] ars){
		int h = Integer.parseInt(ars[0]);
		if(h >= 2 && h <= 24){
			int n = h;
			for(int i = 0; i < h ; i++){
				for(int k = n - 1; k >0; k--){
					System.out.print("  ");
				}
				for(int j = 0 ; j < 2*i +1 ; j++){
					System.out.print(" *");
				}
				System.out.println(" ");
				n--;
			}
		}
	}
}