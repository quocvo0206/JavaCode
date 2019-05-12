import java.util.*;
class InforClass{
	private String name;
	private String phone;
	private String status;

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getStatus(){
		return this.status;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getPhone(){
		return this.phone;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}
}

class Data{
	static String[][] data = {{"vo van quoc","0868379296","ok"},{"nguyen van b","09339443","Nok"}};
	static InforClass inforClass = new InforClass();
	static ArrayList<InforClass> list = new ArrayList<InforClass>();
	static boolean flag = true;
}

class SetInforClass implements Runnable{
	SetInforClass(){
		new Thread(this).start();
		}
	public void run(){
		while(Data.flag){
		String[][] arr = Data.data;
		System.out.println("Set Infor Class");
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				if(j == 0){
					Data.inforClass.setName(arr[i][j]);
				}
				if(j == 1){
					Data.inforClass.setStatus(arr[i][j]);
				}
				if(j == 2){
					Data.inforClass.setPhone(arr[i][j]);
				}
				
			}
			Data.list.add(Data.inforClass);
		}
		Data.flag = false;
		}
    }
	}

class GetInforClass implements Runnable{
	GetInforClass(){
		new Thread(this).start();
		}
	public void run(){
    	while(Data.flag){
			for(InforClass infor : Data.list){
				System.out.println("Name :" + infor.getName());
				System.out.println("Status :" + infor.getStatus());
				System.out.println("Phone :" + infor.getPhone());
				System.out.println("+++++++++++++++++++++++");
			}

			try {
		        Thread.sleep(10000);	
		    }
		    catch (InterruptedException ex) {
		    	ex.printStackTrace();
		    }
			Data.flag = true;
		}
    }
	}

class Main{
	public static void main(String[] ars){
		new SetInforClass();
		new GetInforClass();
	}
}
