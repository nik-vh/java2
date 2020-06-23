package Marathon;
import java.util.Arrays;
import java.util.Random;

public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public Course() {
        obstacles = new Obstacle[4];
        Random random = new Random();
        //1-Wall 2-Water 3-Cross
        for (int i = 0; i < 4; i++) {
            int what = random.nextInt(3);
            if(what == 1) {
                this.obstacles[i] = new Wall();
            } else if(what == 2) {
                this.obstacles[i] = new Water();
            } else {
                this.obstacles[i] = new Cross();
            }
        }
    }

    public void infoObstacles() {
        System.out.println(Arrays.toString(obstacles));
    }

    public void doIt(Team team) {
        System.out.println("Команда " + team.name + " стартует!!!");
        System.out.println("=======================================");
        for (Competitor c : team.getPlayers()) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }

}
