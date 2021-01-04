public class EmpleadoAsalariado extends Empleado {
    private double _salarioSemanal;


    public EmpleadoAsalariado(String nombre, String apellido, String numeroSeguro, double salario) {
        super(nombre, apellido, numeroSeguro);
        establecerSalario(salario);
    }

    public void establecerSalario(double salario){
        if(salario > 0){
            _salarioSemanal = salario;
        } else {
            _salarioSemanal = 0;
        }
    }
    public double obtenerSalario (){
        return _salarioSemanal;
    }

    @Override
    public double ingresos() {
        return obtenerSalario();
    }

    @Override
    public String toString() {
        return "EmpleadoAsalariado{" +
                super.toString() + " "
                +  "_salarioSemanal=" + obtenerSalario() + " " +
                '}';
    }
}
