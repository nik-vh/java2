package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String... args) throws MyArraySizeException, MyArrayDataException {
        //System.out.println(DayOfWeek.SATURDAY.getNumDay());
//        System.out.println("Осталось работать " + DayOfWeek.TUESDAY.getWorkingHours() + " часов.");
//
        String[][] testArray = {{"1","2","ккк","4"},{"1","www","3","4"}, {"1","2","3","4"},{"1","www","3","4"}};
//        System.out.println(Arrays.toString(testArray));
//        for(int i = 0; i < testArray.length; i++) {
//            for(int j = 0; j < testArray.length; j++) {
//                System.out.print(" " + testArray[i][j] + " ");
//            }
//            System.out.println();
//        }
        ArrayToInt arrayToInt = new ArrayToInt();
//        arrayToInt.convertArray(testArray);
//        try {
//            arrayToInt.convertArray(testArray);
//        } catch (MyArraySizeException ex) {
//            System.out.println(ex.getMessage());
//        }
        arrayToInt.convertArray(testArray);
    }
}
