class Final1
{
   public statuc void main(String arr[])
   {
        Demo obj = new Demo();
        obj.No1++;
        obj.No2++;
        obj.No3++;
   }
}
class Demo
{
    public int No1;
    public final int No2 = 11;
    public final int No3;

    public Demo()
    {
       No1 = 0;
       No3 = 21;
    }
}