import java.io.*;
class Circle implements geoShape
{
    double r;
    final double pi = 3.14;
    public double calcarea()
    {
        return pi * pi * r;
    }
    
    public void display()
    {
        System.out.println (calcarea());
    }
}