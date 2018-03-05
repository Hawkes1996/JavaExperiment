package Experiment4;

import java.util.Scanner;

public class Test_Circle {
    public static void main(String[] args) {
        System.out.print("输入半径:");
        Scanner sc = new Scanner(System.in);
        double r;
        r = sc.nextDouble();
        Circle c = new Circle(r);
        c.show();
    }
}
