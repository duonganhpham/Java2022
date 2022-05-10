public class Aims {
    public static void main(String[] args){
        Order anOrder = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Aller");
        dvd1.setLength(87);
        //add the dvd to the order
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc( "Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        //add the dvd to the order
        anOrder.addDigitalVideoDisc(dvd3);
       // System.out.print("Total cost is: ");
       // System.out.println (anOrder.totalCost());
       // System.out.print("Total cost voucher 20% is: ");
        //System.out.println (anOrder.totalCost(0.2f));
        dvd1.updateCost(dvd1.getCost(), 0.5f);
        System.out.print("Cost: ");
        System.out.print(dvd1.getCost());
        System.out.print("\n");
        dvd1.updateCost(dvd1, 0.5f);
        System.out.print("Cost: ");
        System.out.print(dvd1.getCost());
    }
}

