import java.util.Scanner;
class Demo{
        public static void main(String []args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number:");
                int num1 = sc.nextInt();

		 System.out.println("Enter the number:");
                int num2 = sc.nextInt();
                if(num1>num2){
                        System.out.println(num1+" is max bet "+num1+","+num2);
                }else{
                        System.out.println(num2+" is max bet "+num1+","+num2);
                }
        }
}
