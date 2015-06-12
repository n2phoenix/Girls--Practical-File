import java.util.*;
class vehicleLoan extends loan
{
    String vehicle_Type;
    int reg_no;
    
    public void accept()
    {
        loan:accept();
        in = new Scanner (System.in);
        System.out.println ("Enter vehicle type: ");
        vehicle_Type = in.nextLine();
        System.out.println ("Enter registration number: ");
        reg_no = Integer.parseInt (in.nextLine());
    }
    
    public void display()
    {
        loan:display();
        System.out.println();
        System.out.println ("Vehicle loan requested by " + vehicle_Type);
        System.out.println ("Registration number of house: " + reg_no);
    }
}