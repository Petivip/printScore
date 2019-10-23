import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an exam score:" );
        double score = scan.nextDouble();

       while (true) {
           if (score >= 97 && score <= 100)
               System.out.println("Excellent job. Your grade is A+.");
           else if (score >= 94 && score <= 96)
               System.out.println("Excellent job. Your grade is A");
           else if (score >= 90 && score <= 93)
               System.out.println("Excellent job. Your grade is A-");
           else if (score >= 87 && score <= 89)
               System.out.println("Good job. Your grade is B+");
           else if (score >= 84 && score <= 86)
               System.out.println("Good job. Your grade is B");
           else if (score >= 80 && score <= 83)
               System.out.println("Good job. Your grade is B-");
           else if (score >= 77 && score <= 79)
               System.out.println("Nice job. Your grade is c+");
           else if (score >= 74 && score <= 76)
               System.out.println("Nice job. Your grade is c");
           else if (score >= 70 && score <= 73)
               System.out.println("Nice job. Your grade is c-");
           else if (score >= 60 && score <= 69)
               System.out.println("Your grade is D");
           else {


               System.out.println("Go back to School");

           }
           System.out.println("Do you want to enter another score (Y/N)?");
           String key = scan.next();
           if (key.equals("y")) {
               System.out.print("Enter an exam score:");
               score = scan.nextDouble();
           }else{
               break;
           }
       }
    }
}