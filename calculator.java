package src;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Press 1 to use calculator\nPress 2 to exit");
        int num=scanner.nextInt();
        if(num==1){
            System.out.println("1:ADD\n2:SUBTRACT\n3:MULTIPLY\n4:DIVIDE");
            int num2=scanner.nextInt();
            if(num2==1){
                System.out.println("Enter first number");
                int first1=scanner.nextInt();
                System.out.println("Enter second number");
                int second1=scanner.nextInt();
                int add1=first1+second1;
                System.out.println("Addition of given numbers is: "+ add1);

            }
            else if(num2==2){
                System.out.println("Enter first number");
                int first2=scanner.nextInt();
                System.out.println("Enter second number");
                int second2=scanner.nextInt();
                int add2=first2-second2;
                System.out.println("Subtraction of given numbers is: "+ add2); 
            }
            else if(num2==3){
                System.out.println("Enter first number");
                int first3=scanner.nextInt();
                System.out.println("Enter second number");
                int second3=scanner.nextInt();
                int add3=first3*second3;
                System.out.println("Multiplication of given numbers is: "+ add3);
            }
            else if(num2==4){
                System.out.println("Enter first number");
                double first4=scanner.nextInt();
                System.out.println("Enter second number");
                double second4=scanner.nextInt();
                double add4=first4/second4;
                System.out.println("Division of given numbers is: "+ add4);
            }
            else{
                System.out.println("Invalid button");
            }
            }
            else if(num==2){
                System.out.println("Thanku for using my calculator");
            }
            else{
                System.out.println("Invalid button");
            }
            scanner.close();
        }
        }

