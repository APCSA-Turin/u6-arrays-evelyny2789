public class LoopAlgorithms {
/** Returns a NEW array of Strings that contains all words from the original
   *  array of strings in lowercase (use the toLowerCase() string method)
   *
   *  This method does NOT modify the original array
   *  PRECONDITION: wordList.length > 0
   */
  public static String[] makeLowercase(String[] wordList) {
    String[] lower = new String[wordList.length];
    for (int i = 0; i < wordList.length; i++){
        lower[i] = wordList[i].toLowerCase(); 
    }
    return lower; 
  }


  /** Returns the number of Strings in stringList that have an exclamation point
   *  ("!") at the end.
   *
   *  This method does NOT modify the original array.
   *  PRECONDITION: stringList.length > 0
   */
  public static int endsInExclamations(String[] stringList) {
    int count = 0; 
    for (String str : stringList){
        String last = str.substring(str.length() - 1); 
        if (last.equals("!")){
            count++; 
        }
    }
    return count; 
  }


   /** Updates each String in the array to be all uppercase; this method does
   *  not return a value
   *
   *  This method MODIFIED the original array
   *  PRECONDITION: wordList.length > 0
   */
  public static void makeUppercase(String[] wordList){
    for (int i = 0; i < wordList.length; i++){
        wordList[i] = wordList[i].toUpperCase(); 
    }
  }


    /** Returns a NEW array of ints that contains the higher value of each pair
   *  of elements at the same index in two other equally-sized arrays of ints
   *  For example, if intArr1 = {2, 5, 6, 1, 0} and intArr2 = {1, 7, 6, -2, 8}, 
   *  this method returns the array {2, 7, 6, 1, 8}, where each value is the 
   *  higher of the two at that respective index in the two original arrays
   *
   *  This method does NOT modify either of the original arrays
   *  PRECONDITION: intArr1.length == intArr2.length
   */
  public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
    int[] greater = new int[intArr1.length]; 
    for (int i = 0; i < intArr1.length; i++){
        if (intArr1[i] > intArr2[i]){
            greater[i] = intArr1[i]; 
        } else {
            greater[i] = intArr2[i]; 
        }
    }
    return greater; 
  }


    /** Returns the number of elements in the numList array that have the same 
   *  value as the element immediately adjacent to the right in the array.
   *  
   *  For example, given the array {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
   *  this method would return 5, since there are five numbers in the array that
   *  are equal to the number immediately to the right (shown below in blue):
   *                    {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
   *
   *  This method does NOT modify the original array.
   *  PRECONDITION: numList.length > 0
   */
  public static int countConsecutiveDoubles(int[] numList) {
    int count = 0; 
    for (int i = 0; i < numList.length - 1; i++){
        if(numList[i] == numList[i+1]){
            count++; 
        }
    }
    return count; 
  }


    /** Returns the "longest streak" of the array; a streak is the number of times
   *  a particular number is repeated consecutively, one after the other
   *
   *  This method does NOT modify the original array.
   *  PRECONDITION: numList.length > 0
   */
  public static int longestStreak(int[] nums) {
    int longestStreak = 0; 
    for(int i = 0; i < nums.length; i++){
        int len = 1; 
        int ind = i; 
        while (ind < nums.length - 1 && nums[ind] == nums[ind + 1]){
            len++;
            ind++; 
        }
        if (len > longestStreak){
            longestStreak = len; 
        }
    }
    return longestStreak; 
  }

}
