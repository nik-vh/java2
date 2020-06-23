package Marathon;
import java.util.Random;

public class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }
    public Water() {
        Random random = new Random();
        this.length = random.nextInt(80)  + 1; //Диапазон от 1 до 30
    }


    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }

    @Override
    public int getValue() {
        return length;
    }
}