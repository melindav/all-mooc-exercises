/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melinda
 */
public class Product {
     private String name;
     private int amount;
      private double price;
    
     public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.name = nameAtStart;
        this.price = priceAtStart; 
        this.amount=amountAtStart;
     }
     public void printProduct(){
        
         System.out.println(this.name+", "+this.price+", "+this.amount);
     }
    
}
