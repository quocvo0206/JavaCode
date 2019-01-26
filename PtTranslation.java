class PtTranslation{
	public static void main(String[] arr){
								String ketQua = "";
		    					String[][] tudien=	{{"a", "ka"},
    									 			{"b", "zu"}, 
    												{"c", "mi"}, 
    												{"d", "te"},
				            						{"e", "ku"}, 
				            						{"f", "lu"},
				            						{"g", "li"}, 
				            						{"h", "ri"}, 
				            						{"i", "ki"}, 
				            						{"j", "zu"},
				            						{"k", "mi"},
				            						{"l", "ta"}, 
				            						{"m", "rin"},
				            						{"n", "ta"}, 
				            						{"o", "mo"},
				            						{"p", "no"},
													{"q", "ke"}, 
													{"r", "shi"}, 
													{"s", "ari"}, 
													{"t", "chi"}, 
													{"u", "du"}, 
													{"v", "ru"},
													{"w", ",mei"},
													{"x", "na"},
													{"y", "fu"}, 
													{"z", "z"} };
	for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length(); j++){
				for(int k = 0; k < tudien.length ; k++){
					if(String.valueOf(arr[i].charAt(j)).equals(tudien[k][0])){
						ketQua = ketQua + tudien[k][1];
						break;
					}
					if(String.valueOf(arr[i].charAt(j)).equals(" ")){
						ketQua = ketQua + " ";
						break;
					}
				}
			}		
	System.out.println(arr[i]+ " is: " + ketQua);
	ketQua = "";
	}
	}
}