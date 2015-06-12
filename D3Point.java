class D3Point
{
    double x, y, z;
    D3Point()
    {
        x = y = z = 0.0;
    }
    
    D3Point(double nx, double ny, double nz)
    {
        x = nx;
        y = ny;
        z = nz;
    }
    
    double distance3d (D3Point b)
    {
        return Math.sqrt (Math.pow (x - b.x, 2) + Math.pow (y - b.y, 2) + Math.pow (z - b.z, 2));
    }
}