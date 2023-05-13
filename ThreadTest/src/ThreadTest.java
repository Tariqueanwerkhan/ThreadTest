//class MyThread extends Thread
//{
//    public void run()
//{
//    int i = 1;
//    while(true)
//    {
//        System.out.println(i+" Hello");
//        i++;
//    }
//  }
//}
//public class ThreadTest {
//    public static void main(String[] args)
//    {
//        MyThread t=new MyThread();
//        t.start();
//        int i=1;
//        while(true)
//        {
//            System.out.println(i+" World");
//            i++;
//        }
//
//    }
//}


class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }
}
public class ThreadTest {
    public static void main(String[] args) throws Exception
    {
        MyThread t=new MyThread("My Thread 1");

    }
}
