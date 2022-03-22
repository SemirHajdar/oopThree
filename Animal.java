package oopThree;

public abstract class Animal {

   private Integer numberOfLegs = 0;
   private Boolean carnivore=false;
   private Double weight = 0.00;

   protected void isCarnivore (){
      if(!carnivore){
          this.carnivore = true;
          System.out.println("This Animal is Carnivore.");
      } else {
          System.out.println("This Animal is Herbivore.");
      }
   }
   protected void weightCheck (Double number){
        if (weight>10.00) {
            System.out.println("Animal is fat.");
        } else {
            System.out.println("Animal is not fat.");
        }
   }
   protected void fourLeggedCheck (int number) {
       if (number==4) {
           printFourLegged();
       }
   }
   // ove dvije metode printFourLegged i fourLeggedCheck
   // mozda nemaju smisla ali sam ubacio da pokazem da je neka metoda private a neka protected

   private void printFourLegged(){
           System.out.println("This animal is four-legged.");
       }
    protected Integer getNumberOfLegs() {

       return numberOfLegs;
    }
    protected void setNumberOfLegs(Integer numberOfLegs) {

       this.numberOfLegs = numberOfLegs;
    }
    protected Boolean getCarnivore() {

       return carnivore;
    }
    protected void setCarnivore(Boolean carnivore) {

       this.carnivore = carnivore;
    }
    protected Double getWeight() {

       return weight;
    }
    protected void setWeight(Double weight) {

       this.weight = weight;
    }
}

//1. Napraviti apstraktnu klasu Animal i dodati atribute i metode
//        2. Napraviti child klasu Dog koja nasljedjuje Animal
//        3. Napraviti child klasu Cat koja nasljedjuje Animal
//        4. Napraviti child klasu SiameseCat koja nasljedjuje Cat
//
//
//        U mainu treba:
//        - instancirati Dog, Cat, SiameseCat
//        - iz svakog objekta pozvati i vlastite ali i parent metode
//
//        Note: Paziti na to sta ce se expose-ati preko gettera/settera, koristiti protected za metode,
//        atribute koji ne bi trebali da budu dostupni javno korisniku klasa.