public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double _salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellido, String numeroSeguro, double ventas, double tarifa, double salario) {
        super(nombre, apellido, numeroSeguro, ventas, tarifa);
        establecerSalarioBase(salario);
    }

    public void establecerSalarioBase(double salario){
        if(salario > 0)
            _salarioBase = salario;
        else
            _salarioBase = 0;
    }

    public double obtenerSalarioBase(){
        return _salarioBase;
    }

    public double ingresos (){
        return obtenerSalarioBase() + super.ingresos();
    }

    @Override
    public String toString() {
        return "EmpleadoBaseMasComision{" +
                super.toString() +
                "_salarioBase=" + obtenerSalarioBase() +
                '}';
    }
}
