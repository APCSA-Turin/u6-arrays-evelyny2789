package U6T2_Lab1;

public class Main {
    public static void main(String[] args){

        // Person person1 = new Person("Bob", 21); 
        // Person person2 = new Person("Nancy", 17); 
        // Person person3 = new Person("Tim", 16); 
        // Person person4 = new Person("Andrew", 18); 
        // Person person5 = new Person("Sarah", 19); 
        // Person[] people = {person1, person2, person3, person4, person5};

        // ArrayAlgorithms.introduceAdults(people); 

        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {10, 11, 12, 13, 14, 15, 16, 17};
        int[] combined = ArrayAlgorithms.combine(nums1, nums2);
        for (int i = 0; i < combined.length; i++) {
            System.out.print(combined[i] + " ");
        }
        System.out.println();
        System.out.println("combined list has " + combined.length + " elements");

        int[] nums3 = {5, 8, 6, 2};
        int[] nums4 = {1, 7, 10, 0, 9};
        int[] combined2 = ArrayAlgorithms.combine(nums3, nums4);
        for (int i = 0; i < combined2.length; i++) {
            System.out.print(combined2[i] + " ");
        }
        System.out.println();
        System.out.println("combined list has " + combined2.length + " elements");

    }
}
