package oopThree;

public class Dog extends Animal {

    private Boolean tail = true;

    public Dog (Integer numberOfLegs,Boolean carnivore,Double weight, Boolean tail) {
        this.setNumberOfLegs(numberOfLegs);
        this.setCarnivore(carnivore);
        this.setWeight(weight);
        this.tail = tail;
    }
     protected void withTail () {
        if (tail) {
            this.tail = true;
            System.out.println("Dog has a tail.");
        } else {
            System.out.println("Dog has not a tail.");
        }
    }
    protected Boolean getTail() {

        return tail;
    }

}
