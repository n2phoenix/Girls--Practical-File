class D2Point
{
    double x, y;
    D2Point()
    {
        x = y = 0.0;
    }
    
    D2Point(double nx, double ny)
    {
        x = nx;
        y = ny;
    }
    
    double distance2d (D2Point b)
    {
        return Math.sqrt (Math.pow (x - b.x, 2) + Math.pow (y - b.y, 2));
    }
}