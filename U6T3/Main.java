public class Main {
    public static void main(String[] args){
        String[] names = {"Mateo", "Sofia", "David", "Ziggy", "Charlie"};
        for (String name : names){
            System.out.println(name); 
        }

        int[] nums = {8, 4, 10, 5, 7, 11, 3, 9, 23, 6};
        int sum = 0; 
        for(int num : nums){
            sum += num; 
        }

        int[] grades = {75, 80, 82, 78, 92};
        for (int i = 0; i < grades.length; i++){
            grades[i] += 5; 
        }

        for (int grade : grades){
            System.out.println(grade); 
        }


        int[ ] values = {6, 2, 1, 7, 12, 5};
        for (int value : values) {
            if (value % 2 == 0) {
                System.out.println(value + " is even!");
            }
        }

    }
}