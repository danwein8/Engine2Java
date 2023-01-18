import java.awt.*;

public class Billboard
{
	double x;
	double y;
	double z;

	double w;
	double h;

	double d = 512;

	Image image;



	public Billboard(String filename, double x, double y, double z, double w, double h)
	{
		this.image = Toolkit.getDefaultToolkit().getImage(filename);

		this.x = x;
		this.y = y;
		this.z = z;

		this.w = w;
		this.h = h;		
	}



	public void draw(Graphics g)
	{
		int x3D = (int)(d / (z - Camera3D.z) *((x - Camera3D.x) - w / 2)) + Origin.x; 
		int y3D = (int)(d / (z - Camera3D.z) *((y - Camera3D.y) - h))     + Origin.y;
		int w3D = (int)(d / (z - Camera3D.z) * w);
		int h3D = (int)(d / (z - Camera3D.z) * h);

		if(z - Camera3D.z > 10)   		g.drawImage(image, x3D, y3D, w3D, h3D, null);

	}

}