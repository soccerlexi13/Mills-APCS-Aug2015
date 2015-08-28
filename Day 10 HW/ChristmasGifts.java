
/**
 * HW Day 10 PP 4
 * 
 * @Alexis Scheerer
 * @8/27/15
 */
public class ChristmasGifts
{
    public static void main(String[] args)
    {
        System.out.println("On the first day of Christmas,\nmy true love sent to me:");
        FirstDay();
        System.out.println("On the second day of Christmas,\nmy true love sent to me:");
        SecondDay();
        System.out.println("On the third day of Christmas,\nmy true love sent to me:");
        ThirdDay();
        System.out.println("On the fourth day of Christmas,\nmy true love sent to me:");
        FourthDay();
        System.out.println("On the fifth day of Christmas,\nmy true love sent to me:");
        FifthDay();
        System.out.println("On the sixth day of Christmas,\nmy true love sent to me:");
        SixthDay();
        System.out.println("On the seventh day of Christmas,\nmy true love sent to me:");
        SeventhDay();
        System.out.println("On the eighth day of Christmas,\nmy true love sent to me:");
        EighthDay();
        System.out.println("On the ninth day of Christmas,\nmy true love sent to me:");
        NinthDay();
        System.out.println("On the tenth day of Christmas,\nmy true love sent to me:");
        TenthDay();
        System.out.println("On the eleventh day of Christmas,\nmy true love sent to me:");
        EleventhDay();
        System.out.println("On the twelfth day of Christmas,\nmy true love sent to me:");
        TwelfthDay();
    }
    public static void FirstDay()
    {
        System.out.println("a partridge in a pear tree.");
    }
    public static void SecondDay()
    {
        System.out.println("two turtle doves, and");
        FirstDay();
    }
    public static void ThirdDay()
    {
        System.out.println("three French hens,");
        SecondDay();
    }
    public static void FourthDay()
    {
        System.out.println("four calling birds,");
        ThirdDay();
    }
    public static void FifthDay()
    {
        System.out.println("FIVE GOLDEN RINGS...");
        FourthDay();
    }
    public static void SixthDay()
    {
        System.out.println("six geese a-laying,");
        FifthDay();
    }
    public static void SeventhDay()
    {
        System.out.println("seven swans a-swimming,");
        SixthDay();
    }
    public static void EighthDay()
    {
        System.out.println("eight maids a-milking,");
        SeventhDay();
    }
    public static void NinthDay()
    {
        System.out.println("nine ladies dancing,");
        EighthDay();
    }
    public static void TenthDay()
    {
        System.out.println("ten lords a-leaping,");
        NinthDay();
    }
    public static void EleventhDay()
    {
        System.out.println("eleven pipers piping,");
        TenthDay();
    }
    public static void TwelfthDay()
    {
        System.out.println("twelve drummers drumming,");
        EleventhDay();
    }
}
