import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainMeal {
    
    public static void getMeal() {
    
        String[] Asian = {"Noodles", "Fried Rice", "Porridge", "Curry"};
        String[] Meat = {"Beef", "Chicken", "Pork", "Vegetarian"};
        String[] Western = {"Sandwich", "Burger", "Wrap", "Salad"};
        Scanner user = new Scanner(System.in);
        Random meal = new Random();
        int indexAsian = meal.nextInt(Asian.length), indexWestern = meal.nextInt(Western.length);
        int indexMeat = meal.nextInt(Meat.length);
 
        
        while (true) {
            
            System.out.println("Please pick a cuisine. (Asian/Western)");
            String regionSelection = user.nextLine();
            
            if (regionSelection.equals("Asian")) {
                
                System.out.println("Always a favourite! Why don't you make some " + Meat[indexMeat] + " " + Asian[indexAsian] + " today?");
                break;
            
                } else if (regionSelection.equals("Western")) {
                
                System.out.println("That's a classic. Feel like having a " + Meat[indexMeat] + " " + Western[indexWestern] + " today?");
                break;
            
                } else {
            
                System.out.println(regionSelection + " is not a valid choice. Please choose again.");
            
                }
                        
            }
            
        user.close();
    
        }
    
    
    public static void getRecipe() {
   
        Scanner user = new Scanner(System.in);
        String[] compliments = {"Nice!", "Great, let's keep going.", "Confident, eh?", "Oooooo."};
        Random compliment = new Random();
        int indexCompliments = compliment.nextInt(compliments.length);
        
        while (true) {
            
            System.out.println("Do you need a recipe for this? (Yes/No)");
            String choice = user.nextLine();
        
            if (choice.equals("Yes") || choice.equals("Y") || choice.equals("y") || choice.equals("yes")) {
                
                System.out.println("Click here www.google.com");
                break;
               
                } else if (choice.equals("No") || choice.equals("N") || choice.equals("n") || choice.equals("no")) {
                
                System.out.println(compliments[indexCompliments]);
                break;
            
                } else {
                    
                System.out.println("Sorry, I don't understand you.");
                
                }
                
            }
        
        user.close();
            
        }
        
    
}