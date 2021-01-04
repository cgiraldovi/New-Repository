public class EmpleadoPorHoras extends Empleado {
    private double _sueldo;
    private double _horas;

    public EmpleadoPorHoras(String nombre, String apellido, String numeroSeguro, double sueldo, double horas) {
        super(nombre, apellido, numeroSeguro);
        establecerSueldo(sueldo);
        establecerHoras(horas);
    }

    public void establecerHoras(double horas){
        _horas = horas;
    }

    public void establecerSueldo(double sueldo){
        if(sueldo > 0)
            _sueldo = sueldo;
        else
            _sueldo = 0;
    }

    public double obtenerSueldo(){
        return _sueldo;
    }

    public double obtenerHoras(){
        return _horas;
    }


    @Override
    public double ingresos() {
        if(obtenerHoras() <= 40){
            return obtenerSueldo() * obtenerHoras();
        } else {
            return 40 * obtenerSueldo() + (obtenerHoras()-40) * obtenerSueldo() * 1.5;
        }
    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{" +
                super.toString() +
                "_sueldo=" + obtenerSueldo() +
                ", _horas=" + obtenerHoras() +
                '}';
    }
}
