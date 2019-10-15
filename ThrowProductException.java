

public class ThrowProductException
{
 public static void main()
{
   try
  {
     Product p1 = new Product("sfdgsdf", 5);
     System.out.println("created 1");
     Product p2 = new Product("32", 10);
     System.out.println("created 2");
     Product p3 = new Product("324", 2000);
     System.out.println("created 3");
  }
  catch (ProductException e)
   {
    System.out.println(e.getMessage());
   }
}
}
