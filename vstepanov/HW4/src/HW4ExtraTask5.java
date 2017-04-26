import java.util.Scanner;

public class HW4ExtraTask5 {
  public static void main(String[] args)   {

    Scanner in = new Scanner(System.in);


    // do {
      System.out.println("Hello! This is a simple calculator.");
      System.out.println("There are such base operations:");
      System.out.println("1-Summation");
      System.out.println("2-Subtraction");
      System.out.println("3-Division");
      System.out.println("4-Multiplication");
      System.out.println("Choose the operation:");

        int operation = in.nextInt();

        System.out.println("Enter first number");
        int input1 = in.nextInt();
        // System.out.println("Your input is " + input1);
        System.out.println("Enter 2 number");
        int input2 = in.nextInt();
        // System.out.println("Your input is " + input2);
    //     do {
    //       ignore = (int) in.nextInt();
    //     } while (ignore != '\n');
    //
    // } while (operation < 1  operation > 4);

    int  Summation = input1 + input2;
    int  Subtraction = input1 - input2;
    int  Division = input1 / input2;
    int  Multiplication = input1 * input2;

      // if (operation == 1) {
      // System.out.println(Summation);}
      //   else if (operation == 2) {
      // System.out.println(Subtraction);
      //   }
      //     else if (operation == 3) {
      // System.out.println(Division);
      //     }
      //       else if (operation == 4){
      // System.out.println(Multiplication);
      //       }
      //       else {
      // System.out.println("Please restart program and next time enter right number");
      //       }

    switch(operation) {
        case 1: System.out.println(input1 + " + " + input2 + " = " + Summation); break;
        case 2: System.out.println(input1 + " - " + input2 + " = " + Subtraction); break;
        case 3: System.out.println(input1 + " / " + input2 + " = " + Division); break;
        case 4: System.out.println(input1 + " * " + input2 + " = " + Multiplication); break;
        default:   System.out.println("Please restart program and next time enter right number");
            }


  }  // RELATE TO MAIN

}// RELATE TO General
