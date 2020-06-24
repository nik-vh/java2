package ru.geekbrains.lesson2;


public class ArrayToInt {

    public void convertArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if(array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива");
        }
        for(int i = 0; i < array.length; i++) {
            if(array[i].length != 4) {
                throw new MyArraySizeException("Неверный размер массива");
            }
        }
        int summa = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    summa += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма элементов массива = " + summa);
    }

    public void printArray(String[][] testArray) {
        for(int i = 0; i < testArray.length; i++) {
            for(int j = 0; j < testArray.length; j++) {
                System.out.print(" " + testArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}

