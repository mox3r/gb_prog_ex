public class Human extends BaseHuman implements Runner {
    private int maxRun;
    private int maxJump;

    public int getMaxJump() {
        return maxJump;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public Human(String name, int maxRun, int maxJump) {
        super.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int length) {
        if (length <= getMaxRun()) {
            System.out.printf("%s пробежал по дорожке  %d метров.\n", name, length);
            return true;
        } else {
            System.out.printf("%s не смог преодолеть %d метров, остановился после %d метров\n", name, length, maxRun);
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= getMaxJump()) {
            System.out.printf("%s прыгнул на %d.\n", name, height);
            return true;
        } else {
            System.out.printf("%s не смог преодолеть высоту %d,  его предел - %d\n", name, height, maxJump);
            return false;
        }
    }
}
