
/**
 * Print out Mississippi Exercise 1
 * 
 * @Alexis Scheerer
 * @8/25/15
 */
public class Mississippi
{
    public static void main(String[] args)
    {
        DrawM();
        DrawI();
        DrawS();
        DrawS();
        DrawI();
        DrawS();
        DrawS();
        DrawI();
        DrawP();
        DrawP();
        DrawI();
    }
    public static void DrawM()
    {
        DrawMPipes();
        System.out.println("MM   MM");
        System.out.println("M M M M");
        DrawMPipes();
        DrawMPipes();
        DrawMPipes();
    }
    public static void DrawI()
    {
        DrawIBase();
        DrawIMid();
        DrawIMid();
        DrawIMid();
        DrawIMid();
        DrawIMid();
        DrawIBase();
    }
    public static void DrawS()
    {
        DrawSBase();
        DrawSMid();
        System.out.println("S");
        DrawSBase();
        System.out.println("      S");
        DrawSMid();
        DrawSBase();
    }
    public static void DrawP()
    {
        DrawPBase();
        DrawPMid();
        DrawPMid();
        DrawPBase();
        System.out.println("P\nP\nP");
    }
    public static void DrawMPipes()
    {
        System.out.println("M     M");
    }
    public static void DrawIBase()
    {
        System.out.println("IIIII");
    }
    public static void DrawIMid()
    {
        System.out.println("  I");
    }
    public static void DrawSBase()
    {
        System.out.println(" SSSSS");
    }
    public static void DrawSMid()
    {
        System.out.println("S     S");
    }
    public static void DrawPBase()
    {
        System.out.println("PPPPPP");
    }
    public static void DrawPMid()
    {
        System.out.println("P     P");
    }
}
