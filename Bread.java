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
    
    public Bread(double flour, int water, int salt, int sugar, int yeast, String breadName, boolean state, String recipe)
    {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = state;
        this.recipe = recipe;
        
    }
  
    public double getFlour()
    {
        return flour;
    }
    public void setFlour(double flour)
    {
        this.flour = flour;
    }
  
    public int getWater()
    {
        return water;
    }
    public void setWater(int water)
      
    {
        this.water = water;
    }
  
    public int getSalt()
    {
        return salt;
    }
    public void setSalt(int salt)
    {
        this.salt = salt;
    }
  
    public int getSugar()
    {
        return sugar;
    }
    public void setSugar(int sugar)
    {
        this.sugar = sugar;
    }
    
    public int getYeast()
    {
        return yeast;
    }
    public void setYeast(int yeast)
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

    public boolean getState()
    {
        return state;
    }
    public void setState(boolean state)
    {
        this.state = state;
    }
 
    public String getRecipe()
    {
        return recipe;
    }
    public void setRecipe(String recipe)
    {
        this.recipe = recipe;
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
        return "Cups of flour: " + flour + "Cups of water: " + water + "Tablespoons of salt: " + salt + "Tablespoons of yeast: " + yeast + "Cups of sugar: " + sugar
                + "Bread Name: " + breadName + "Baked or not Baked: " + state + "Recipe: " + recipe;
    }
}
