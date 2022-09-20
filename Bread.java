import java.util.Scanner;
public class Bread 
 {
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double yeast;
    private String breadName;
    private boolean state;
    private String recipe;
    
    public Bread(double flour, double water, double salt, double sugar, double yeast, String breadName,String recipe, boolean state)
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
    public void setSalt(double salt)
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
        return (flour + " Cups of flour + water + " Cups of water " + salt + " Tablespoons of salt " + yeast + " Tablespoons of yeast");
    }

    
    public String toString()
    {
        return "Cups of flour: " + flour + "Cups of water: " + water + "Tablespoons of salt: " + salt + "Tablespoons of yeast: " + yeast + "Cups of sugar: " + sugar + "Bread Name: " + breadName + "Baked or not Baked: " + state + "Recipe: " + recipe;
    }
}
