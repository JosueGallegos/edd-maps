import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        //runEjerccios();
    }

    private static void runEmpleadoExample() {
        //throw new UnsupportedOperationException("Not implemented yet");
        EmpleadoContoller empCtrl = new EmpleadoContoller();
        empCtrl.addEmpleado(new Empleado(1, "Pablo", "Developer"));
        empCtrl.addEmpleado(new Empleado(2, "Pablo", "Analyst"));
        empCtrl.addEmpleado(new Empleado(3, "Miguel", "Developer"));
        empCtrl.addEmpleado(new Empleado(400, "Mario", "Tester"));

        empCtrl.imprimirEmpleados();

    }

    private static void runMapExample() {
        //throw new UnsupportedOperationException("Not implemented yet");
        new Mapa();
    }

    private static void runEjerccios() {
        //throw new UnsupportedOperationException("Not implemented yet");

    }
}
