import java.util.*;
class Compound extends Accounts
{
    double rt; int time; double it;
    Compound (int acc, double pp, double rr, int tt)
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
        it = (pr * Math.pow (1 + (rt/100), time)) - pr;
    }

    void display()
    {
        super.display();
        System.out.println ("Rate: " + rt);
        System.out.println ("Time: " + time);
        System.out.println ("Compound Interest: " + it);
    }
}