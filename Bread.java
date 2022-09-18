import java.util.Scanner;
public class Bread 
 {
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double yeast;
    private String breadName;
    private String recipe;
    private boolean state;
    
    public Bread(double flour, double water, double salt, double sugar, double yeast, String breadName, String recipe, boolean state)
    {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.yeast = yeast;
        this.breadName = breadName;
        this.recipe = recipe;
        this.state = state;
    }
  
    public double getFlour()
    {
        return flour;
    }
    public void setFlour(double flour)
    {
        this.flour = flour;
    }
  
    public double getWater()
    {
        return water;
    }
    public void setWater(double water)
      
    {
        this.water = water;
    }
  
    public double getSalt()
    {
        return salt;
    }
    public void setSalt()
    {
        this.salt = salt;
    }
  
    public double getSugar()
    {
        return sugar;
    }
    public void setSugar(double sugar)
    {
        this.sugar = sugar;
    }
    
    public double getYeast()
    {
        return yeast;
    }
    public void setYeast(double yeast)
    {
        this.yeast = yeast;
    }
  
    public String getBreadName()
    {
        return breadName;
    }
    public void setBreadName(String breadName)
    {
        this.breadName = breadName;
    }

    public String getRecipe()
    {
        return recipe;
    }
    public void setRecipe(String recipe)
    {
        this.recipe = recipe;
    }
  
    public boolean getState()
    {
        return state;
    }
    public void setState(boolean state)
    {
        this.state = state;
    }

    public void bakeState(boolean state)
    {
        if (state == true)
        {
            System.out.println("The bread is baked");
        }
        else
        {
            System.out.println("The bread is not baked");

        }
    }
    public String getIngredients()
    {
        return (flour + " cups of flour + water + " cups of water " + salt + " tsps of salt\n" + yeast + " tsps of yeast");
    }

    
    public String toString()
    {
        return "cups of flour: " + flour + "cups of water: " + water + "tablespoons of salt: " + salt + "tablespoons of yeast: " + yeast + "cups of sugar: " + sugar
                + "Bread Name: " + breadName + "recipe: " + recipe + "cooked or not cooked: " + state;
    }
}
