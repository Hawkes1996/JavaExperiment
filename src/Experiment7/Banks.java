package Experiment7;

/**
 * 描述
 *
 * @author fqn
 * @create 2017-11-30 21:25
 */
public class Banks {
    private static int k=0;//总汇款
    private static synchronized void send(int m,int i,int n){
        k+=m;
        System.out.println("第"+n+"个顾客进行第"+(i+1)+"次汇款,银行接收总汇款"+k);
    }
    static class Costum extends Thread{//售票点
        int n;//顾客编号
        public Costum(int n){
            this.n=n;
        }
        public void run(){
            for(int i=0;i<3;i++){
                send(100,i,n);//汇款100
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        for(int i=1;i<=2;i++){
            new Costum(i).start();
        }
    }
}
