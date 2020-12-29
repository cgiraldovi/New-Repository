public class Flight {
    private int peso;

    public void sumarPeso(){
        System.out.println("Clase flight");
    }

    public boolean equals (Object o){
        if (!(o instanceof Flight)){
            return false;
        }
        Flight flight = (Flight) o;
        return peso == flight.peso;
    }

}
