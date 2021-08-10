import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class dessert {

    public static void getDessert() {
        
        String[] desserts = {"Ice-cream", "Fruits", "Cake"};
        String[] fruits = {"Oranges", "Kiwis", "Strawberries", "Grapes", "Apples"};
        Random dessert = new Random();
        int indexDesserts = dessert.nextInt(desserts.length), indexFruits = dessert.nextInt(fruits.length);
        Scanner user = new Scanner(System.in);
        String randomChoice = desserts[indexDesserts];
        
        while (true) {
        
            System.out.println("Fancy a dessert? (Yes/No)");
            String choice = user.nextLine();
            
            if (choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("Y")) {

                System.out.println("You should have some " + randomChoice + ".");
            
                if (randomChoice.equals("Fruits")) {
                    
                    System.out.println("Why don't you grab some " + fruits[indexFruits] + "?");
                    break;
                    
                    } else {
                    
                    break;
                    
                    }
            
                } else if (choice.equalsIgnoreCase("No") || choice.equalsIgnoreCase("N")) {
                    
                    System.out.println("Gotcha.");
                    break;
                    
                } else {
                
                System.out.println("Sorry, I don't understand you.");
                    
                }
            
                }
 
            user.close();
   
 
    }

}
