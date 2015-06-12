import java.io.*;
class Triangle implements geoShape
{
    double b, h;
    public double calcarea()
    {
        return 0.5 * b * h;
    }
    
    public void display()
    {
        System.out.println (calcarea());
    }
}