import java.awt.*;

public class ImageLayer
{
	Image image;

	int depth;


	double zoom = 1;

	int w = 720;
	int h = 360;

	public ImageLayer(String filename, int depth)
	{
		this.image = Toolkit.getDefaultToolkit().getImage(filename);

		this.depth = depth;
	}

	public void zoomIn(double dzoom)
	{
		zoom *= 1 + dzoom;
	}

	public void zoomOut(double dzoom)
	{
		zoom /= 1 + dzoom;
	}


	public void draw(Graphics g)
	{

		for(int i = 0; i < 20; i++)

			g.drawImage(image, (int)((0 + i*720 - Camera.x / depth) * zoom), 0-Camera.y, (int)(w*zoom), (int)(h*zoom),  null);


		//g.drawImage(image, 0 + i*720 - Camera.x / depth, 0-Camera.y, null);
	}

}