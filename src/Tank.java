import java.awt.*;

public class Tank
{
	double x;
	double y;

	double A;

	public Tank(double x, double y, double A)
	{
		this.x = x;
		this.y = y;
		this.A = A;
	}


	int[] body_y = {-50, -50,  50,  50}; 
	int[] body_x = {-75,  75,  75, -75};

	int[] gun_y = {-5, -5,  5,  5};
	int[] gun_x = {20, 65, 65, 20};

	int[] turret_y = {-20, -20, 20,  20};
	int[] turret_x = {-20,  20, 20, -20};

	int[] l_track_y = {50, 50, 70, 70};
	int[] l_track_x = {-60, 60, 60, -60}; 

	int[] r_track_y = {-50, -50, -70, -70};
	int[] r_track_x = {-60, 60, 60, -60}; 

	public void moveForward(double d)
	{	
		x += d * Math.cos(A * Math.PI / 180);
		y += d * Math.sin(A * Math.PI / 180);		
	}

	public void moveBackward(double d)
	{
		x -= d * Math.cos(A * Math.PI / 180);
		y -= d * Math.sin(A * Math.PI / 180);		
	}

	public void rotateLeft(double dA)
	{
		A -= dA;
	}

	public void rotateRight(double dA)
	{
		A += dA;
	}

	public void draw(Graphics g)
	{
		g.drawLine((int)x, (int)y, (int)x, (int)y);


		int[] x_points = new int[4];
		int[] y_points = new int[4];

		for(int i = 0; i < x_points.length; i++)
		{
			x_points[i] = (int)(body_x[i] * Math.cos(A * Math.PI / 180) - body_y[i] * Math.sin(A * Math.PI / 180) + x);
			y_points[i] = (int)(body_x[i] * Math.sin(A * Math.PI / 180) + body_y[i] * Math.cos(A * Math.PI / 180) + y);
		}

		g.drawPolygon(x_points,   y_points, 4);

		for(int i = 0; i < x_points.length; i++)
		{
			x_points[i] = (int)(gun_x[i] * Math.cos(A * Math.PI / 180) - gun_y[i] * Math.sin(A * Math.PI / 180) + x);
			y_points[i] = (int)(gun_x[i] * Math.sin(A * Math.PI / 180) + gun_y[i] * Math.cos(A * Math.PI / 180) + y);
		}

		g.drawPolygon(x_points,   y_points, 4);



		for(int i = 0; i < x_points.length; i++)
		{
			x_points[i] = (int)(turret_x[i] * Math.cos(A * Math.PI / 180) - turret_y[i] * Math.sin(A * Math.PI / 180) + x);
			y_points[i] = (int)(turret_x[i] * Math.sin(A * Math.PI / 180) + turret_y[i] * Math.cos(A * Math.PI / 180) + y);
		}

		g.drawPolygon(x_points,   y_points, 4);



		for(int i = 0; i < x_points.length; i++)
		{
			x_points[i] = (int)(l_track_x[i] * Math.cos(A * Math.PI / 180) - l_track_y[i] * Math.sin(A * Math.PI / 180) + x);
			y_points[i] = (int)(l_track_x[i] * Math.sin(A * Math.PI / 180) + l_track_y[i] * Math.cos(A * Math.PI / 180) + y);
		}

		g.drawPolygon(x_points,   y_points, 4);


		for(int i = 0; i < x_points.length; i++)
		{
			x_points[i] = (int)(r_track_x[i] * Math.cos(A * Math.PI / 180) - r_track_y[i] * Math.sin(A * Math.PI / 180) + x);
			y_points[i] = (int)(r_track_x[i] * Math.sin(A * Math.PI / 180) + r_track_y[i] * Math.cos(A * Math.PI / 180) + y);
		}

		g.drawPolygon(x_points,   y_points, 4);

	}

}