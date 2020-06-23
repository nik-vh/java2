package Marathon;
import java.util.Random;

public class Human implements Competitor {
    protected String name;

    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;

    protected boolean active;

    @Override
    public boolean isOnDistance() {
        return active;
    }

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 30;
        this.maxSwimDistance = 200;
        this.active = true;
    }

    public Human() {
        Random random = new Random();
        String[] names = {"Иван", "Николай", "Дмитрий", "Алексей", "Владимир", "Борис", "Андрей", "Иосиф", "Бонопарт", "Ашот"};
        this.name = names[random.nextInt(9)];
        this.maxRunDistance = random.nextInt((5000 - 2000) + 1) + 2000; //Диапазон от 2000 до 5000
        this.maxJumpHeight = random.nextInt((30 - 10) + 1) + 10; //Диапазон от 10 до 30
        this.maxSwimDistance = random.nextInt((200 - 50) + 1) + 50; //Диапазон от 50 до 200
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " хорошо справился с кроссом");
        } else {
            System.out.println(name + " не справился с кроссом");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " удачно перепрыгнул через стену");
        } else {
            System.out.println(name + " не смог перепрыгнуть стену");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(name + " отлично проплыл");
        } else {
            System.out.println(name + " не смог проплыть");
            active = false;
        }
    }

    @Override
    public void info() {
        System.out.println("Человек " + this.name + " Бегучесть - " + this.maxRunDistance +
                " Прыгучесть - " + this.maxJumpHeight + " Плавучесть - " + this.maxSwimDistance);
    }
}
