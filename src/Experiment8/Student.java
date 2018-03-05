package Experiment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 描述
 *
 * @author fqn
 * @create 2017-12-07 19:07
 * Java实验8  容器的使用
 *
 * 编写一个程序，用户键盘录入若干个学生的姓名和分数（程序每次提示用户输入“Y”或“”决定是否继续录入学生信息，如果用
 * 户输入“N”则用户输入完毕）用户录入完毕后，程序按成绩由高到低的顺序输出学生的姓名和分数（姓名和分数之间用一个空
 * 格分割）
 * 【说明：键盘输入可以使用Scanner类】
 */

class students {
    private String name;
    private float score;

    public void Setname(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void Setscore(float score) {
        this.score = score;
    }

    public float getScore() {
        return score;
    }

    public String tostring(){
        return (name+" "+score);
    }
}

class Com implements Comparator<students>{
    public int compare(students x1,students x2){
        if (x1.getScore() > x2.getScore())
            return -1;
        if (x1.getScore() < x2.getScore())
            return 1;
        return 0;
    }
}



public class Student {
    public static void main(String[] args) {
        ArrayList<students> stu = new ArrayList<students>();
        //动态数组类型,ArrayList对象既有数组的特征，也有链表的特征。可以随时从链表中添加或删除一个元素
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入学生的姓名和分数:");
            students temp = new students();
            temp.Setname(sc.next());
            temp.Setscore(sc.nextFloat());
            stu.add(temp);
            System.out.println("是否继续输入('Y' or 'N')");
            String p = sc.next();
            if(p.trim().equals("N") || p.trim().equals("n")) {
                break;
            }
        }
        Com s = new Com();
        Collections.sort(stu,s);
        System.out.println("\n本次输入的学生成绩信息和排名如下:");
        for (int j=0;j<stu.size();j++) {
            System.out.println("姓名:"+stu.get(j).getName()+"成绩"+stu.get(j).getScore());
        }

    }
}
