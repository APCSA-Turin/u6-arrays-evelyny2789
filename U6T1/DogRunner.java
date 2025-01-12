public class DogRunner {
    public static void main(String[] args){
        Dog dog1 = new Dog("Sparky", 4);
        Dog dog2 = new Dog("Toby", 7);
        Dog dog3 = new Dog("Fiona", 12);
     
        Dog[] dogs = {dog1, dog2, dog3}; 

        System.out.println(dogs[0].getName());
        System.out.println(dogs[1].getName());
        System.out.println(dogs[2].getName());
    }
}
