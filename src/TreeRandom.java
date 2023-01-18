import java.util.*;

public class TreeRandom extends Tree
{
	static Random rnd = new Random(500);

	public TreeRandom(double x, double y, double z, double w, double h)
	{
		super(rnd.nextInt(5)+1, x + rnd.nextInt(25), y, z + rnd.nextInt(25), w + rnd.nextInt(10), h + rnd.nextInt(4));
	}

}