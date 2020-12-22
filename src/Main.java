public class Main {
    public static void main(String[] args){
        /*Passenger bob = new Passenger();
          En este caso el constructor es automaticamente generado por java*/

        //bob.setCheckedBags(3); //java crea el metodo en Passenger

        Passenger nia = new Passenger(2);
        //Passenger jojo = new Passenger(0.1d); no se puede
        Passenger santiago = new Passenger(2, 3);
    }
}
