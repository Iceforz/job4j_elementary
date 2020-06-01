package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (height - 100)* 1.15;
        return rsl;
    }


    public static double womanWeight(double height) {
        double rsl = (height - 110)* 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(180);
        System.out.println("For man height 180 perfect weight is " + man);
        double woman = Fit.womanWeight(165);
        System.out.println("For woman height 165 perfect weight is " + woman);


}
}
