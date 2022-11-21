import java.util.Scanner;

public class Menudriven {
    public static void main(String args[]) {
        while (true) {
            System.out.println("please Select your option");
            System.out.println("menu:\n 1.Addition\n 2.Substraction\n 3.Multiplication\n4.Division\n 5.Exit");
            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("enter two numbers");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = a + b;
                    System.out.println(a + " + " + b + "=" + c);
                    break;
                case 2:
                    System.out.println("enter two numbers");
                    int a1 = sc.nextInt();
                    int b1 = sc.nextInt();
                    int s = a1 - b1;
                    System.out.println(a1 + " - " + b1 + "=" + s);
                    break;
                case 3:
                    System.out.println("enter two numbers");
                    int a2 = sc.nextInt();
                    int b2 = sc.nextInt();
                    int m = a2 * b2;
                    System.out.println(a2 + " * " + b2 + "=" + m);
                    break;
                case 4:
                    System.out.println("enter two numbers");
                    int a3 = sc.nextInt();
                    int b3 = sc.nextInt();
                    int d = a3 / b3;
                    System.out.println(a3 + " / " + b3 + "=" + d);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("please select from given menu");
            }
        }

        }
}
