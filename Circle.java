import java.util.*;
class Circle implements geoShape
{
    double r;
    final double pi = 3.14;
    
    public void accept()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter radius: ");
        r = Double.parseDouble (in.nextLine());
    }
    
    public double calcarea()
    {
        return pi * pi * r;
    }
    
    public void display()
    {
        System.out.println (calcarea());
    }
}