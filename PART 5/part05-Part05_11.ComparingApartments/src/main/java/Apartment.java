
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared){
        if(squares>compared.squares){
            return true;
        }else{
            return false;
        }
    }
    public int priceDifference(Apartment compared){
        if(largerThan(compared)){
            return squares*princePerSquare-compared.squares*compared.princePerSquare;
        }else{
             return compared.squares*compared.princePerSquare-squares*princePerSquare;
        }
    }
    public boolean moreExpensiveThan(Apartment compared){
         if(squares*princePerSquare >compared.squares*compared.princePerSquare){
            return true;
        }else{
            return false;
        }
    }

}
