public class SourdoughBread extends Bread
{
    
    private double sourdoughStarter;
    public SourdoughBread(double flour, double water, double salt, double yeast, String breadName, String recipe, boolean state,double sourdoughStarter)
    {
        super(flour, water, salt, sugar, yeast, breadName, recipe, state);
        this.sourdoughStarter = sourdoughStarter;
    }

    public double getSourdoughStarter() 
    {
        return sourdoughStarter;
    }

    public void setSourdoughStarter(double sourdoughStarter) 
    {
        this.sourdoughStarter = sourdoughStarter;
    }

    public String getRecipe()
    {
        return ("The recipe for a sourdough bread: "
        + "1: Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter."
        + "2: Make the dough."
        + "3: Bulk rise."
        + "4: Stretch and fold the dough."
        + "5: Cut and shape the dough."
        + "6: Second rise and preheat the oven to 450 F towards the tail end of the second rise."
        + "7: Spray the loaf with luke warm water."
        + "8: Bake the bread at 400 F for 20 minutes, until deep golden brown."
        + "9: Remove the bread from the oven and let the bread cool until ready to eat.");
    }
    // The ingredient methodd for the sourdough bread
    public String getIngredients(){
        return("The ingredients for the Sourdough Bread: "+ super.getIngredients() + sourdoughStarter + " cup of ripe sourdough starter");
    }
}
