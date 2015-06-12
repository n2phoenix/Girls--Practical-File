import java.io.*;
class Isosceles extends Triangle
{
    public double calcarea()
    {
        return 0.5 * b * h;
    }
    
    public void display()
    {
        System.out.println (calcarea());
    }
}