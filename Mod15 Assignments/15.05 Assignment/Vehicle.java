/**
 * This program displays information about products, such as price, quantity, etc.
 * 
 * @author Olga Redko
 * @version 3/18/2017
 */
public abstract class Vehicle implements Product
{
    String name;
    double cost;
    
    Vehicle(String name, double cost)
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
}