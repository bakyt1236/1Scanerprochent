import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=a/10000;
        int c=(a/1000)%10;
        int d=(a/100)%10;
        int e=(a/10)%10;
        int f=a%10;
        System.out.println(b+","+c+","+d+","+e+","+f);

    }

}