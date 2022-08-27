import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        
        System.out.printf("%d\n",(a+b)%c);
        System.out.printf("%d\n",((a%c)+(b%c))%c);
        System.out.printf("%d\n",(a*b)%c);
        System.out.printf("%d\n",((a%c)*(b%c))%c);
    }
}