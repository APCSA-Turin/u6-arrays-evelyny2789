public class Payroll {
    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)
    
    /* Creates a Payroll object
     
       PRECONDITIONS: items != null, items.length >= 3
     * /
    public Payroll(int[] items) {
      itemsSold = items;
      wages = new double[items.length];
    }
   
    /*  Returns the bonus threshold as described in part (a).
     */
    public double computeBonusThreshold() {
        int min = itemsSold[0]; 
        int max = itemsSold[0]; 
        int sum = 0; 
        for (int i = 0; i < itemsSold.length; i++){
            if (itemsSold[i] < min){
                min = itemsSold[i];
            }
            if (itemsSold[i] > max){
                max = itemsSold[i]; 
            }
            sum+=itemsSold[i]; 
        }
        int divisor = itemsSold.length - 2; 
        double threshold = (double) (sum - max - min)/divisor; 
        return threshold;
    }
   
    /* Computes employee wages as described in part (b) and stores
       them in wages. The parameter fixedWage represents the fixed
       amount each employee is paid per day. The parameter
       perItemWage represents the amount each employee is paid per
       item sold.
     */
    public void computeWages(double fixedWage, double perItemWage) {
      double threshold = computeBonusThreshold(); 
      for (int i = 0; i < itemsSold.length; i++){
        wages[i] = fixedWage + perItemWage * itemsSold[i]; 
        if (wages[i] > threshold){
          wages[i] = wages[i] * 1.1; 
        }
      }
    }
  }
  
  
  