package Task1;
public abstract class Animal {

    protected String name;

    private int maxRun;
    private int maxSwim;
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        counter++;
    }

    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s пробежал дистатцию %d м.\n", name, distance);
        } else {
            System.out.printf("%s не смог пробежать дистатцию %d м., остановился на %d\n", name, distance, maxRun);
        }

    }

    public void swim(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s проплыл %d м.\n", name, distance);
        } else {
            System.out.printf("%s не смог проплыть дистатцию %d м., остановился на %d\n", name, distance, maxRun);
        }
    }
}
