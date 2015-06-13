import java.util.*;
class Isosceles extends Triangle
{
    public void accept()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter base: ");
        b = Double.parseDouble (in.nextLine());
        System.out.println ("Enter height: ");
        h = Double.parseDouble (in.nextLine());
    }
    
    public double calcarea()
    {
        return 0.5 * b * h;
    }
    
    public void display()
    {
        System.out.println (calcarea());
    }
}