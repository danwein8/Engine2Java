public class Camera3D
{
	static double x = 0;
	static double y = 0;
	static double z = 0;

	public static void moveIn(double dz)
	{
		z += dz;
	}

	public static void moveOut(double dz)
	{
		z -= dz;
	}

	public static void moveLeft(double dx)
	{
		x -= dx;
	}

	public static void moveRight(double dx)
	{
		x += dx;
	}

	public static void moveUp(double dy)
	{
		y -= dy;
	}

	public static void moveDown(double dy)
	{
		y += dy;
	}




}