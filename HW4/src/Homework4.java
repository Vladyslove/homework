public class Homework4 {



      public static void main(String[] args) {

        //    First part of HW4 - Variables
        int tni = 1;
        float taolf = 10.21234f;
        String gnirtS = "Assalam aleikum";
        System.out.println(tni);
        System.out.println(taolf);
        System.out.println(gnirtS);

        //   Second part of HW4 -Class method(function) creating and calling
        //   Item A

            // WRONG, WRONG and one more time WRONG
        // System.out.print("hello ");
        // System.out.print("hello ");
        // System.out.print("hello ");
        // System.out.print("hello ");
        // System.out.print("hello ");


        // WRONG, WRONG and one more time WRONG
        //   Item B

        // System.out.println("");
        //
        // for (int i = 1; i <=5 ; i++ ) {
        //     System.out.print("hello "); }
        //
        // System.out.println("");


          // Thirt part of HW4 -task about leap-year.
          //Full version with for any year

      int a = 1999;
     while (a <= 2001) {

      if (notLeapYear(a)) {
      System.out.println(a + " is NOT a leap-year");

          if (isLeapYear (a)){
            System.out.println("        ^^^");
      System.out.println("Error! Who is written this program? Of course "
                  + a + " IS A LEAP-YEAR!");
            System.out.println("");
          }
          else;
      }
      else {
        System.out.println(a+ " is  a leap-year");
      }
      a+=1;
    }

            // Fourth part of HW4 -task about unlimited loop

        int b = 99;
        do {
          System.out.println("It seems that I'm here forever");
          if (b < 0) {
            break;
          }
            b-=33;
        } while (true);



        // RELATE to 2 part of HW4
        //   Item A
        Homework4.OutputString();
        Homework4.OutputString();
        Homework4.OutputString();
        Homework4.OutputString();
        Homework4.OutputString();


          //   Item B
          System.out.println();
          System.out.println("Compare line above and below this line. They must be equal.");


        for (int c = 1; c <= 5 ;c++ ) {
          Homework4.OutputString();
        }

 } // RELATE TO MAIN

    // RELATE to 2 part of HW4
    static void OutputString () {
      System.out.print("Hi ");
    }

  // Thirt part of HW4 -task about leap-year. Continue

  public static boolean notLeapYear (int num) {
    return num % 4 != 0 || num % 100 == 0;
  }

  // I don't realise how resolve this part of task
  public static boolean isLeapYear (int num) {
    return num % 400 == 0;
  }

} // RELATE TO Homework4
