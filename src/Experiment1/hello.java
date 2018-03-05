package Experiment1;
import java.util.Scanner;   //引入Scanner

/**
 * Scanner类中的方法
 * 优点一: 可以获取键盘输入的字符串
 * 优点二: 有现成的获取int,float等类型数据，非常强大，也非常方便；
 * //
 */

public class hello {
    public static void main(String []args) {
        System.out.println("输入人的年龄:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>15)
        {
            System.out.println("你年龄大于18，要为自己的行为负责!");
        }
//******************************************************************************
        System.out.println("输入人的年龄:");
        int y = sc.nextInt();
        if(y>18)
        {
            System.out.println("你年龄大于18，要为自己的行为负责!");
        }
        else
        {
            System.out.println("你的年龄不大这次放过你了");
        }
//******************************************************************************
        System.out.println("输入人的年龄:");
        int z = sc.nextInt();
        if(10<z&&z<=18)
        {
            System.out.println("你的年龄也不小了，把你送少管所");
        }
        else if(z>18)
        {
            System.out.println("你年龄大于18，要为自己的行为负责!");
        }
        else
        {
            System.out.println("小孩子，下次注意");
        }
//******************************************************************************
        System.out.println("输入一个字符:");
        String m = sc.nextLine();
        switch(m) {
            case "a":
                System.out.println("今天是星期一");
                break;
            case "b":
                System.out.println("今天是星期二");
                break;
            case "c":
                System.out.println("今天是星期三");
                break;
            case "d":
                System.out.println("今天是星期四");
                break;
            case "e":
                System.out.println("今天是星期五");
                break;
            case "f":
                System.out.println("今天是星期六");
                break;
            case "g":
                System.out.println("今天是星期日");
                break;
        }
    }
}



