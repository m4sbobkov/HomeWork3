package OOP2;

public class Dog extends Animal{
    private String name;
    private static int DogCount = 0;

    public static int getDogCount() {
        return DogCount;
    }

    public String getName() {
        return name;
    }

    public Dog(String name) {
        this.name = name;
        DogCount++;
        System.out.println("Count of dogs: " + getDogCount() + "\nCount of animals: "+getAnimalCount());
        System.out.println();
        }

    @Override
    public void run(int distance) {
        int Maxdistance = 500;
        if (distance > Maxdistance){
            System.out.println(getName()+" can't run so far");
        } else if (distance <= 0){
            System.out.println(getName()+" wants moving to forward");
        } else
        System.out.println(getName()+" is ran " + distance + " m");
    }

    @Override
    public void swim(int distance) {
        int Maxdistance = 10;
        if (distance > Maxdistance){
            System.out.println(getName()+" can't swim so far ");
        } else if (distance <= 0){
            System.out.println(getName()+" wants moving to forward");
        } else
            System.out.println(getName()+" is swam " + distance + " m" );
    }
}
