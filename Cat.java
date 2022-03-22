package oopThree;

public class Cat extends Animal{

    private Boolean pet = true;
    private Boolean shortHair = true;
    private Boolean stripe = true;

    public Cat (Integer numberOfLegs,Boolean carnivore,Double weight,Boolean pet, Boolean shortHair, Boolean stripe){
        this.setNumberOfLegs(numberOfLegs);
        this.setCarnivore(carnivore);
        this.setWeight(weight);
        this.pet = pet;
        this.shortHair=shortHair;
        this.stripe = stripe;

    }
    protected void isPet () {
        if (pet) {
            System.out.println("Cat is pet.");
        } else {
            System.out.println("Cat is not pet.");
        }
    }
    protected void isShortHair () {
        if (shortHair){
            this.shortHair = true;
            System.out.println("Cat has shot hair.");
        } else {
            System.out.println("Cat has long hair.");
        }
    }
    protected void stripeCheck (){
        if (stripe) {
            this.stripe = true;
            System.out.println("Cat has stripes.");
        } else {
            System.out.println("Cat has not stripes.");
        }
    }
    protected Boolean getPet() {
        return pet;
    }

    protected void setPet(Boolean pet) {
        this.pet = pet;
    }

    protected Boolean getShortHair() {
        return shortHair;
    }

    protected void setShortHair(Boolean shortHair) {
        this.shortHair = shortHair;
    }

    protected Boolean getStripe() {
        return stripe;
    }

    protected void setStripe(Boolean stripe) {
        this.stripe = stripe;
    }
}
