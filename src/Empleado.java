abstract class Empleado {
    private String _primerNombre;
    private String _apellido;
    private String _numeroSeguroSocial;

    public Empleado (String nombre, String apellido, String numeroSeguro){
        _primerNombre = nombre;
        _apellido = apellido;
        _numeroSeguroSocial = numeroSeguro;
    }

    public void establecerNombre(String nombre){
        _primerNombre = nombre;
    }

    public void establecerApellido(String apellido){
        _apellido = apellido;
    }

    public void establecerNumeroSeguroSocial (String numeroSeguro){
        _numeroSeguroSocial = numeroSeguro;
    }

    public String obtenerNombre (){
        return _primerNombre;
    }

    public String obtenerApellido(){
        return _apellido;
    }

    public String obtenerNumeroSeguroSocial(){
        return _numeroSeguroSocial;
    }

    public abstract double ingresos();

    @Override
    public String toString() {
        return "Empleado{" +
                "_primerNombre='" + obtenerNombre() + '\'' +
                ", _apellido='" + obtenerApellido() + '\'' +
                ", _numeroSeguroSocial=" + obtenerNumeroSeguroSocial() +
                '}';
    }
}
