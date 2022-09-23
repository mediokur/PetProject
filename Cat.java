import java.util.Scanner;

public class Cat extends Pet {
    Scanner catInput = new Scanner(System.in);
    private String answerHold;

    Operations catOperation = new Operations();

    //constructor for basic cat object
    public Cat(String type, String name, int age, int stay) {
        this.setPetType(type);
        this.setPetName(name);
        this.setPetAge(age);
        this.setDaysStay(stay);
    }

    //this method and its loops perform the iteration for building a cat object from the information taken from operations
    //and the loop follows through to completion by restarting the loop in operations.welcometext() the welcome point
    //for the user interface
    public void newCat() {
        Cat currentCat = new Cat(getAnimalType(), getAnimalName(), getAnimalAge(), getLengthStay()); //this builds our object and sets the data for the object
        if (getCatSpaces() > 0) {
            System.out.println("There are " + getCatSpaces() + " spaces available, continue check in!");
        } else {
            System.out.println("There are no available spaces for your pet at this time!");
            catOperation.welcomeText();
        }
        System.out.println("Your pet " + currentCat.getPetName() +
                " is getting booked for " + currentCat.getDaysStay() +
                " days. Can I process your order at this time?(Yes/No)" );
        answerHold = catInput.nextLine();
        if (answerHold.equalsIgnoreCase("yes")){
            catMap.put(getCatIdCounter(), currentCat.getPetName());
            System.out.println("Cat bookings: " + catMap);
            System.out.println("Dog bookings: " + dogMap);
            incrementCatId();
            setCatSpaces(getCatSpaces()-1);
            System.out.println("There are "+ getDogSpaces() + "  dog spaces and "+ getCatSpaces()+ " cat spaces left!");
            catOperation.welcomeText();
        }
        else{
            System.out.println("Form Reset!");
            System.out.println("There are "+ getDogSpaces() + "  dog spaces and "+ getCatSpaces()+ " cat spaces left!");
            catOperation.welcomeText();
        }
    }
}





