package OOP2;

public abstract class Animal {
    private static int AnimalCount = 0;

    public static int getAnimalCount() {
        return AnimalCount;
    }

    public Animal() {
        AnimalCount++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

}
