import java.util.Arrays;
public class ArrayCopier {
  int [] startArray;
  public static void main(String[] args) {

    int [] startArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    ArrayCopier arrayOfConstr = new ArrayCopier(startArray);

    System.out.println(Arrays.toString(arrayOfConstr.copyOf(22))
    + "      Wrong input! 22 is more than startArray.length ");
    System.out.println(Arrays.toString(arrayOfConstr.copyOf(3))
    + "      Good. Copied first three elements of startArray");
    System.out.println(Arrays.toString(arrayOfConstr.copyOfRange(3, 7))
     + "       Good. Copied five elements of startArray from forth to eights element");
    System.out.println(Arrays.toString(arrayOfConstr.copyOfRange(6, 4))
     + "      Unacceptable value of argement 'to'! It must be more than argement 'from' ");
    System.out.println(Arrays.toString(arrayOfConstr.fill(3)));
    System.out.println(Arrays.toString(startArray)
    + "      Out start/incoming array");
  } // main

  public ArrayCopier(int [] arrayOfConstr) {
    startArray = arrayOfConstr;
  } // constructor, which take
    //array of integers as an argument

  public int[] copyOf (int newLength) {
    if (newLength > startArray.length) return null;
    int [] newArray = new int[newLength];
    for (int i = 0; i < newArray.length ;i++ ) {
      newArray[i] = startArray[i];
      // newArray[i] = startArray[i*2+2]; // just practice
    }
    return newArray;
  } // return array of indicated range

  public int[] copyOfRange (int from, int to) {
    if (to < from || to >= startArray.length || to < 0 || from < 0) return null;
    int[] newArray2 = new int [to-from+1];
    for (int i = 0; i < newArray2.length ;i++ ) {
      newArray2[i] = startArray[from + i];

    }
    return newArray2;
  } // return new array starting from element "from" to element "to"

  public int[] fill (int value) {

  int[] newArray3 = new int [startArray.length];
  for (int i = 0; i < newArray3.length ;i++ ) {
      newArray3[i] = value;
  }
  return  newArray3;
}  // return new array filled of value of argument "value"

} // java
