package Marathon;
import java.util.Random;

public class Cat extends Animal {
    public Cat(String name) {
        super("Кот", name, 200, 20, 0);
    }
    public Cat() {
        Random random = new Random();
        String[] names = {"Вася", "Мурзик", "Кузя", "Мася", "Мотроскин", "Барсик", "Обормот", "Бегимот", "Пушистик"};
        this.type = "Кот";
        this.name = names[random.nextInt(8)];
        this.maxRunDistance = random.nextInt((500 - 200) + 1) + 200; //Диапазон от 100 до 300
        this.maxJumpHeight = random.nextInt((20 - 10) + 1) + 10; //Диапазон от 10 до 20
        this.maxSwimDistance = 0;
        this.onDistance = true;
    }
}