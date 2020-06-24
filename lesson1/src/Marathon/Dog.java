package Marathon;
import java.util.Random;

public class Dog extends Animal {
    public Dog(String name) {
        super("Пес", name, 500, 5, 20);
    }

    public Dog() {
        Random random = new Random();
        String[] names = {"Дружок", "Руслан", "Барбос", "Джек", "Мяу", "Бобик", "Дик"};
        this.type = "Собака";
        this.name = names[random.nextInt(6)];
        this.maxRunDistance = random.nextInt((1000 - 800) + 1) + 800; //Диапазон от 300 до 500
        this.maxJumpHeight = random.nextInt((5 - 1) + 1) + 1; //Диапазон от 1 до 5
        this.maxSwimDistance = random.nextInt((150 - 70) + 1) + 70; //Диапазон от 10 до 20
        this.onDistance = true;
    }

}
