public class cake extends Bread
{
    private double milk;
    private int eggs;
    private int vanillaExtract;
    
    public cake(double flour, double water, double salt, double sugar, double yeast, String type, String recipe, boolean state, double milk, int eggs, int vanillaExtract)
    {
        super(flour, water, salt, sugar, yeast, type, recipe, state);
        this.milk = milk;
        this.eggs = eggs;
        this.vanillaExtract = vanillaExtract;
    }
    
    public double milk() 
    {
        return milk;
    }

    public void setMilk(double milk) 
    {
        this.milk = milk;
    }
    
    public int eggs()
    {
        return eggs;
    }

    public void setEggs(int eggs)
    {
        this.eggs = eggs;
    }
    
    public int vanillaExtract()
    {
        return vanillaExtract;
    }

    public void setVanillaExtract(int vanillaExtract)
    {
        this.vanillaExtract = vanillaExtract;
    }
    
    public String getRecipe()
    {
        return("The recipe for this cake: "
        + "1: Preheat the oven to 350 F. Grease and flour a 9-inch square cake pan.
        + "2: Mix sugar and butter together in a mixing bowl. Add eggs, one at a time, beating briefly after each addition. Mix in vanilla extract."
        + "3:Mix flour and yeast in seperate bowl and add wet ingredients. mix well. Add milk and stir until smooth. Pour batter into the prepared cake pan."
        + "4: Bake in the preheated oven until the top springs back when lightly touched, 30 to 40 minutes. Remove from over, let sit for 15 mins and enjoy.");
    }

    public String getIngredients(){
        return("The ingredients for this cake: " + milk + " Cups of milk " + eggs + "  large eggs"+ vanillaExtract + " Teaspoons of vanilla extract " + super.getIngredients());
    }
}
