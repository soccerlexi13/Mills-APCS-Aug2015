/**
 * HW Day 10 PP 4 print out the 12 days of Christmas, revised 8/31/15
 * 
 * @Author Alexis Scheerer
 * @Version 8/27/15
 */
public class ChristmasGifts
{
    public static void main(String[] args)
    {
        System.out.print("On the first");
        trueLoveGave();
        firstDay();
        System.out.print("On the second");
        trueLoveGave();
        secondDay();
        System.out.print("On the third");
        trueLoveGave();
        thirdDay();
        System.out.print("On the fourth");
        trueLoveGave();
        fourthDay();
        System.out.print("On the fifth");
        trueLoveGave();
        fifthDay();
        System.out.print("On the sixth");
        trueLoveGave();
        sixthDay();
        System.out.print("On the seventh");
        trueLoveGave();
        seventhDay();
        System.out.print("On the eighth");
        trueLoveGave();
        eighthDay();
        System.out.print("On the ninth");
        trueLoveGave();
        ninthDay();
        System.out.print("On the tenth");
        trueLoveGave();
        tenthDay();
        System.out.print("On the eleventh");
        trueLoveGave();
        eleventhDay();
        System.out.print("On the twelfth");
        trueLoveGave();
        twelfthDay();
    }
    public static void trueLoveGave()
    {
        System.out.println(" day of Christmas,\nmy true love sent to me:");
    }
    public static void firstDay()
    {
        System.out.println("a partridge in a pear tree.");
    }
    public static void secondDay()
    {
        System.out.println("two turtle doves, and");
        firstDay();
    }
    public static void thirdDay()
    {
        System.out.println("three French hens,");
        secondDay();
    }
    public static void fourthDay()
    {
        System.out.println("four calling birds,");
        thirdDay();
    }
    public static void fifthDay()
    {
        System.out.println("FIVE GOLDEN RINGS...");
        fourthDay();
    }
    public static void sixthDay()
    {
        System.out.println("six geese a-laying,");
        fifthDay();
    }
    public static void seventhDay()
    {
        System.out.println("seven swans a-swimming,");
        sixthDay();
    }
    public static void eighthDay()
    {
        System.out.println("eight maids a-milking,");
        seventhDay();
    }
    public static void ninthDay()
    {
        System.out.println("nine ladies dancing,");
        eighthDay();
    }
    public static void tenthDay()
    {
        System.out.println("ten lords a-leaping,");
        ninthDay();
    }
    public static void eleventhDay()
    {
        System.out.println("eleven pipers piping,");
        tenthDay();
    }
    public static void twelfthDay()
    {
        System.out.println("twelve drummers drumming,");
        eleventhDay();
    }
}
