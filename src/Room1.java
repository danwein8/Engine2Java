import java.awt.*;

public class Room1 extends Room
{
	Rect3D floorbounds = new Rect3D(-75, 80, 50, 150, 140);

	Rect3D door = new Rect3D(-25, 80, 192, 50, 30);

	public Room1()
	{
		background  = Toolkit.getDefaultToolkit().getImage("Hall 1 Door wide.png");;

		origin_x = 873;
		origin_y = 540;


		room[1] = this;
	}


	public void inGameLoop()
	{
		if(door.overlapsXZ(soldier))
		{
			current_room = room[2];

			soldier.z = 20;
		}
		else
			if(soldier.isNotWithin(floorbounds))
			{
				soldier.pushedBackInto(floorbounds);
			}
	}



}