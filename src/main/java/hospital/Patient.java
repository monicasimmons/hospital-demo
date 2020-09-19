package hospital;

public class Patient {

    private int healthLevel;
    private int bloodLevel;

    public int getHealthLevel() {
        return healthLevel;
    }

    public int getBloodLevel() {
        return bloodLevel;

    }
    //default constructor for a patient object
    public Patient() {          //no arguments, no variables here. so that's why we could make different constructor that takes on variables
        healthLevel = 10;  //default patient health level
        bloodLevel = 20;    //default patient blood level
    }

    //overloaded constructor    - can duplicate references as long as they have different signatures (what goes in your parentheses)
    //constructors are very popular code blocks to overload
    public Patient(int healthLevel, int bloodLevel) {           //here creating custom patient that has specific health level and blood level
        this.healthLevel = healthLevel;
        this.bloodLevel = bloodLevel;
    }
    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;
    }

    public void decreaseBloodLevel(int bloodDecreaseAmount) {
        bloodLevel -= bloodDecreaseAmount;
    }
}
