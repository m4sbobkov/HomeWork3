package OOP2;

public class Cat extends Animal{
    private String name;
    private static int CatCount;

    public static int getCatCount() {
        return CatCount;
    }

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
        CatCount++;
        System.out.println("Count of cats: " + getCatCount() + "\nCount of animals: "+getAnimalCount());
        System.out.println();
    }

    @Override
    public void run(int distance) {
        int Maxdistance = 200;
        if (distance > Maxdistance){
            System.out.println(getName()+" can't run so far");
        } else if (distance <= 0){
            System.out.println(getName()+" wants moving to forward");
        } else
            System.out.println(getName()+" is ran " + distance + " m");

    }

    @Override
    public void swim(int distance) {
        System.out.println(getName()+" can't swim");
    }
}
