//********************************************************* 
 
/* 
 * In this file, do the following things: 
 * 1) Modify the class so that all ConsultingService objects must use the Sellable interface  
 * 2) Create a constructor that takes in a consulting service name, consulting service cost per hour, 
 *    and a consulting service number of hours 
 * 3) Override the getCost() method and return the result of multiplying the consulting service cost per hour by 
 *    the consulting service number of hours 

 * 4) Modify the class so that it inherits from Product 
 */ 
 
 
public class ConsultingService extends Product implements Sellable{ 
private String name; 
private double costPerHour; 
private double numHours; 

public ConsultingService(String name, double costPerHour, double numHours){
    super(name,costPerHour);
    this.name = name;
    this.costPerHour = costPerHour;
    this.numHours = numHours;
}
 
public String getName() { return this.name; } 
public double getCostPerHour() { return this.costPerHour; } 
public double getNumHours() { return this.numHours; } 

public double getCost(){
    return getCostPerHour() * getNumHours(); 
     }

 
public String toString() { 
    return "Consulting Service: "+ getName() +"\n" 
 +"Cost Per Hour: "+ String.format("$%.2f", getCostPerHour()) +"\n" 
 +"Number of Hours: "+ getNumHours() +" hours"; } 
}