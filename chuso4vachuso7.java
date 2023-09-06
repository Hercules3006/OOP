import java.util.Scanner;
public class chuso4vachuso7 {
    public static Scanner ip= new Scanner(System.in);
    public static void testCase(){
        long n=ip.nextLong();
        int cnt=0;
        while(n>0){
            long digit =n%10;
            if(digit==4||digit==7){
                cnt++;
            }
            n/=10;
        }
        if(cnt==4||cnt==7){
            System.out.println("YES");

        }
        else 
         System.out.println("NO");
    }
    public static void main(String[] args) {
            testCase();   
    }
}