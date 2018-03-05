package Experiment5;

/**
 * 描述
 *
 * @author fqn
 * @create 2017-10-26 20:19
 */

//定义接口ComputerWeight
interface ComputerWeight{
    public double computrWeight();
    public void printName();
    public double printPrice();
}

//定义接口ComputerCompany
interface ComputerCompany{
    public String computerName();
    public void printFunction();
}

public class Text{
    public static void main(String[] args) {
        FlashMenory c = new FlashMenory();
        //c.computerName();
        c.printName();
        c.printFunction();
        System.out.println(c.computrWeight()+"人");
        System.out.println(c.printPrice()+"万");
    }
}

class FlashMenory implements ComputerCompany,ComputerWeight{

    public double computrWeight(){
        return 500;
    }
    public void printName(){
        System.out.println(computerName());
    }
    public double printPrice(){
        return 1000;
    }

    public String computerName()
    {
        return "公司名为Company";
    }
    public void printFunction(){
        System.out.println("公司的职责是为人民服务");
    }
}
