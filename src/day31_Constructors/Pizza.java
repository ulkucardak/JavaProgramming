package day31_Constructors;

public class Pizza {

    public String size;
    public int numberofCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(String size, int numberofCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberofCheeseTopping = numberofCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double priceOfPizza=0;
       if(size.equals("S")){
           priceOfPizza = (10 +2*(numberofCheeseTopping+numberOfPepperoniTopping));
       }else if(size.equals("M")){
           priceOfPizza = (12 +2*(numberofCheeseTopping+numberOfPepperoniTopping));
       }else {
           priceOfPizza = (14 +2*(numberofCheeseTopping+numberOfPepperoniTopping));
       }
       return priceOfPizza;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberofCheeseTopping=" + numberofCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", priceOfPizza= $" + calcCost() +
                '}';
    }
}
/*
Pizza Task:
    	Attributes:
    		size, numberofCheeseTopping, numberOfPepperoniTopping

    		Add a constructor that can set all the fields

		Actions:
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */