package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Ulku Cardak",
                buildingNumber = "50",
                streetName = "Essex",
                city = "London",
                state = "England",
                postCode = "EN2 7HW",
                address = name + "\n" + buildingNumber +" " + streetName + "\n" + city +", " + state +", " + postCode;
        /* Creating  a variable which named addrees is usefull
        because if you want to use again this data, it will be easy.

         */

        System.out.println("Shipping Address is : ");
        System.out.println(address);


    }
}
