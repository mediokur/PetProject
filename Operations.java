public class Operations extends Pet{


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
            if (getAnimalType().equalsIgnoreCase("yes")){
                setDog(true);
                operationDog.newDog();

            }
            else{
                operationCat.newCat();
            }

    }
}
