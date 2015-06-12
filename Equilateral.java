import java.io.*;
class Equilateral extends Triangle
{
    double a;
    public double calcarea()
    {
        return Math.sqrt (3) / 4 * a * a;
    }
    
    public void display()
    {
        System.out.println (calcarea());
    }
}