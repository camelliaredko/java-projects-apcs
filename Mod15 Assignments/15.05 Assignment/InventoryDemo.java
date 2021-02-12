/**
 * This program displays information about products, such as price, quantity, etc.
 * 
 * @author Olga Redko
 * @version 3/18/2017
 */
import java.util.List;
import java.util.ArrayList;
public class InventoryDemo
{
    public static void takeInventory(List<Product> item, String name)
    {
        int quantity = 0;
        double totalCost = 0;
        
        for(int i = 0; i < item.size(); i++)
        {
            if(item.get(i).getName().equals(name))
            {
                quantity++;
                totalCost += item.get(i).getCost();
            }
        }
        System.out.println(name + ": Quantity = " + quantity + ", Total cost = " + totalCost);
    }
    
    public static void main(String[] args)
    {
        List<Product> item = new ArrayList<Product>();
        
		item.add(new Car("Jaguar", 100000.00));
		item.add(new Car("Neon", 17000.00));
		item.add(new Car("JigSaw", 149.18));
		item.add(new Car("Jaguar", 110000.00));
		item.add(new Car("Neon", 17500.00));
		item.add(new Car("Neon", 17875.32));
		item.add(new Car("RAM", 35700.00));
		item.add(new Car("CircularSaw", 200.00));
		item.add(new Car("CircularSaw", 150.00));
		
		
		takeInventory(item, "Jaguar");
		takeInventory(item, "Neon");
		takeInventory(item, "JigSaw");
		takeInventory(item, "Jaguar");
		takeInventory(item, "RAM");
		takeInventory(item, "CircularSaw");
		
	    Tool saw1 = new Tool("Chained Saw", Math.PI);
		Tool saw2 = new Tool("SeeSaw", Math.E);
		
		if(saw1.compareTo(saw2) < 0)
		{
		    System.out.println("The second saw is more expensive.");
		}
		else if(saw1.compareTo(saw2) == 0)
		{
		    System.out.println("Both saws are the same price.");
		}
		else
		{
		    System.out.println("The first saw is more expensive.");
		}
    }
}
