import java.util.*;
class Rectangle implements geoShape
{
    double l, b;
    public void accept()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter length: ");
        l = Double.parseDouble (in.nextLine());
        System.out.println ("Enter breadth: ");
        b = Double.parseDouble (in.nextLine());
    }
    
    public double calcarea()
    {
        return l * b;
    }
    
    public void display()
    {
        System.out.println (calcarea());
    }
}