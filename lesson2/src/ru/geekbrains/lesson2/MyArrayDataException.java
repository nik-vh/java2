package ru.geekbrains.lesson2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int x, int y) {
        super("Неверный тип элемента массива " + "["+ x + "]" +"[" + y + "]");
    }
}
