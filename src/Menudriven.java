import java.util.Scanner;

public class Menudriven {
    public static void main(String args[]){
        System.out.println("enter two numbers");
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        System.out.println("please Select your option");
        System.out.println("menu: 1.Addition\n 2.Substraction\n 3.Multiplication\n4.Division");
        int menu= sc.nextInt();
        switch(menu){
            case 1:
                double c=a+b;
                System.out.println(a+"+"+b+"="+c);
                break;
            case 2:
                double s=a-b;
                System.out.println(a+"-"+b+"="+s);
                break;
        }

    }
}
