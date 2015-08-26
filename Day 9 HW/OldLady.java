/**
 * Exercise 3
 * 
 * @Alexis Scheerer
 * @8/25/15
 */
public class OldLady
{
   public static void main(String[] args)
   {
       Fly1();
       Spider1();
       Bird1();
       Cat1();
       Horse();
   }
   public static void Fly1()
   {
       System.out.println("There was an old lady who swallowed a fly");
       Fly2();
   }
   public static void Fly2()
   {
       System.out.println("I don't know why she swallowed a fly - perhaps she'll die!");
   }
   public static void Spider1()
   {
       System.out.println("There was an old lady who swallowed a spider,");
       System.out.println("That wriggled and wiggled and tiggled inside her;");
       Spider2();
   }
   public static void Spider2()
   {
       System.out.println("She swallowed the spider to catch the fly;");
       Fly2();
   }
   public static void Bird1()
   {
       System.out.println("There was an old lady who swallowed a bird;");
       System.out.println("How absurd to swallow a bird.");
       Bird2();
   }
   public static void Bird2()
   {
       System.out.println("She swallowed the bird to catch the spider,");
       Spider2();
   }
   public static void Cat1()
   {
       System.out.println("There was an old lady who swallowed a cat;");
       System.out.println("Fancy that to swallow a cat!");
       Cat2();
   }
   public static void Cat2()
   {
       System.out.println("She swallowed the cat to catch the bird,");
       Bird2();
   }
   public static void Horse()
   {
       System.out.println("There was an old lady who swallowed a horse...");
       System.out.println("She's dead, of course!");
   }
}
