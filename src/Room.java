import java.awt.*;

public abstract class Room
{
	public static Room current_room;

	public static Room[] room = new Room[10];

	Image background;

	int origin_x;
	int origin_y;

	static Soldier3D soldier;

	public static void addToAllRooms(Soldier3D soldier)
	{
		Room.soldier = soldier;
	}


	public abstract void inGameLoop();


	public void draw(Graphics g)
	{
		Origin.setCoordinates(origin_x, origin_y);

		g.drawImage(background, 0, 0, null);

		soldier.draw(g);
	}

}