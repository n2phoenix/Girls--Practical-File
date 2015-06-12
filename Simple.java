import java.util.*;
class Simple extends Accounts
{
    double rt; int time; double it;
    Simple (int acc, double pp, double rr, int tt)
    {
        super (acc, pp);
        rt = rr;
        time = tt;
    }
    
    void accept()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter account number: ");
        accno = Integer.parseInt (in.nextLine());
        System.out.println ("Enter principal: ");
        pr = Double.parseDouble (in.nextLine());
        System.out.println ("Enter rate: ");
        rt = Double.parseDouble (in.nextLine());
        System.out.println ("Enter time: ");
        time = Integer.parseInt (in.nextLine());
    }
    
    void calc()
    {
        it = ((pr * rt * time) / 100);
    }

    void display()
    {
        super.display();
        System.out.println ("Rate: " + rt);
        System.out.println ("Time: " + time);
        System.out.println ("Simple Interest: " + it);
    }
}
