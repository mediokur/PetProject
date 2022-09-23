public class Operations extends Pet{



    //built this class in case I wanted to create other methods around the operations(logging, storing, retrieving, etc.)
    //of the application and it welcomeText method is the opening point for the user interface as the moment
    public void welcomeText(){

        Dog operationDog = new Dog(getAnimalType(), getAnimalName(), getAnimalAge(), getLengthStay());
        Cat operationCat = new Cat(getAnimalType(), getAnimalName(), getAnimalAge(), getLengthStay());
        System.out.println("We can only house dogs and cats. Is their pet a dog?--(Yes/No)");
        setAnimalType(homeInput.nextLine());
        System.out.println("How many days will their pet be staying with us?");
        setLengthStay(homeInput.nextInt());
        homeInput.nextLine();
        System.out.println("What is their pet's name?");
        setAnimalName(homeInput.nextLine());
        System.out.println("How old is their pet in years?");
        setAnimalAge(homeInput.nextInt());
        homeInput.nextLine();
            if (getAnimalType().equalsIgnoreCase("yes")){ //this is the break point at which depending on the type
                setDog(true);                                       //of pet its build that respective object and goes through
                operationDog.newDog();                              // their conditional loops by calling their methods

            }
            else{
                operationCat.newCat();
            }

    }
}
