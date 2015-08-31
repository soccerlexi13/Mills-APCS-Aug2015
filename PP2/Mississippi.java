
/**
 * Print out Mississippi, Programming Practice 1, revised 8/30/15
 * 
 * @Alexis Scheerer
 * @8/25/15
 */
public class Mississippi
{
    public static void main(String[] args)
    {
        drawM();
        drawISSOut();
        drawISSOut();
        drawI();
        drawP();
        drawP();
        drawI();
    }
    public static void drawM()
    {
        drawMPipes();
        System.out.println("MM   MM");
        System.out.println("M M M M");
        drawMPipes();
        drawMPipes();
        drawMPipes();
    }
    public static void drawI()
    {
        drawIBase();
        drawIMid();
        drawIMid();
        drawIMid();
        drawIMid();
        drawIMid();
        drawIBase();
    }
    public static void drawS()
    {
        drawSBase();
        drawSMid();
        System.out.println("S");
        drawSBase();
        System.out.println("      S");
        drawSMid();
        drawSBase();
    }
    public static void drawP()
    {
        drawPBase();
        drawPMid();
        drawPMid();
        drawPBase();
        System.out.println("P\nP\nP");
    }
    public static void drawMPipes()
    {
        System.out.println("M     M");
    }
    public static void drawIBase()
    {
        System.out.println("IIIII");
    }
    public static void drawIMid()
    {
        System.out.println("  I");
    }
    public static void drawSBase()
    {
        System.out.println(" SSSSS");
    }
    public static void drawSMid()
    {
        System.out.println("S     S");
    }
    public static void drawPBase()
    {
        System.out.println("PPPPPP");
    }
    public static void drawPMid()
    {
        System.out.println("P     P");
    }
    public static void drawISSOut()
    {
        drawI();
        drawS();
        drawS();
    }
}
