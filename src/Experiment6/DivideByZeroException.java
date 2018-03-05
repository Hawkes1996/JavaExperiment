package Experiment6;

import java.util.Scanner;

/**
 * 描述
 *
 * @author fqn
 * @create 2017-11-10 10:07
 */
public class DivideByZeroException{
    public static void main(String[] args) {
        double a,b;   //提供用户输入除法运算的值
        double result;
        Scanner sc=new Scanner(System.in);
        try{
            Execpt temp = new Execpt();
            System.out.println("输入除数a:");
            a = Integer.parseInt(sc.nextLine().trim());
            System.out.println("输入被除数b:");
            b = Integer.parseInt(sc.nextLine().trim());
            temp.division(a,b);
            result = b/a;
            System.out.println("结果为:"+result);
        }
        catch(Message e)
        {
            System.out.println(e);
        }
        catch (NumberFormatException nfe) {
            System.out.print("输入数据类型错误!必须输入实数!\n");
        }
    }
}

//除数为0时抛出异常

class Execpt{
    public void division(double a,double b)throws Message{
        if(a==0) {
            throw new Message("除数为0,出现异常错误");
        }
    }
}

class Message extends Exception{
    public Message(String msg)
        {
            super(msg);
        }
}
