import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class GameF22 extends GameBase
{

	Line L1 = new Line(200, 200, 900, 500);

	Tank tank = new Tank(500, 500, 0);

	public void initialize()
	{

	}

	public void inGameLoop()
	{	

		if(pressing[UP])  tank.moveForward(1);
		if(pressing[DN])  tank.moveBackward(1);
		if(pressing[LT])  tank.rotateLeft(1);
		if(pressing[RT])  tank.rotateRight(1);  		

	}

	public void paint(Graphics g)
	{
		if(L1.distanceTo(tank.x, tank.y) < 0)   g.setColor(Color.RED);

		else                                    g.setColor(Color.BLACK);

		tank.draw(g);
		L1.draw(g);
	}

}