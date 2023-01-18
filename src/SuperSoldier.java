import java.awt.Graphics;

public class SuperSoldier
{
	double px;
	double py;

	double vx = 0;
	double vy = 0;

	double ax = 0;
	double ay = 0;

	Animation[] anim;

	static final int UP = 0;
	static final int DN = 1;
	static final int LT = 2;
	static final int RT = 3;

	int pose = RT;

	boolean moving = false;


	public SuperSoldier(int px, int py)
	{
		this.px = px;
		this.py = py;

		anim = new Animation[4];

		String[] pose = {"up", "dn", "lt", "rt"};

		for(int i = 0; i < anim.length; i++)
		{
			anim[i] = new Animation("g_" + pose[i] +"_", 5, ".GIF", 10);
		}	
	}

	public void setVelocity(double vx, double vy)
	{
		this.vx = vx;
		this.vy = vy;
	}


	public void setAcceleration(double ax, double ay)
	{
		this.ax = ax;
		this.ay = ay;
	}



	public void moveBasedOnPhysics()
	{
		px += vx;
		py += vy;

		vx += ax;
		vy += ay;
	}



	public void draw(Graphics g)
	{
		if(moving)		g.drawImage(anim[pose].currentImage(), (int)px-Camera.x, (int)py-Camera.y, null);

		else           g.drawImage(anim[pose].stillImage(), (int)px-Camera.x, (int)py-Camera.y, null);

		moving = false;

		//g.drawRect(x, y, w, h);
	}

}