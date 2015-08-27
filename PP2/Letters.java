
/**
 * PP 1.2
 * 
 * @Alexis Scheerer and Catherine Zhang
 * @8/27/15
 */
public class Letters
{
   public static void main(String[] args)
   {
       ParentLetter();
       GrandparentLetter();
       FriendLetter();
   }
   public static void ParentLetter()
   {
       System.out.println("Dear Mom & Dad,");
       IntroPara();
       SchoolPara();
       FromClosing();
   }
   public static void GrandparentLetter()
   {
       System.out.println("Dear Grandma and Grandpa,");
       IntroPara();
       SchoolPara();
       ChristmasSweaterPara();
       FromClosing();
   }
   public static void FriendLetter()
   {
       System.out.println("Dear Cathy,");
       IntroPara();
       SchoolProbsPara();
       FromClosing();
   }
   public static void IntroPara()
   {
       System.out.println("");
       System.out.println("");
       System.out.println("");
       System.out.println("");
       System.out.println("");
   }
}
