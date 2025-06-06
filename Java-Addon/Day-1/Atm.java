import java.util.Scanner;
class Atm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your pin:");
        
        int pin=in.nextInt();
         if(pin == 1234){
        System.out.println("Enter your Amount:");
        int amount=in.nextInt();
            if(amount <= 5000){
                System.out.println("Amount withdraw successfuly");
            }
                else{
                    System.out.println("Insufficient");
                }
        }
        else{
            System.out.println("Pin invalid");
        }
    }
}