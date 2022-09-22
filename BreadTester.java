public class BreadTester 
{
    public static void main(String[] args) 
    {
        Bread sourdough1 = new SourdoughBread(5.00, 1.50, 2.50, 0.00, 1.00, "Sourdough Bread", "Old Fashioned Sourdough Bread", true , 1.00);
        System.out.println(sourdough1.getIngredients());
        System.out.println(sourdough1.getRecipe());
        sourdough1.bakeState(sourdough1.getState());
      
      
        Bread fruitPastry = new Pastry(1.75, 0.5, 1.75, 2.00, 0 , "Fruit and Cream Cheese Pastries ", "Simple Breakfast Pastries", true, 6 , 2);
        System.out.println(fruitPastry.getIngredients());
        System.out.println(fruitPastry.getRecipe());
        b3.bakeState(fruitPastry.getState());

        Bread vanillaCake = new Cake(1.50, 0.5, 1.00, 0, "Vanilla Cake", "Easy and Tasty Vanilla Cake", false, 0.5, 2, 2);
        System.out.println(b4.getIngredients());
        System.out.println(b4.getRecipe());
        b4.bakeState(b4.getState());

        Bread appleStrudel = new Strudel(0, 0, 0, 6.0, 0, "Apple Strudel", "Tasty Apple Strudels", true, 2, "Apples", 3, 0.5, 1.00, 1.00);
        System.out.println(appleStrudel.getIngredients());
        System.out.println(appleStrudel.getRecipe());
        b5.bakeState(appleStrudel.getState());


        Bread chocolateCroissants = new ChocolateCroissant(0, 1.00, 0, 0, 0, "Chocolate Croissants", "Quick Chocolate Croissants", false, 1, 1);
        System.out.println(b6.getIngredients());
        System.out.println(b6.getRecipe());
        b6.bakeState(b6.getState());
    }
}
