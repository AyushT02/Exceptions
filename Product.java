
/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
   String productNum;
   float price;

   public Product(String productNum, float price) throws ProductException
 {
  if (productNum.length() < 3 ||
  price < 0.01 ||
  price > 1000)
  throw new ProductException(productNum + " " + price);

  this.productNum = productNum;
  this.price = price;
   }
}
