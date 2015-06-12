import java.io.*;
class Rectangle implements geoShape
{
    double l, b;
    public double calcarea()
    {
        return l * b;
    }
    
    public void display()
    {
        System.out.println (calcarea());
    }
}