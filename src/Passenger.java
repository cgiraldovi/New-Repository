public class Passenger {
    private int checkedBags;
    private int freeBags;
    private double perBagFee;

    //Se ha agregado un constructor dentro de otro constructor

    public Passenger (int freeBags){
        this(freeBags > 1 ? 25.0d : 50.0d);
        this.freeBags = freeBags;
    }

    public Passenger (int freeBags, int checkedBags){
        this(freeBags);
        this.checkedBags = checkedBags;
    }

    public void setCheckedBags(int i) {
    }

    public Passenger (double perBagFee){
        this.perBagFee = perBagFee;
    }
}
