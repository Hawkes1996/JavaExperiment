package Experiment7;

/**
 * 描述
 *
 * @author fqn
 * @create 2017-11-30 21:24
 */
public class Train {
    private static int k=0;     //售出票数
    private static int count=1000;      //总票数
    private static synchronized boolean sell(int n){
        if(k<count){
            k++;
            System.out.println("第"+n+"售票点售出第"+k+"张票");
            return true;
        }
        return false;
    }
    static class SellPot extends Thread{            //售票点
        int n;                  //售票点编号
        public SellPot(int n){
            this.n=n;
        }
        public void run(){
            while(sell(n)){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            new SellPot(i).start();
        }
    }
}



//class T4E02
//{
//    public static void main(String[] args)
//    {
//        Resource rs = new Resource(100);
//
//        for (int i=0;i<10 ;i++ )
//        {
//            new Thread(new Seller(i,rs)).start();
//        }
//    }
//}
///**
// *  资源类
// *  定义了票的总数，和同步了的售票方法
// */
//class Resource
//{
//    int ticketNum = 50;
//    boolean flag = false ; // 定义票是否卖完
//
//    public Resource(){}
//    public Resource(int num)
//    {
//        this.ticketNum = num;
//    }
//
//    public synchronized void sellTicket(Seller s)
//    {
//        if (ticketNum > 0)
//        {
//            System.out.println("第" + s.num + "售票点卖出了第" + ticketNum + "张票……");
//            ticketNum--;
//        }
//        else
//        {
//            flag = true;
//        }
//    }
//}
///**
// *  售票点类
// *
// */
//class Seller implements Runnable
//{
//    int num;
//    Resource rs;
//
//    public Seller(int num,Resource rs)
//    {
//        this.num = num;
//        this.rs = rs;
//    }
//
//    public final void run()
//    {
//        while (!rs.flag)
//        {
//            /**
//             *  调用资源类的同步方法
//             */
//            rs.sellTicket(this);
//
//            try
//            {
//                Thread.sleep(100);
//            }
//            catch (InterruptedException e)
//            {
//                e.printStackTrace();
//            }
//        }
//    }
//}