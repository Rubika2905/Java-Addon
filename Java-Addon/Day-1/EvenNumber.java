import java.util.*;
public class EvenNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Starting value");
        int a=in.nextInt();
        System.out.println("Enter the ending value");
        int b=in.nextInt();
        for(int i=a;i<b;i++) {
            if(i%2==0){
                System.out.println(i);
                
            }
          
        }
        
    }
}