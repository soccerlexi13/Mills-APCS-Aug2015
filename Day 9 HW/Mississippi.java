
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
        System.out.println("\tS")
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
}
