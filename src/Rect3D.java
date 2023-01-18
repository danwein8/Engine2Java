import java.awt.Graphics;

public class Rect3D
{
	int x;
	int y;
	int z;

	int w;
	int h;

	double d = 512;


	public Rect3D(int x, int y, int z, int w, int h)
	{
		this.x = x;
		this.y = y;
		this.z = z;

		this.w = w;
		this.h = h;
	}

	public void moveUp(double dy)
	{
		y -= dy;		
	}

	public void moveDown(double dy)
	{
		y += dy;		
	}



	public void draw(Graphics g)
	{
		int x1 = (int)(d / z  * x) + Origin.x;
		int y1 = (int)(d / z  * y) + Origin.y;

		int x2 = (int)(d / z  * (x  + w)) + Origin.x;
		int y2 = (int)(d / z  * y) + Origin.y;

		int x3 = (int)(d / (z+h)  * (x + w)) + Origin.x;
		int y3 = (int)(d / (z+h)  * y) + Origin.y;

		int x4 = (int)(d / (z+h)  * x) + Origin.x;
		int y4 = (int)(d / (z+h)  * y) + Origin.y;


		int[] x_points = {x1, x2, x3, x4};
		int[] y_points = {y1, y2, y3, y4};

		g.drawPolygon(x_points,  y_points,  4);
	}

	public boolean overlapsXY(Rect3D r)
	{
		return (  x +   w >= r.x) &&
				(r.x + r.w >=   x) &&
				(r.y + r.h >=   y) &&
				(  y +   h >= r.y);
	}

	public boolean overlapsXZ(Soldier3D s)
	{
		return (  x + w >= s.x) &&
				(s.x     >=   x) &&
				(s.z     >=   z) &&
				(  z + h >= s.z);
	}

}