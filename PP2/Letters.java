/**
 * PP 1.2, write letters to three different people, revised 8/30/2015
 * 
 * @Alexis Scheerer and Katherine Zhang
 * @8/27/15
 */
public class Letters
{
   public static void main(String[] args)
   {
       parentLetter();
       grandparentLetter();
       friendLetter();
   }
   public static void parentLetter()
   {
       System.out.println("Dear Mom & Dad,");
       familyLetterBeginning();
       fromClosing();
   }
   public static void grandparentLetter()
   {
       System.out.println("Dear Grandma and Grandpa,");
       familyLetterBeginning();
       christmasSweaterPara();
       fromClosing();
   }
   public static void friendLetter()
   {
       System.out.println("Dear Kathy,");
       introPara();
       schoolProbsPara();
       fromClosing();
   }
   public static void introPara()
   {
       System.out.println();
       System.out.println("\tHow are you doing today? I don't really write letters to you but I");
       System.out.println("thought it would be a good idea to do that today. I've been busy ever since I moved to");
       System.out.println("college, and I really miss home. Remember all those great times we had in Millbrae? I");
       System.out.println("really miss how things used to be, I just hate change. I guess I'm here now though, and");
       System.out.println("I'm here for the next four years (hopefully only four).");
       System.out.println();
   }
   public static void schoolPara()
   {
       System.out.println("\tNow I'm sure you're probably wondering right now, how is college");
       System.out.println("Alexis? How have your first few weeks been? Well, it's been interesting. My roommate");
       System.out.println("is pretty cool, and we're becoming friends, but I find it to be really annoying when she");
       System.out.println("plays heavy metal music while I'm trying to study. My classes are all really interesting.");
       System.out.println("It's one thing to hear about how hundreds of people can be in one class, and a completely");
       System.out.println("different thing to actually be in there and learn in a class like that. I didn't write");
       System.out.println("so you could read about my super boring classes forever though.");
       System.out.println();
   }
   public static void schoolProbsPara()
   {
       System.out.println("\tCollege is the worst. My super annoying roommate plays her");
       System.out.println("super annoying heavy metal music all the time. It's like, she doesn't even care about");
       System.out.println("me or my existence! I really miss hanging out with our friends and how we all cared");
       System.out.println("about one another and other people's feelings. It's super awkward to be in a class with");
       System.out.println("hundreds of people in it. I'm used to talking to people in class, but here I'm never");
       System.out.println("next to the same person twice. I hope college is better for you though!");
       System.out.println();
   }
   public static void christmasSweaterPara()
   {
       System.out.println("\tI never really got to thank you for your christmas present");
       System.out.println("last year! I love the super fluffy and very bright pink sweater that you knit for");
       System.out.println("me! I wear it whenever it's cold enough and I feel like I miss home. I don't know");
       System.out.println("how I could possibly stand college without it. It's like a security blanket to me.");
       System.out.println("Thanks again!");
       System.out.println();
   }
   public static void fromClosing()
   {
       System.out.println("I really miss you and can't wait to see you at Thanksgiving!");
       System.out.println();
       System.out.println("-Alexis");
       System.out.println();
   }
   public static void familyLetterBeginning()
   {
       introPara();
       schoolPara();
   }
}
