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
// the most complex method so far due to the spa option for dogs staying over 2 days, so I will inflection key points in the method
    //every branch leads to a reset of the application back to the welcome text one way or another so thats its always ready
    //for the next customer
    public void  newDog() {
        Dog currentDog = new Dog(getAnimalType(), getAnimalName(), getAnimalAge(), getLengthStay());
        if (getDogSpaces() > 0) {                                                                                          // checks if dog spaces are available
            System.out.println("There are " + getDogSpaces() + " spaces available, continue check in!");                   //if there are checkin continues
        }
        else {
            System.out.println("There are no available spaces for your pet at this time!");                                 //if not the application resets
            dogOperation.welcomeText();
        }
        if (getLengthStay() >= 2) {                                                                                        // checks if dog is staying more than 2 days
            System.out.println("They are eligible for the spa treatment. Would they like to order it?(Yes/No)");           //offers spa treatment if they are
            statusHold = dogInput.nextLine();

            if (statusHold.equalsIgnoreCase("yes")) {                                                          //if spa treatment is wanted it changes spa status and
                setSpaStatus(true);                                                                                        // continues the checkin narrative
                System.out.println("The spa treatment has been added to the stay!");
                System.out.println("Your pet " + currentDog.getPetName() + " is getting booked for " +
                        currentDog.getDaysStay() + " days and will be getting the spa treatment. Can I " +
                        "process your oder at this time?(Yes/No)");
                answerHold = dogInput.nextLine();                                                                         //asks if order can be processed
                if (answerHold.equalsIgnoreCase("yes")) {                                                      //if it can dogid gets incremented and available spaces
                    dogMap.put(getDogIdCounter(), currentDog.getPetName());                                                //gets decremented
                    System.out.println("Dog bookings: " + dogMap);
                    System.out.println("Cat bookings: " + catMap);
                    incrementDogId();
                    setDogSpaces(getDogSpaces()-1);
                    System.out.println("Your order with us has been processed!");
                    System.out.println("There are "+ getDogSpaces() + "  dog spaces and "+ getCatSpaces()+ " cat spaces left!");
                    dogOperation.welcomeText();
                }
                    else {
                    System.out.println("Form Reset!");                                                                          //if order cant be processed, reset application
                    System.out.println("There are "+ getDogSpaces() + "  dog spaces and "+ getCatSpaces()+ " cat spaces left!");
                    dogOperation.welcomeText();
                    }
                }
            else{                                                                                                           //spa option was declined so checkin narrative
                System.out.println("Your pet " + currentDog.getPetName() + " is getting booked for " +                      //and conditional continues without spastatus being
                        currentDog.getDaysStay() + " days and will be not getting the spa treatment. Can I " +              //updated since it is set to false as default
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
        else {                                                                                                          //the dog is not staying for 2 days or greater so
            setSpaStatus(false);                                                                                        // checkin process continues but forgoing the conditionals
            System.out.println("Your " + currentDog.getPetName() + " is booking for " +                                 //for spa status
                    currentDog.getDaysStay() + " days and will not be getting the spa treatment. Can I " +
                    "process your oder at this time?(Yes/No)");
            answerHold = dogInput.nextLine();
            if (answerHold.equalsIgnoreCase("yes")) {                                                          //order confirmation conditional
                dogMap.put(getDogIdCounter(), currentDog.getPetName());
                incrementDogId();
                System.out.println("Dog bookings: " + dogMap);
                System.out.println("Cat bookings: " + catMap);
                setDogSpaces(getDogSpaces()-1);
                System.out.println("Your order with us has been processed!");
                System.out.println("There are "+ getDogSpaces() + " spaces left!");
                dogOperation.welcomeText();
            }
            else {                                                                                                         // order declined and reset conditional
                System.out.println("Form Reset!");
                System.out.println("There are "+ getDogSpaces() + "  dog spaces and "+ getCatSpaces()+ " cat spaces left!");
                dogOperation.welcomeText();
            }
        }


    }
}


