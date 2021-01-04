public class EmpleadoPorComision extends Empleado {
    private double _ventasBrutas;
    private double _tarifaComision;

    public EmpleadoPorComision(String nombre, String apellido, String numeroSeguro, double ventas, double tarifa) {
        super(nombre, apellido, numeroSeguro);
        establecerVentasBrutas(ventas);
        establecerTarifaComision(tarifa);
    }

    public void establecerVentasBrutas(double ventas){
        if(ventas > 0)
            _ventasBrutas = ventas;
        else
            _ventasBrutas = 0;
    }

    public void establecerTarifaComision(double tarifa){
        if(tarifa > 0 && tarifa < 1)
            _tarifaComision = tarifa;
        else
            _tarifaComision = 0;
    }

    public double obtenerVentasBrutas(){
        return _ventasBrutas;
    }

    public double obtenerTarifaComision(){
        return _tarifaComision;
    }

    @Override
    public double ingresos() {
        return obtenerTarifaComision() * obtenerVentasBrutas();
    }

    @Override
    public String toString() {
        return "EmpleadoPorComision{" +
                super.toString() +
                "_ventasBrutas=" + obtenerVentasBrutas() +
                ", _tarifaComision=" + obtenerTarifaComision() +
                '}';
    }
}
