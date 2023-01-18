import java.awt.*;

public class Line
{
	double Ax;
	double Ay;

	double Bx;
	double By;

	double Nx;
	double Ny;

	double c;

	public Line(double x1, double y1, double x2, double y2)
	{
		Ax = x1;
		Ay = y1;

		Bx = x2;
		By = y2;

		double Vx = Ax - Bx;
		double Vy = Ay - By;

		double mag = Math.sqrt(Vx * Vx - Vy*Vy);

		double Ux = Vx / mag;
		double Uy = Vy / mag;

		Nx = -Uy;
		Ny =  Ux;

		c = -Ax * Nx - Ay * Ny;	
	}


	public double distanceTo(double Px, double Py)
	{
		return Px * Nx + Py * Ny + c;
	}

	public void draw(Graphics g)
	{
		g.drawLine((int)Ax, (int)Ay, (int)Bx, (int)By);
	}

}