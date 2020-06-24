package Marathon;
import java.util.Random;

public class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }
    public Cross() {
        Random random = new Random();
        this.length = random.nextInt((800 - 50) + 1) + 50; //Диапазон от 50 до 800
    }


    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }

    @Override
    public int getValue() {
        return length;
    }
}
