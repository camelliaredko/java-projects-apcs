/**
 * TestTerrain class.
 * 
 * @author Olga Redko 
 * @version 2/19/2017
 */
public class TestTerrain
{
	public static void main(String []args)
	{
	    Terrain terrain = new Terrain(500, 300);
	    Forest forest = new Forest(100, 200, 100);
	    Mountain mountain = new Mountain(300, 400, 25);
	    WinterMountain wintermountain = new WinterMountain(500, 600, 15, 10);
	    
	    System.out.println(terrain.terrainSize() + ".");
	    System.out.println("Forest " + forest.terrainSize() + " and has " + forest.getTree() + " trees.");
	    System.out.println("Mountain " + mountain.terrainSize() + " and has " + mountain.getMountain() + " mountains.");
	    System.out.println("Winter " + wintermountain.terrainSize() + " and has temperature " + wintermountain.getTemperature() + " and " + wintermountain.getMountain() + " mountains.");
	}
}
