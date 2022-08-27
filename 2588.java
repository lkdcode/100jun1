import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b,c,d,e;
        a = scan.nextInt();
        b = scan.nextInt();
        c = b%10;
        d = (b/10)%10;
        e = b/100;
        
        System.out.printf("%d\n",a*c);
        System.out.printf("%d\n",a*d);
        System.out.printf("%d\n",a*e);
        System.out.printf("%d\n",a*b);
        
    }
}