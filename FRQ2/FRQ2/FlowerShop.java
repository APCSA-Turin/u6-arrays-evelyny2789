import java.util.Arrays;
import java.util.Collections;

public class FlowerShop
{
/** An array of the flowers sold at the flower shop, guaranteed to be
    nonempty and to contain only non-null entries. The entries in
    this array are not in any specific order.
  */
private Flower[] flowerInventory;

/** Returns a copy of Flower[] arr in which the array elements
    have been sorted in order from highest quantity to lowest
    quantity
  */
  public FlowerShop(Flower[] flowerInventory) {
    this.flowerInventory = flowerInventory;
}


// ADDED TO ENABLE TESTING
public Flower[] getFlowerInventory() {
    return flowerInventory;
}


// IMPLEMENTATION ADDED TO ENABLE TESTING
public Flower[] sortByQuantity(Flower[] arr) {
    Flower[] sortedCopy = new Flower[arr.length];
    for (int i = 0; i < sortedCopy.length; i++) {
        sortedCopy[i]= arr[i];
    }
    Arrays.sort(sortedCopy); // sorts low to high (increasing) based on quantity
    Collections.reverse(Arrays.asList(sortedCopy)); // reverses to sort in decreasing order
    return sortedCopy;
}


/** Updates the Flower objects contained in flowerInventory, as
    described in part (a)
  
    Precondition: newInventory has the same flower names in the same
                  positions as flowerInventory.
    Postcondition: newInventory is unchanged.
  */
public void updateInventory(Flower[] newInventory){
  for (int i = 0; i < flowerInventory.length; i++){
    Flower flower = flowerInventory[i]; 
    Flower newFlower = newInventory[i]; 
    int newInv = flower.getQuantity() + newFlower.getQuantity(); 
    flower.setQuantity(newInv); 
  }
}

/** Returns true if the top n flowers by quantity in stock at the
    flower shop are the same as the top n flowers by quantity in
    stock in otherInventory, as described in part (b)
    
    Precondition: n is less than or equal to the lengths of
    flowerInventory and otherInventory.
    Postcondition: flowerInventory and otherInventory are unchanged.
  */
public boolean topNSame(int n, Flower[] otherInventory){
  Flower[] sortFlower = sortByQuantity(flowerInventory); 
  Flower[] sortOther = sortByQuantity(otherInventory); 
  for (int i = 0; i < n; i++){
     if (!sortFlower[i].getName().equals(sortOther[i].getName())){
        return false; 
     }
  }
  return true;

}

// There may be instance variables, constructors, and methods
// that are not shown.
}
