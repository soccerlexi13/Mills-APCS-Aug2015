/**
 * Exercise 3, print out Old Lady Song, revised 8/31/15
 * 
 * @Alexis Scheerer
 * @8/25/15
 */
public class OldLady
{
   public static void main(String[] args)
   {
       intro();
       System.out.println("fly");
       fly();
       intro();
       System.out.println("spider,\nThat wriggled and wiggled and tiggled inside her;");
       spider();
       intro();
       System.out.println("bird;\nHow absurd to swallow a bird.");
       bird();
       intro();
       System.out.println("cat;\nFancy that to swallow a cat!");
       cat();
       horse();
   }
   public static void intro()
   {
       System.out.print("There was an old lady who swallowed a ");
   }
   public static void fly()
   {
       System.out.println("I don't know why she swallowed a fly - perhaps she'll die!");
   }
   public static void spider()
   {
       System.out.println("She swallowed the spider to catch the fly;");
       fly();
   }
   public static void bird()
   {
       System.out.println("She swallowed the bird to catch the spider,");
       spider();
   }
   public static void cat()
   {
       System.out.println("She swallowed the cat to catch the bird,");
       bird();
   }
   public static void horse()
   {
       System.out.println("There was an old lady who swallowed a horse...");
       System.out.println("She's dead, of course!");
   }
}
