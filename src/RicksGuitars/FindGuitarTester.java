package RicksGuitars;

import java.util.List;

public class FindGuitarTester {

    private List searchResults;

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        Guitar whatLookingFor = new Guitar("", (double) 0, "Fender", "Stratocastor",
                "Electric", "Alder","Alder");

        Guitar guitar = inventory.search(whatLookingFor);

        if (guitar !=null){
            System.out.println("You might like this: " + guitar.getSerialNumber() + " " +
                    guitar.getPrice()); //and whatever other details you desire
        }
        else {
            System.out.println("Sorry, we have nothing for you.");
        }


    }

    private static void initialiseInventory(Inventory inventory) {
        inventory.addGuitar("V00001",
                1499.99,
                "Fender" ,
                "Stratocastor",
                "Electric",
                "Alder",
                "Alder");

        inventory.addGuitar("V00002",
                1699.99,
                "Fender",
                "Stratocastor",
                "Acoustic",
                "Alder",
                "Alder");

        inventory.addGuitar("V00003",
                899.99,
                "Fender" ,
                "Stratocastor",
                "Electric",
                "Alder",
                "Alder");

    }
}
