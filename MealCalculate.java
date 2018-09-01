/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meal.calculate;

import java.util.Scanner;

/**
 *
 * @author Shakil
 */
public class MealCalculate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        
        double tax=(double)  tax_percent;
        double tip=(double) tip_percent;
      
        double mealwithouttax=(meal_cost*tax/100);
        double mealwithouttip=(meal_cost*tip/100);
        
        double total_cost=meal_cost+mealwithouttax+mealwithouttip;
        int cost=(int) Math.round(total_cost);
        System.out.println("The total meal cost is "+cost+" dollars.");
        in.close();
    }
    
}
