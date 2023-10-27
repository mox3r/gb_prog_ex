public class Championship {
    public static void main(String[] args) {

        Runner[] runners = {
                new Cat("Персик", 2500, 90),
                new Cat("Барсик", 3450, 75),
                new Human("Вася", 4500, 150),
                new Human("Саша", 5500, 170),
                new Robot("r2d2", 10000, 80),
                new Robot("SCV500", 15000, 75),
        };

        Obstacle[] obstacles = {
            new Track(1200),
            new Wall(30),
            new Track(500),
            new Wall(100),
            new Track(700),
            new Wall(120)
        };

        for (Runner runner : runners) {
            for (Obstacle obstacle : obstacles) {
                if(obstacle instanceof Track){
                    if(!runner.run(obstacle.getLength())){
                        break;
                    }
                } else if(obstacle instanceof Wall) {
                   if(!runner.jump(obstacle.getHeight())){
                    break;
                   }
                }
                
            }
        }
    }
}
