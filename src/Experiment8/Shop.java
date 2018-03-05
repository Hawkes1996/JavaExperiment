package Experiment8;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 描述
 *
 * @author fqn
 * @create 2017-12-07 21:03
 * 用HashMap模拟一个网上购物车。要求：从键盘输入n本书的名称、单价、购买数量，将这些信息存入一个HashMap，
 * 然后将该HashMap作为参数调用方法getSum（HashMap books），该方法用于计算书的总价并返回
 * 【说明：键盘输入可使用Scanner类】
 */
class Book {
    String Name;
    double Price;
    double Num;
}


public class Shop {
    double Sum = 0;
    HashMap map = new HashMap();

    //返回本次购入书本的总价
    public double getsum() {
        for(int i=0;i<map.size();i++) {
            Book temp = (Book)map.get(i);
            Sum += temp.Price * temp.Num;
        }
        return Sum;
    }

    //输入输入购入书本的信息
    public void Input() {
        int i = 0;
        while (true) {
            System.out.println("输入书本的信息:");
            Scanner sc = new Scanner(System.in);
            Book mbook = new Book();
            mbook.Name = sc.next();
            mbook.Price = sc.nextDouble();
            mbook.Num = sc.nextDouble();
            map.put(i,mbook);  //将i这个顺序key值和mbook的信息录入map中
            i++;
            System.out.println("是否需要再输入书本的信息:('Y' or 'N')");
            String s = sc.next();
            if (s.trim().equals("N") || s.trim().equals("n")) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Shop sh = new Shop();
        sh.Input();
        System.out.println("\n本次输入的书本的总价:"+sh.getsum());
    }
}
