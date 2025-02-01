import controllers.Ejercicios;
import static controllers.Ejercicios.areAnagrams;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import java.util.Arrays;
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
        System.out.println();


        
        
    }

    private static void runMapExamlpe() {
        Mapa m = new Mapa();
        m.HashMap();
        m.LinkedHashMap();
        m.TreeHasMap();
        System.out.println();
        
    }

    private static void runEjerccios() {
        
        
        System.out.println("Ejercicio 1: ");
        System.out.println("str1: listen   , str2: silent "+ " = " +areAnagrams("listen", "silent"));
        System.out.println("str1: hello    , str2: bello "+ " = " + areAnagrams("hello", "bello"));
        System.out.println("str1: triangle , str2: integral " + " = " + areAnagrams("triangle", "integral"));
        
        System.out.println("\nEjercicio 2: ");
        Ejercicios ejercicios = new Ejercicios();
        int[] nums1 = {9, 2, 3, 6};
        System.out.println(Arrays.toString(nums1));
        int objetivo1 = 5;
        System.out.println("Indices para suma 5: " + Arrays.toString(ejercicios.sumatoriaDeDos(nums1, objetivo1)));

        int[] nums2 = {9, 2, 3, 6};
        System.out.println(Arrays.toString(nums2));
        int objetivo2 = 10;
        System.out.println("Indices para suma 10: " + Arrays.toString(ejercicios.sumatoriaDeDos(nums2, objetivo2)));

    }
}
