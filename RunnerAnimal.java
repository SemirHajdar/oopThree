package oopThree;

public class RunnerAnimal {
    public static void main(String[] args) {

//--------------------------------------------------------------------------------------/
        Dog myDog = new Dog (4,true,15.5,true);
        myDog.isCarnivore(); //metoda iz parent classe Animal
        myDog.weightCheck(myDog.getWeight()); //metoda iz parent classe Animal
        myDog.fourLeggedCheck(myDog.getNumberOfLegs());//metoda iz parent classe Animal
        myDog.withTail();//metoda iz child classe Dog

//--------------------------------------------------------------------------------------/
        Cat myCat = new Cat(4,true,4.00,true, false, true);
        myCat.isCarnivore();//metoda iz parent classe Animal
        myCat.weightCheck(myCat.getWeight());//metoda iz parent classe Animal
        myCat.fourLeggedCheck(myCat.getNumberOfLegs());//metoda iz parent classe Animal
        myCat.isPet();//metoda iz child classe Cat
        myCat.isShortHair();//metoda iz child classe Cat
        myCat.stripeCheck();//metoda iz child classe Cat

//--------------------------------------------------------------------------------------/

        SiameseCat mySiameseCat = new SiameseCat(4,true,8.00,true,true,false,true);
        mySiameseCat.isCarnivore();//metoda iz parent classe Animal
        mySiameseCat.weightCheck(mySiameseCat.getWeight());//metoda iz parent classe Animal
        mySiameseCat.fourLeggedCheck(mySiameseCat.getNumberOfLegs());//metoda iz parent classe Animal
        mySiameseCat.isPet();//metoda iz child classe Cat
        mySiameseCat.isShortHair();//metoda iz child classe Cat
        mySiameseCat.stripeCheck();//metoda iz child classe Cat
        mySiameseCat.isWhiteFur();//metoda iz child classe SiameseCat
    }
}
