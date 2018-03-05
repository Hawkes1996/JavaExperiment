package Experiment4;

import java.util.Scanner;

public class Cylinder extends Circle{
    private double Radius; //圆的半径
    private double hight;   //圆的高

    //构造函数
    public Cylinder (double r,double h){
        this.Radius = r;
        this.hight = h;
    }

    public double getRadius() {
        return Radius;
    }

    public double getHight() {
        return hight;
    }

    //获取圆柱体的体积
    public double getVolume(){
        double C;
        double radius =getRadius();
        double Hight = getHight();
        C = radius*radius*3.14*Hight;
        return C;
    }

    void showVolume(){
        System.out.println("圆柱体的体积："+getVolume());
    }
}


class Test_Cylinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入圆的半径:");
        double R = sc.nextDouble();
        System.out.print("输入圆的高度:");
        double H = sc.nextDouble();
        Cylinder c = new Cylinder(R,H);
        c.showVolume();
    }
}