import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int Num = scanner.nextInt();
        scanner.close();

        if (Num == 1) {
            System.out.println("January");
        } else if (Num == 2) {
            System.out.println("February");
        } else if (Num == 3) {
            System.out.println("March");
        } else if (Num == 4) {
            System.out.println("April");
        } else if (Num == 5) {
            System.out.println("May");
        } else if (Num == 6) {
            System.out.println("June");
        } else if (Num == 7) {
            System.out.println("July");
        } else if (Num == 8) {
            System.out.println("August");
        } else if (Num == 9) {
            System.out.println("September");
        } else if (Num== 10) {
            System.out.println("October");
        } else if (Num == 11) {
            System.out.println("November");
        } else if (Num == 12) {
            System.out.println("December");
        } else {
            System.out.println("invalid month");
        }
    }
}

