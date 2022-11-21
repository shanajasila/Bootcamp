import java.util.Scanner;

public class Menudriven {
    public static void main(String args[]){
        System.out.println("menu:\n 1.Addition\n 2.Substraction\n 3.Multiplication\n4.Division");
        System.out.println("\nplease Select your option");
        Scanner sc=new Scanner(System.in);
        int menu= sc.nextInt();
        System.out.println("\nenter two numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();

        switch(menu){
            case 1:
                int c=a+b;
                System.out.println(a+" + "+b+"="+c);
                break;
            case 2:
                int s=a-b;
                System.out.println(a+" - "+b+"="+s);
                break;
            case 3:
                int m=a*b;
                System.out.println(a+" * "+b+"="+m);
                break;
            case 4:
                int d=a/b;
                System.out.println(a+" / "+b+"="+d);
                break;
            default:
                System.out.println("please select from given menu");
        }

    }
}
