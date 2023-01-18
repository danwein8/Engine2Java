import java.awt.Graphics;

public class Character3D
{
	double x;
	double y;
	double z;

	double w;
	double h;

	double d = 512;


	Animation[] anim;

	static final int UP = 0;
	static final int DN = 1;
	static final int LT = 2;
	static final int RT = 3;

	int pose = RT;

	boolean moving = false;

	boolean visible = true;

	public Character3D(String name, double x, double y, double z, double w, double h)
	{
		this.x = x;
		this.y = y;
		this.z = z;

		this.w = w;
		this.h = h;

		anim = new Animation[4];

		String[] pose = {"up", "dn", "lt", "rt"};

		for(int i = 0; i < anim.length; i++)
		{
			anim[i] = new Animation(name + "_" + pose[i] +"_", 5, ".GIF", 10);
		}	
	}


	public void moveLeft(double dx)
	{
		x -= dx;

		pose = LT;

		moving = true;
	}

	public void moveRight(double dx)
	{
		x += dx;

		pose = RT;

		moving = true;
	}


	public void moveUp(double dy)
	{
		y -= dy;

		pose = UP;

		moving = true;
	}

	public void moveDown(double dy)
	{
		y += dy;

		pose = DN;

		moving = true;
	}

	public void moveIn(double dz)
	{
		z += dz;

		pose = UP;

		moving = true;
	}

	public void moveOut(double dz)
	{
		z -= dz;

		pose = DN;

		moving = true;
	}

	public boolean isNotWithin(Rect3D r)
	{
		return true;
		//! r.overlapsXZ(this);
	}

	public void pushedBackInto(Rect3D r)
	{
		if(z > r.z+r.h)  z = r.z+r.h;
		if(z < r.z)      z = r.z;
		if(x < r.x)      x = r.x;
		if(x > r.x+r.w)  x = r.x+r.w;
	}


	public void draw(Graphics g)
	{
		if(visible)
		{
			int x3D = (int)(d / z *(x - w / 2)) + Origin.x; 
			int y3D = (int)(d / z *(y - h))     + Origin.y;
			int w3D = (int)(d / z * w);
			int h3D = (int)(d / z * h);

			if(moving)		g.drawImage(anim[pose].currentImage(), x3D, y3D, w3D, h3D, null);

			else           g.drawImage(anim[pose].stillImage(),   x3D, y3D, w3D, h3D, null);

			moving = false;
		}

		g.drawString("(" + x + ", " + y + ", " + z + ")", 100, 100);
	}

}