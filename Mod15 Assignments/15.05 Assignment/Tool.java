/**
 * This program displays information about products, such as price, quantity, etc.
 * 
 * @author Olga Redko
 * @version 3/18/2017
 */
public class Tool implements Product, Comparable<Tool>
{
    public String name;
    public double cost;
    
    Tool(String name, double cost)
    {
        this.name = name;
        this.cost = cost;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public int compareTo(Tool obj)
    {
        if (this.cost < obj.cost)
        {
            return -1;
        }
        else if (this.cost == obj.cost)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}