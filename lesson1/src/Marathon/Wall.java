package Marathon;
import java.util.Random;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }
    public Wall() {
        Random random = new Random();
        this.height = random.nextInt((30 - 1) + 1) + 1; //Диапазон от 1 до 30
    }


    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }

    @Override
    public int getValue() {
        return height;
    }

}
