public class Strudel extends Bread
{
    private int butter;
    private String fruit;
    private int fruitAmt;
    private double cinnamon; 
    private double milk;
    private int eggs;
    
    public pastry(double flour, double water, double salt, double sugar, double yeast, String breadName, String recipe, boolean state, int butter, String fruit, int fruitAmt, double cinnamon, double milk, int eggs)
    {
        super(flour, water, salt, sugar, yeast, type, recipe, state);
        this.butter = butter;
        this.fruit = fruit;
        this.fruitAmt = fruitAmt;
        this.cinnamon = cinnamon;
        this.milk = milk;
        this.eggs = eggs;
    }
    
    public int getButter() 
    {
        return butter;
    }

    public void setButter(int butter) 
    {
        this.butter = butter;
    }
    
    public String getFruit() 
    {
          return fruit;
    }

    public void setFruit(String fruit) 
    {
          this.fruit = fruit;
    }
     public String getFruitAmt() 
    {
          return fruitAmt;
    }

     public void setFruitAmt(int fruitAmt) 
    {
          this.fruitAmt = fruitAmt;
    }
    public double getCinnamon() 
    {
        return cinnamon;
    }
    public double getCinnamon() 
    {
        return cinnamon;
    }
    public void setCinnamon(double cinnamon) 
    {
        this.cinnamon = cinnamon;
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
    
    
    public String getRecipe()
    {
        return ("The recipe for a Strudel is : " 
        + "1: Preheat the oven to 425 F and Set the puff pastry sheet on the counter to thaw." 
        + "2: Peel and core the apples and slice them thinly." 
        + "3: Melt the butter over medium low heat."
        + "4: Add the fruit of your choice to the pan along with the sugar and cinnamon." 
        + "5: Sauté the fruit for around 5 minutes, until they're coated with sauce. Turn off the heat, then leave the fruit to cool completely."
        + "6: Mix together the beaten egg and the milk.
        + "7: Roll out the puff pastry into a rectangular shape. Pile the fruit mixture down the center of the pastry, leaving an inch of pastry at the sides, and the top fruit-free."
        + "8: Fold the top and bottom of the pastry over the fruit mixture, then fold 1 of the sides over the top, covering half of the fruit. Using the egg and milk mixture as a pastry glue, brush the exposed edge of the pastry before folding the other side of the pastry, slightly overlapping the first half."
        + "9: Roll the pastry over so the folded part is on the bottom and place on a baking sheet. Score the top of the strudel with a sharp knife."
        + "10: Brush the top of the pastry with the egg and milk, then sprinkle with the remaining sugar.
        + "11: Bake the strudel for 25 minutes until the pastry is golden and flaky. Allow the strudel to cool for 20 minutes before serving and enjoy!");
    }
   
    public String getIngredients(){
        return "The ingredients for a Strudel: "+ butter + " Tablespoons of butter "+ fruitAmt + "Cups of " + fruit + Cinnamon + " Teaspoons of Cinnamon " + milk + " Cups of milk " + eggs + " egg(s) + super.getIngredients();
    }
}
