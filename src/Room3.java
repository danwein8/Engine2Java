import java.awt.Toolkit;

public class Room3 extends Room
{

	public Room3()
	{
		background  = Toolkit.getDefaultToolkit().getImage("Hall 4 Left Window Right Door wide low.png");;

		origin_x = 873;
		origin_y = 315;


		room[3] = this;
	}


	public void inGameLoop()
	{
		soldier.visible = true;

		if(soldier.x < -75)   soldier.x = -75;


		if(soldier.x >  75)
		{
			if((soldier.z > 110) && (soldier.z < 140))
			{
				current_room = room[2];

				soldier.x = -250;
			}
			else     soldier.x =  75;
		}

		if(soldier.z > 190)   soldier.z = 190;

		if(soldier.z < 25)   soldier.z = 25;




	}



}