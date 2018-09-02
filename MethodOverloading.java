class data{
	int max(int num1,int num2){
		if(num1>num2){
			return num1;
		}
		else{
			return num2;
		}
	}
	
	int max(int num1,int num2,int num3){
		System.out.println("For three parameters:");
		int result =num1+num2+num3;
		return result;
	}
	
	double max(double num1,double num2){
		if(num1>num2){
			return num1;
		}
		else{
			return num2;
		}
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data number=new data();
	    System.out.println("The maximum number is :"+number.max(2,33));
	    System.out.println("The maximum number is :"+number.max(2.2,3.3));
	    System.out.println("The addition of the three number is :"+number.max(22,33,44));

	}

}
