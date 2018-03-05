package Experiment4;

public class Circle {
    private double  Radius;

    //构造函数
    public Circle(){
        this.Radius = 0;
    }

    public Circle(double r){
        this.Radius = r;
    }

    public double getRadius() {
        return Radius;
    }

    //获取圆的面积
    double getArea(){
        double S;
        double radius;
        radius = getRadius();
        S = radius*radius*3.14;
        return S;
    }
    //获取圆的周长
    double getPerimeter() {
        double D;
        double R;
        R = getRadius();
        D = 2*3.14*R;
        return D;
    }

    void show(){
        System.out.println("圆的半径"+Radius);
        System.out.println("圆的面积"+getArea());
        System.out.println("圆的周长"+getPerimeter());
    }

}
