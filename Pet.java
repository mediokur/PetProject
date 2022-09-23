import java.util.HashMap;
import java.util.Scanner;
public abstract class Pet{
    private String petType;
    private String petName;
    private int petAge;
    private static int dogSpaces = 30;
    private static int catSpaces = 12;
    private int daysStay;
    private double amountDue;
    private boolean isDog = false;

    private static String animalType;

    private static String animalName;

    private static int animalAge;

    private static int lengthStay;
    private static int dogIdCounter = 0;
    private static int catIdCounter = 0;

    static Scanner homeInput = new Scanner(System.in);

    public static String getAnimalType() {
        return animalType;
    }

    public static void setAnimalType(String animalType) {
        Pet.animalType = animalType;
    }

    public static String getAnimalName() {
        return animalName;
    }

    public static void setAnimalName(String animalName) {
        Pet.animalName = animalName;
    }

    public static int getAnimalAge() {
        return animalAge;
    }

    public static void setAnimalAge(int animalAge) {
        Pet.animalAge = animalAge;
    }

    public static int getLengthStay() {
        return lengthStay;
    }

    public static void setLengthStay(int lengthStay) {
        Pet.lengthStay = lengthStay;
    }

    public static int getCatIdCounter() {
        return catIdCounter;
    }

    public static void setCatIdCounter(int catIdCounter) {
        Pet.catIdCounter = catIdCounter;
    }
    public int getDogIdCounter() {
        return dogIdCounter;
    }

    public void setDogIdCounter(int idCounter) {
        Pet.dogIdCounter = idCounter;
    }
    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public int getDogSpaces() {
        return dogSpaces;
    }

    public void setDogSpaces(int dogSpaces) {
        Pet.dogSpaces = dogSpaces;
    }

    public int getCatSpaces() {
        return catSpaces;
    }

    public void setCatSpaces(int catSpaces) {
        Pet.catSpaces = catSpaces;
    }

    public int getDaysStay() {
        return daysStay;
    }

    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
    public boolean getisDog() {
        return isDog;
    }

    public void setDog(boolean dog) {
        isDog = dog;
    }

    //these are basic maps as I quickly learned that this application would need a SQL connection to work properly
    //since I am not sure how to make the data persist without using a database of some sort--- or i can design this as
    //a server run application where certain maps lists and graphs are persisted through continuous operation
    static HashMap<Integer, String> dogMap = new HashMap<>();
    static HashMap<Integer, String> catMap = new HashMap<>();

    //incrementing method


    //this method is the op template for the welcome screen, look in operations for customization
    public void welcomeText(){
        System.out.println("We can only house dogs and cats. Is their pet a dog?--(Yes/No)");
            setAnimalType(homeInput.nextLine());
        System.out.println("How many days will their pet be staying with us?");
            setLengthStay(homeInput.nextInt());
        System.out.println("What is their pet's name?");
            setAnimalName(homeInput.nextLine());
        System.out.println("How old is their pet in years?");
            setAnimalAge(homeInput.nextInt());

    }
    public void incrementDogId(){
        Pet.dogIdCounter++;
    }
    public void incrementCatId(){
        Pet.catIdCounter++;
    }

}
