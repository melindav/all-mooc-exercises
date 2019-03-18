
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
     public boolean larger(Apartment otherApartment){
        if(this.squareMeters>otherApartment.squareMeters){
            return true;
        }
        else return false;
     }
     public int priceDifference(Apartment otherApartment){
         int price1=this.pricePerSquareMeter*this.squareMeters;
         int price2=otherApartment.squareMeters*otherApartment.pricePerSquareMeter;
         if(price1>price2){
            return (price1-price2);
         }
         else return (price2-price1);
     }
    public boolean moreExpensiveThan(Apartment otherApartment){
        int price1=this.pricePerSquareMeter*this.squareMeters;
        int price2=otherApartment.squareMeters*otherApartment.pricePerSquareMeter;
        if(price1>price2){
            return true;
        }
        else return false;
             
    }
}
