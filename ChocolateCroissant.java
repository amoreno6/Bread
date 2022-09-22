public class ChocolateCroissant
{
    private int eggs;
    private int chocolate;
    
    public pastry(double flour, double water, double salt, double sugar, double yeast, String breadName, String recipe, boolean state, int eggs, int chocolate)
    {
        
        super(flour, water, salt, sugar, yeast, breadName, recipe, state);
        this.eggs = eggs;
        this.chocolate = chocolate;
    }
       public int eggs()
    {
            return eggs;
    }

    public void setEggs(int eggs)
    {
        this.eggs = eggs;
    }
  
    public int chocolate()
    {
      return chocolate;
    }
    public void setChoclate(int chocolate)
    {
      this.chocolate = chocolate;
    }
 
     public String getRecipe()
     {
        return("The reciepe for Chocolate Croissants is: "
        + "1. Heat oven to 350F and line two baking sheets with parchment paper or non-stick baking mat."
        + "2. Beat the egg and water in a small bowl with a fork or whisk then set aside."
        + "3. Lightly flour your work surface. Unfold the pastry sheet then lightly dust top with flour. Use a rolling pin to roll the sheet into a 16-inch square. Cut pastry square in half then cut each half into four rectangles. Now, cut each rectangle diagonally into two triangles."
        + "4. Place about 2 teaspoons of the chocolate chips down the center of each triangle. Then, starting at the wider end, roll each triangle up. Place each croissant seam-side down so that the tip of the triangle is tucked under the rolled croissant. Then, bend in the edges, creating a crescent shape. Lightly brush tops of croissants with egg wash."
        + "5. Bake 20 to 25 minutes or until they are golden brown."
     }
      
      public String getIngredients()
      {
        return "The ingredients for Chocolate Croissants: " + eggs + " egg(s) " + chocolate + " Cups of chocolate " + super.getIngredients();
      }
  
