public class Main {
    public static void main(String[] args){
        CargoFlight vuelo1 = new CargoFlight();
        Flight[] listaDeAviones = new Flight[5];
        listaDeAviones[0] = new Flight();
        listaDeAviones[1] = new Flight();
        listaDeAviones[2] = new CargoFlight();


        vuelo1.sumarPeso();
        listaDeAviones[0].sumarPeso();
        listaDeAviones[2].sumarPeso();
        
    }
}
