import java.util.*;
class geoShape_main
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Choose your shape: ");
        System.out.println ("1. Triangle ");
        System.out.println ("2. Rectangle ");
        System.out.println ("3. Circle ");
        byte ch = Byte.parseByte (in.nextLine());
        System.out.println ();
        
        switch (ch)
        {
            case 1:
            Triangle tri = new Triangle();
            System.out.println ("What kind of triangle? ");
            System.out.println ("1. Isosceles ");
            System.out.println ("2. Scalene ");
            System.out.println ("3. Equilateral ");
            byte cht = Byte.parseByte (in.nextLine());
            switch (cht)
            {
                case 1:
                tri = new Isosceles(); break;
                case 2:
                tri = new Scalene(); break;
                case 3:
                tri = new Equilateral(); break;
            }
            
            tri.accept();
            tri.calcarea();
            tri.display();
            break;
            
            case 2:
            Rectangle rect = new Rectangle();
            rect.accept();
            rect.calcarea();
            rect.display();
            break;
            
            case 3:
            Circle c = new Circle();
            c.accept();
            c.calcarea();
            c.display();
            break;
        }
    }
}