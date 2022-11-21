import java.util.Scanner;

public class Menudriven {
    public static void main(String args[]){
        System.out.println("enter two numbers");
        Scanner sc=new Scanner(System.in);
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        System.out.println("please Select your option");
        System.out.println("menu:\n 1.Addition\n 2.Substraction\n 3.Multiplication\n4.Division");
        int menu= sc.nextInt();
        switch(menu){
            case 1:
                float c=a+b;
                System.out.println(a+" + "+b+"="+c);
                break;
            case 2:
                float s=a-b;
                System.out.println(a+" - "+b+"="+s);
                break;
            case 3:
                float m=a*b;
                System.out.println(a+" * "+b+"="+m);
                break;
        }

    }
}
