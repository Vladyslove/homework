public class LeapYear {

      public static void main(String[] args) {

      int a = 1999;
     while (a <= 2110) {

      if (LeapYear(a)) {
      System.out.println(a + " is a leap-year");
      }
      else {
        System.out.println(a+ " is not a leap-year");
      }
      a+=1;
    }

  } // RELATE TO MAIN

  public static boolean LeapYear (int num) {
    return num % 4 == 0 && num % 100 != 0 || num % 400 == 0;
  }

  public static boolean isLeapYear (int num) {
    return num % 400 == 0;
  }

} // RELATE TO Homework4
