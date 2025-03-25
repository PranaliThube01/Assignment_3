import java.util.Scanner;
class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int num = sc.nextInt();
		if(num>=0){
			System.out.println(num + "positive number");
		}else{
		      	System.out.println(num + "negative number");
		}
	}
}

