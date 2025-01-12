public class Vocab {
  /* The controlled vocabulary for a Vocab object.
   */
  private String[] theVocab;
  
  public Vocab(String[] vocab) {
    theVocab = vocab;
  }
  
  /* Searches for a string in theVocab. Returns true if its String 
     parameter str is an exact match to an element in theVocab and
     returns false otherwise.
   */
  public boolean findWord(String str) {
    for (int i = 0; i < theVocab.length; i++){
        if (theVocab[i].equals(str)){
            return true; 
        } 
    }
    return false; 
  }
  
  /* Counts how many strings in wordArray are not found in theVocab,
    as described in part (a).


    PRECONDITION: wordArray contains no duplicates
   */
  public int countNotInVocab(String[] wordArray) {
    int count = 0; 
    for (int i = 0; i < wordArray.length; i++){
        if (!findWord(wordArray[i])){
            count++; 
        }
    }
    return count; 
  }
  
  /* Returns an array containing strings from wordArray not found in
    theVocab, as described in part (b).


    PRECONDITION: wordArray contains no duplicates
   */
  public String[] notInVocab(String[] wordArray) {
    String notInVocab[] = new String [countNotInVocab(wordArray)]; 
    int ind = 0; 
    for (int i = 0; i < wordArray.length; i++){
      if (!findWord(wordArray[i]){
        notInVocab[ind] = wordArray[i]; 
        ind++; 
      }
    }
  }
}
