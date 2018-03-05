package Experiment6;

import java.util.Scanner;

/**
 * 描述
 *
 * @author fqn
 * @create 2017-11-10 10:04
 */

//class input{
//    public int ;
//    String [] =
//    void set(int grade){
//        if(grade>=0&&grade<=100){
//            this.grade = grade;
//        }
//    }
//
//    void input(){
//        while(){
//
//        }
//    }
//}


public class ExpecTest {
    public static void main(String[] args) {
        double grade = 0;     //用户输入的成绩
        double sum = 0;       //统计用户输入成绩的总和
        double object = 0;    //统计用户输入成绩的个数
        double avg = 0;       //统计平均成绩
        boolean Flag = true;  //判断用户输入-1时退出输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩，直到输入-1时结束");
        while (Flag) {
            try {
                grade = sc.nextDouble();
                if ((grade < 0 || grade > 100) && grade != -1)
                    throw new Exception();
                else if (grade == -1)
                    Flag = false;
                else {
                    object++;
                    sum = sum + grade;
                }
            } catch (Exception e) {
                System.out.println("输入一个不正确的成绩!");
            }
        }

        try {
            avg = sum/object;
//          BigDecimal temp = new BigDecimal(Double.valueOf(avg));  //用来对超过16位有效位的数进行精确的运算
//          temp.setScale(1,BigDecimal.ROUND_HALF_DOWN);  //取平均成绩的一位小数
//          Double Avg=temp.doubleValue();
            System.out.println("平均成绩为：" + avg);
        }
        //当出现异常的运算条件时，抛出此异常。例如，一个整数"除以零"时，抛出此类的一个实例
        catch (ArithmeticException e) {
            System.out.println("计算平均成绩时异常!");
        }
    }
}



