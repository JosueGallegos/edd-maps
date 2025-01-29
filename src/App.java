import controllers.EmpleadoContoller;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        //throw new UnsupportedOperationException("Not implemented yet");
        EmpleadoContoller empleadoContoller = new EmpleadoContoller();
        boolean result = empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso: "+ result);
        result = empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso: "+ result);
        System.out.println();

        empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        empleadoContoller.addEmpleado(new Empleado(2, "Juan", "Senior"));
        empleadoContoller.addEmpleado(new Empleado(3, "Andres", "Senior"));

        empleadoContoller.displayEmpleadosEntry();
        System.out.println();
        empleadoContoller.displayEmpleadosSoloNombre();
        System.out.println();
        empleadoContoller.displayLlaves();
        System.out.println();
        empleadoContoller.displayEmpleados();


        
        
    }

    private static void runMapExamlpe() {
        Mapa m = new Mapa();
        m.HashMap();
        m.LinkedHashMap();
        m.TreeHasMap();
        System.out.println();
        
    }

    private static void runEjerccios() {
        //throw new UnsupportedOperationException("Not implemented yet");

    }
}
