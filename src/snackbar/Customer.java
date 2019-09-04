package snackbar;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
        
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

    public void addCash(double addedCash)
    {
        cashOnHand = cashOnHand + addedCash;
    }

    public double getCashOnHand()
    {
        return cashOnHand;
    }

    public void buy(double usedCash)
    {
        cashOnHand = cashOnHand - usedCash;
    }
}