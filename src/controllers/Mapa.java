package controllers;

import java.util.HashMap;

public class Mapa {
    public Mapa() {
        HashMap<String, Integer> mapita = new HashMap<>();
        mapita.put("Manzanas", 20);
        mapita.put("Pera", 25);
        mapita.put("Naranja", 20);
        mapita.put("Pera", 23);

        System.out.println(mapita);
        //Eliminar 
        mapita.remove("Pera");
        System.out.println(mapita);
        //Para ver si han sido eliminadas y debuelve un false o true
        System.out.println("Existe Mandariana -> " + mapita.containsKey("Mandarina"));
        System.out.println("Existe Pera -> " + mapita.containsKey("Pera"));
        
        int valorManzana = mapita.get("Manzanas");
        System.out.println("Valor de Manzana es : " + valorManzana);

        System.out.println(mapita.size());

        System.out.println("Esta vacio ? " + mapita.isEmpty());

        System.out.println( "\n Claves de mapas ");
        for(String clave : mapita.keySet()){
            System.out.println(" - " + clave);

        }
        System.out.println("\n Valores de mapas ");
        for(Integer value : mapita.values()){
            System.out.println(" - " + value);

        }
        System.out.println();
        System.out.println(mapita);
        mapita.replaceAll((k,v) -> v*2);
        System.out.println(mapita);
        mapita.clear();
        System.out.println(mapita);

    }
}
