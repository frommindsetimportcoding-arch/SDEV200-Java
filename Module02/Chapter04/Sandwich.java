// Nathan Thomas
// p. 156
// Programming Exercises 1A and 1B

public class Sandwich
{
    private String protein;
    private String bread;
    private String cheese;
    private String condiment;
    private double price;

    public Sandwich(String protein, String bread, String cheese, String condiment)
    {
        this.protein = protein;
        this.bread = bread;
        this.cheese = cheese;
        this.condiment = condiment;
        this.price = 8.00;
    }

    public Sandwich()
    {
        this("", "", "", "");
    }

    public void setProtein(String protein)
    {
        this.protein = protein;
    }

    public String getProtein()
    {
        return protein;
    }

    public void setBread(String bread)
    {
        this.bread = bread;
    }

    public String getBread()
    {
        return bread;
    }

    public void setCheese(String cheese)
    {
        this.cheese = cheese;
    }

    public String getCheese()
    {
        return cheese;
    }

    public void setCondiment(String condiment)
    {
        this.condiment = condiment;
    }

    public String getCondiment()
    {
        return condiment;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }
}
