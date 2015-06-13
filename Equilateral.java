import java.util.*;
class Equilateral extends Triangle
{
    double a;
    public void accept()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter side: ");
        a = Double.parseDouble (in.nextLine());
    }
    
    public double calcarea()
    {
        return Math.sqrt (3) / 4 * a * a;
    }
    
    public void display()
    {
        System.out.println (calcarea());
    }
}