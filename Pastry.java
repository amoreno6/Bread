public class pastry extends Bread
{
    private int butter;
    private int creamCheese;
    private String fruit;
    
    public pastry(double flour, double water, double salt, double sugar, double yeast, String breadName, String recipe, boolean state, int creamCheese, String fruit)
    {
        
        super(flour, water, salt, sugar, yeast, breadName, recipe, state);
        this.creamCheese = creamCheese;
        this.fruit = fruit;
    }
   
    public int getCreamCheese() 
    {
        return creamCheese;
    }

    public void setCreamCheese(int creamCheese) 
    {
        this.creamCheese = creamCheese;
    }
    public String getFruit() 
    {
        return fruit;
    }

    public void setFruit(String fruit) 
    {
        this.fruit = fruit;
    }
    
     public String getRecipe()
     {
        return("The reciepe for this pastry is: "
        + "1. Preheat the oven to 400°F and line two baking sheets with parchment paper or Silpats."
        + "2. In the bowl of a stand mixer fitted with the paddle attachment, beat the cream cheese with the sugar until creamy."
        + "3. Unfold the puff pastry sheets onto a lightly floured work surface. Lightly roll the pastry with a rolling pin to seal the perforations. Use a 4-inch round cookie cutter to cut out four circles from each sheet of puff pastry."
        + "4. Transfer four pastry circles onto each baking sheet.Spread a portion of the cream cheese mixture inside the border of each pastry then top the cream cheese with fruit."
        + "5. Bake the pastries for 15 to 18 minutes or until they’re golden and puffed."
        + "6. Remove the pastries from the oven and allow them to cool for 5 minutes. remove and enjoy!"
     }
      
      public String getIngredients()
      {
        return "The ingredients of this pastry: " + creamCheese + " ounces of cream cheese " + fruit + " cups of fruit of choice" + super.getIngredients();
      }
