public class ArrayAlgorithms {
    /** Returns the longest String(s) in an array of Strings.
   *  If multiple strings are tied for longest length, return the last
   *  element in the list with that length.
   *
   *  This method does NOT modify the original array.
   *  PRECONDITION: stringList.length > 0
   */
  public static String longestString(String[] stringList) {
    int maxLength = 0; 
    String maxString = ""; 
    for (String str : stringList){
        int len = str.length(); 
        if (len > maxLength){
            maxLength = len; 
            maxString = str; 
        }
    }
    return maxString; 
  }


  /** Returns true if ANY of the ints in numList are positive, otherwise, 
   *  returns false; use an early return to improve efficiency
   *  note: 0 is not considered positive
   *
   *  This method does NOT modify the original array.
   *  PRECONDITION: numList.length > 0
   */
  public static boolean containsPositive(int[] numList) {
    // IMPLEMENT ME using an enhanced for loop and early return
    for (int num : numList){
        if (num > 0){
            return true; 
        }
    }
    return false; 
  }

}
