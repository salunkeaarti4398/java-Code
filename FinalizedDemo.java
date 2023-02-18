
class FinalizedDemo
{
    public static void main(String a[])
    {
        Demo obj = new Demo(4);
        obj = null;
        System.gc();
    }
}
class Demo
{
   public int Size;
   public int Arr[];

  public Demo(int No)
  {
    System.out.println("Inside constructor method");

    Size = No;
    Arr = new int[Size];

  }
  protected void finalize()
  {
    System.out.println("Inside finalised method");
    Arr = null;
  }
}