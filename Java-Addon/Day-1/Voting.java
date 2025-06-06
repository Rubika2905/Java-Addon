import java.util.*;
class Voting {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner ref=new Scanner(System.in);
        int a = ref.nextInt();
        System.out.println(a);
        if(a>=18){
        System.out.println("Your Eligible for voting");}
        else
        System.out.println("Your not eligible for voting");
        
    }
}