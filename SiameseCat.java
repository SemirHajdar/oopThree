package oopThree;

public class SiameseCat extends Cat {

    private Boolean whiteFur = true;

    public SiameseCat (Integer numberOfLegs, Boolean carnivore, Double weight, Boolean pet, Boolean shortHair, Boolean stripe,Boolean whiteFur) {
        super(numberOfLegs, carnivore, weight, pet, shortHair, stripe); //"super" mi je samo izbacilo i to je bio jedini nacin na koji sam mogao uraditi konstruktor u Klasi Cat
        this.whiteFur = whiteFur;
    }
    protected void isWhiteFur () {
        if (whiteFur) {
            this.whiteFur = true;
            System.out.println("This Siamese Cat has a white fur.");
        } else {
            System.out.println("This Siamese Cat has not a white fur.");
        }
    }
    protected Boolean getWhiteFur() {

        return whiteFur;
    }

    protected void setWhiteFur(Boolean whiteFur) {

        this.whiteFur = whiteFur;
    }
}
