public class BitwiseCalc {

  public static void main(String[] args) {
  BitwiseCalc operAnd = new BitwiseCalc();
  BitwiseCalc operOr = new BitwiseCalc();
  BitwiseCalc operXor = new BitwiseCalc();
  BitwiseCalc operNot = new BitwiseCalc();

  String binaryLeft1 =  "110011";
  String binaryRight1 = "100111";
  System.out.println(operAnd.and(binaryLeft1, binaryRight1)+" is result of "
  +"Bitwise AND/logical AND of: " + binaryLeft1 + ", " + binaryRight1);
  System.out.println(operOr.or(binaryLeft1, binaryRight1) + " is result of "
  + "Bitwise OR/logical inclusive OR of: " + binaryLeft1 + ", " + binaryRight1);
  System.out.println(operXor.xor(binaryLeft1, binaryRight1) + " is result of "
  + "Bitwise XOR/logical exclusive OR of: " + binaryLeft1 + ", " + binaryRight1);
  System.out.println(operNot.not(binaryLeft1, binaryRight1) + " is result of "
  + "Bitwise NOT/logical negation: " + binaryLeft1 + ", " + binaryRight1);

  } // main

  public String and(String binaryLeft, String binaryRight) {
    String res = "";
    for (int i = 0; i < binaryLeft.length(); i++ ) {
      if (binaryLeft.charAt(i) == '1' && binaryRight.charAt(i) == '1') {
        // res += "1";
        res = res + "1";
      } // if
      else {
        // res += "0";
        res = res + "0";
      }
    } //for
    return res;
  } // and

  public String or(String binaryLeft, String binaryRight) {
    String res = "";
    for (int i = 0; i < binaryLeft.length() ;i++ ) {
      if (binaryLeft.charAt(i) == '1' || binaryRight.charAt(i) == '1') {
        res += "1";
      } else {
        res += "0";
      }
    }
    return res;
    }

  public String xor(String binaryLeft, String binaryRight) {
    String res = "";
    for (int i = 0; i < binaryLeft.length() ;i++ ) {
      if (binaryLeft.charAt(i) == '1' && binaryRight.charAt(i) != '1'
      || (binaryLeft.charAt(i) != '1' && binaryRight.charAt(i) == '1') ) {
        res += "1";
      } else {
        res += "0";
      }
    }
    return res;
    }

  public String not(String binaryLeft, String binaryRight) {
    String res = "";
    for (int i = 0; i < binaryLeft.length() ;i++ ) {
      if (binaryLeft.charAt(i) == '1') {
        res += "0";
      } else {
        res += "1";
      }
    }
    return res;
    }
  } //java
