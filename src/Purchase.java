//********************************************************* 
 
/* 
 * In this file, complete tasks as identified below, only inside of the commented areas 
 */ 
 
import javax.swing.JOptionPane; 
public class Purchase { 

public static void main(String[] args) { 
    final int MAX_ITEMS = 3;  
    // BEGIN: Create an array of type Products, called items 
      // END

      Product[] items = new Product[MAX_ITEMS];

    populateItems(items); 
    displayReceipt(items); 
 } 
 
    private static void populateItems(Product[] items) { 
 
// BEGIN: In the items array, hardcode the creation of one book, one DVD, and one consulting service 
 
items[0] = new Book("The story of java",23);
items[1] = new DVD("Lost Story", 20, "mistory");
items[2] = new ConsultingService("Toms Talk", 90, 2);

// END 
 } 
 
 private static void displayReceipt(Product[] items) { 
 String receipt = "***Bob's Retail Store***\n\n"; 
 double total = 0; 
// BEGIN: Loop through all of the items in the array of type Product to calculate the total, and print out the item's cost 
// and a String representation of the item for each item  
 for(int i = 0; i < items.length; i++){
  receipt += items[i].toString() + "\n";
  total+= items[i].getCost() ;
 }
// END 
 
// BEGIN: Create one line that will calculate the sales tax based on the total  
double salesTax = 0.06 * total;
// END  
 receipt +="Total: "+ String.format("$%.2f", total) +"\n"; 
 receipt +="Sales Tax: "+ String.format("$%.2f", salesTax) +"\n"; 
 receipt +="Grand Total: "+ String.format("$%.2f", total + salesTax) +"\n";
 JOptionPane.showMessageDialog(null, receipt); 
 } 
} 
 
 
 
//********************************************************* 