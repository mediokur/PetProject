import java.util.Scanner;

public class Dog extends Pet {
    Scanner dogInput = new Scanner(System.in);
    private boolean spaStatus;
    private String answerHold;
    private String statusHold;
    Operations dogOperation = new Operations();

    public boolean getSpaStatus() {
        return spaStatus;
    }
    public void setSpaStatus(boolean spaStatus) {
        this.spaStatus = spaStatus;
    }
    //constructor will provide the template for initializing an object from our inputs
    public Dog(String type, String name, int age, int stay) {
        this.setPetType(type);
        this.setPetName(name);
        this.setPetAge(age);
        this.setDaysStay(stay);
    }

    public void  newDog() {
        Dog currentDog = new Dog(getAnimalType(), getAnimalName(), getAnimalAge(), getLengthStay());
        if (getDogSpaces() > 0) {
            System.out.println("There are " + getDogSpaces() + " spaces available, continue check in!");
        }
        else {
            System.out.println("There are no available spaces for your pet at this time!");
            dogOperation.welcomeText();
        }
        if (getLengthStay() >= 2) {
            System.out.println("They are eligible for the spa treatment. Would they like to order it?(Yes/No)");
            statusHold = dogInput.nextLine();

            if (statusHold.equalsIgnoreCase("yes")) {
                setSpaStatus(true);
                System.out.println("The spa treatment has been added to the stay!");
                System.out.println("Your pet " + currentDog.getPetName() + " is getting booked for " +
                        currentDog.getDaysStay() + " days and will be getting the spa treatment. Can I " +
                        "process your oder at this time?(Yes/No)");
                answerHold = dogInput.nextLine();
                if (answerHold.equalsIgnoreCase("yes")) {
                    dogMap.put(getDogIdCounter(), currentDog.getPetName());
                    System.out.println("Dog bookings: " + dogMap);
                    System.out.println("Cat bookings: " + catMap);
                    incrementDogId();
                    setDogSpaces(getDogSpaces()-1);
                    System.out.println("Your order with us has been processed!");
                    System.out.println("There are "+ getDogSpaces() + "  dog spaces and "+ getCatSpaces()+ " cat spaces left!");
                    dogOperation.welcomeText();
                }
                    else {
                    System.out.println("Form Reset!");
                    System.out.println("There are "+ getDogSpaces() + "  dog spaces and "+ getCatSpaces()+ " cat spaces left!");
                    dogOperation.welcomeText();
                    }
                }
            else{
                System.out.println("Your pet " + currentDog.getPetName() + " is getting booked for " +
                        currentDog.getDaysStay() + " days and will be getting the spa treatment. Can I " +
                        "process your oder at this time?(Yes/No)");
                answerHold = dogInput.nextLine();
                if (answerHold.equalsIgnoreCase("yes")) {
                    dogMap.put(getDogIdCounter(), currentDog.getPetName());
                    System.out.println("Dog bookings: " + dogMap);
                    System.out.println("Cat bookings: " + catMap);
                    incrementDogId();
                    setDogSpaces(getDogSpaces()-1);
                    System.out.println("Your order with us has been processed!");
                    System.out.println("There are "+ getDogSpaces() + "  dog spaces and "+ getCatSpaces()+ " cat spaces left!");
                    dogOperation.welcomeText();
                }
                else {
                    System.out.println("Form Reset!");
                    System.out.println("There are "+ getDogSpaces() + "  dog spaces and "+ getCatSpaces()+ " cat spaces left!");
                    dogOperation.welcomeText();
                }
            }
            }
        else {
            setSpaStatus(false);
            System.out.println("Your " + currentDog.getPetName() + " is booking for " +
                    currentDog.getDaysStay() + " days and will not be getting the spa treatment. Can I " +
                    "process your oder at this time?(Yes/No)");
            answerHold = dogInput.nextLine();
            if (answerHold.equalsIgnoreCase("yes")) {
                dogMap.put(getDogIdCounter(), currentDog.getPetName());
                incrementDogId();
                System.out.println("Dog bookings: " + dogMap);
                System.out.println("Cat bookings: " + catMap);
                setDogSpaces(getDogSpaces()-1);
                System.out.println("Your order with us has been processed!");
                System.out.println("There are "+ getDogSpaces() + " spaces left!");
                dogOperation.welcomeText();
            }
            else {
                System.out.println("Form Reset!");
                System.out.println("There are "+ getDogSpaces() + "  dog spaces and "+ getCatSpaces()+ " cat spaces left!");
                dogOperation.welcomeText();
            }
        }


    }
}


