package snackbar;

public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendId;

    public Snack(String name, int quantity, double cost, int vendId)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendId = vendId;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public double getCost()
    {
        return cost;
    }
    
    public void setVendId(int vendId)
    {
        this.vendId = vendId;
    }
    public int getVendId()
    {
        return vendId;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void addQuantity(int addAmount)
    {
        quantity = quantity + addAmount;
    }

    public double buySnack(int howMany)
    {
        quantity = quantity - howMany;
        return howMany * cost;
    }

    public double returnTotalCost(int howMany)
    {
        quantity = quantity - howMany;
        return howMany * cost;
    }
@Override
public String toString()
{
    String rtnStr = "name: "+ name + "\n" +
                    "Vending Machine name: " + vendId + "\n" +
                    "Quantity: "+ quantity + "\n" +
                    "Cost of total Quantity: "+ quantity * cost + "\n";
    return rtnStr;
}

}