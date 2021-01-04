public class Main {
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Sue", "Jones", "333-33-3333", 10000, .06);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
        System.out.println("Empleados procesados por separado:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n",
                empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                empleadoBaseMasComision,
                "ingresos", empleadoBaseMasComision.ingresos());

        // crea un arreglo Empleado de cuatro elementos
        Empleado empleados[] = new Empleado[4];

        // inicializa el arreglo con objetos Empleado
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        System.out.println("Empleados procesados en forma polimorfica:\n");

        // procesa en forma genérica a cada elemento en el arreglo de empleados
        for (Empleado empleadoActual : empleados) {
            System.out.println(empleadoActual); // invoca a toString

            // determina si el elemento es un EmpleadoBaseMasComision
            if (empleadoActual instanceof EmpleadoBaseMasComision) {
                // conversión descendente de la referencia de Empleado
                // a una referencia de EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado =
                        (EmpleadoBaseMasComision) empleadoActual;

                double salarioBaseAnterior = empleado.obtenerSalarioBase();
                empleado.establecerSalarioBase(1.10 * salarioBaseAnterior);
                System.out.println("el nuevo salario base con 10 de aumento es : " + empleado.obtenerSalarioBase());
            } // fin de if

            System.out.printf(
                    "ingresos $ %, .2f\n\n", empleadoActual.ingresos());
        } // fin de for

        // obtiene el nombre del tipo de cada objeto en el arreglo de empleados
        for (int j = 0; j < empleados.length; j++) {
            System.out.println("El empleado  es un " + j +
                    empleados[j].getClass().getName());
        }

        if(empleadoAsalariado instanceof EmpleadoPorHoras){} else {}
    }

}
