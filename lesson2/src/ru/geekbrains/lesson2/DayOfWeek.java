package ru.geekbrains.lesson2;

public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int numDay;

    public int getNumDay() {
        return numDay;
    }

    DayOfWeek(int numDay) {
        this.numDay = numDay;
    }

    public int getWorkingHours(){
        int allWorkHours = 40;
        int workHoursInDay = 8;
        if(this.getNumDay() > 5) { return 0; }
        return allWorkHours - (this.getNumDay() * workHoursInDay) + 8;
    }
}
