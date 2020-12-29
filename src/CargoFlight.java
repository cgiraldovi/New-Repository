
public class CargoFlight extends Flight {
    public float maxCargoSpace = 1000.0f;
    public float usedCargoSpace;
    public int wolly;

    public void add1Package(float h, float w, float d) {
        float size = h * w * d;
        if (hasCargoSpace(size))
            usedCargoSpace += size;
        else
            handleNoSpace();
    }

    private boolean hasCargoSpace(float size){
        return usedCargoSpace + size <= maxCargoSpace;
    }
    private void handleNoSpace(){
        System.out.println("Not enought space");
    }

    public void sumarPeso(){
        System.out.println("Clase cargoFlight");
    }
}
