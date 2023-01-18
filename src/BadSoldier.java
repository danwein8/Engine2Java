public class BadSoldier extends Soldier3D
{
	public BadSoldier(int x, int y, int z, int w, int h)
	{
		super(x, y, z, w, h);
	}



	public void chase(Soldier3D soldier)
	{
		int xdiff = (int)Math.abs(x - soldier.x) ; 
		int zdiff = (int)Math.abs(z - soldier.z) ; 

		if((zdiff < 200) && (xdiff < 200))
		{
			if(zdiff > 10)
			{
				if (z > soldier.z)   moveOut(2);
				else
					if (z < soldier.z)   moveIn(2);
			}

			if(xdiff > 10)
			{
				if (x > soldier.x)   moveLeft(2);
				else
					if (x < soldier.x)   moveRight(2);
			}
		}
	}


	public void evade(Soldier soldier)
	{
		if((Math.abs(x - soldier.x) < 200) && (Math.abs(y - soldier.y) < 200))
		{
			if (y > soldier.y)   moveDown(4);
			else
				if (y < soldier.y)   moveUp(4);

			if (x > soldier.x)   moveRight(4);
			else
				if (x < soldier.x)   moveLeft(4);	
		}
	}



}