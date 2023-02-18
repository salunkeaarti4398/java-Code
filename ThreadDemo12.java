import java.util.*;
class ThreadDemo12
{
    public static void main(String A[]) throws InterruptedException
    {
        Data obj1 = new Data(10);
        obj.Accept();

        DemoEven eobj = new DemoEven(obj1);
        DemoEven oobj = new DemoOdd(obj1);

        Thread t1 = new Thread(eobj);
        Thread t2 = new Thread(oobj);

        t1.start();

        t2.start;

        t1.join
        t2.join


    }
}    
class DemoEven extends Thread
{
    public Data dobj;
    public DemoEven(Data dobj)
    {
        dobj = obj;
    }
    public void run()
    {
        for(int i = 0; i< dobj.Arr.length; i++)
        {
            if(dobj.Arr[i] % 2 == 0)
            {
                System.out.println("Even number is :"+dobj.Arr[i]);
            }
        }
    }
}
class DemoOdd extends Thread
{
    public Data dobj;
    public DemoOdd(Data dobj)
    {
        dobj = obj;
    }
    public void run()
    {
        for(int i = 0; i< dobj.Arr.length; i++)
        {
            if(dobj.Arr[i] % 2 != 0)
            {
                System.out.println("Even number is :"+dobj.Arr[i]);
            }
        }
    }
}
class Data
{
    public Arr[];
    public Data(int size)
    {
        Arr = new int[size];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Numbers");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }
}
