
public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int qtyOrdered;
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if( qtyOrdered < MAX_NUMBERS_ORDERED){
            itemsOrdered[qtyOrdered]=disc;
            qtyOrdered++;
        }
        else{
            System.out.println("ko dc");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i=0; i < qtyOrdered; i++){
            if (itemsOrdered[i].getTitle().equals(disc.getTitle())){       
            }       
        }
    }
    public float totalCost(){
        float sum = 0;
        for (int i=0; i < qtyOrdered; i++){
            sum = sum + itemsOrdered[i].getCost();
        }
        return sum;
    }
} 

