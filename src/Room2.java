import java.awt.*;

public class Room2 extends Room
{
	Rect3D floorbounds = new Rect3D(-75, 80, 50, 150, 140);

	public Room2()
	{
		background  = Toolkit.getDefaultToolkit().getImage("Hall 3 T-junction wide low.png");;

		origin_x = 873;
		origin_y = 315;


		room[2] = this;
	}


	public void inGameLoop()
	{
		soldier.visible = true;


		if(soldier.z < 20)
		{
			if((soldier.x >= -25) && (soldier.x <= 25))
			{
				current_room = room[1];

				soldier.z = 190;
			}

			else soldier.z = 25;
		}

		if((soldier.x < -75) && (soldier.z < 100))
		{	
			soldier.x = -75;
		}

		if((soldier.x > 75) && (soldier.z < 100))
		{	
			soldier.x = 75;
		}

		if((soldier.x < -77 ) && (soldier.z < 102))
		{
			soldier.z = 102;
		}

		if(soldier.z > 190)   soldier.z = 190;

		if((soldier.z > 100) && (512.0 / soldier.z * soldier.x < -430))  soldier.visible = false;

		if((soldier.z > 100) && (512.0 / soldier.z * soldier.x > 430))  soldier.visible = false;


		if(soldier.x < -250)
		{
			current_room = room[3];

			soldier.x = 75;

			soldier.z = 125;
		}

	}



}