public class Passenger {
    private int checkedBags;
    private int freeBags;
    private double perBagFee;

    //Se trabajara con la visibilidad de los constructores

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

    private Passenger (double perBagFee){
        this.perBagFee = perBagFee;
    }

    //Al dejar el constructor como privado, solo los demas constructores podran ingresar a el
    //asi que hay que tener cuidado que le ingresamos a lo objetos (en este caso solo int
    // para referenciar a los constructores que usan int que estan publicos y no double que es
    // el constructor que esta en privado)
}
