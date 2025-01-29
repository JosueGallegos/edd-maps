package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
        HashMap();
        LinkedHashMap();
        TreeHasMap();


    }
    public void HashMap(){

        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Duraznos", 5);
        mapa.put("Mango", 6);
        System.out.println(mapa);

        System.out.println("Hay Pera " + mapa.containsKey("Pera"));
        System.out.println("Hay Kiwi " + mapa.containsKey("Kiwi"));

        //Obtener valorn 

        System.out.println("Valor de pera "+ mapa.get("Pera"));

        //Eliminar item

        mapa.remove("Pera");
        System.out.println(mapa);
        System.out.println();
    }

    public void LinkedHashMap(){
        LinkedHashMap<String, Integer> linked = new LinkedHashMap<>();
        linked.put("Manzana", 10);
        linked.put("Pera", 11);
        linked.put("Duraznos", 5);
        linked.put("Mango", 6);
        System.out.println(linked);

        System.out.println("Hay Pera " + linked.containsKey("Pera"));
        System.out.println("Hay Kiwi " + linked.containsKey("Kiwi"));

        //Obtener valorn    

        System.out.println("Valor de pera "+ linked.get("Pera"));

        //Eliminar item

        linked.remove("Pera");
        System.out.println(linked);
        System.out.println();
    }
    public void TreeHasMap(){
        TreeMap<String, Integer> tree = new TreeMap<>();
        tree.put("Manzana", 10);
        tree.put("Pera", 11);
        tree.put("Duraznos", 5);
        tree.put("Mango", 6);
        System.out.println(tree);

        System.out.println("Hay Pera " + tree.containsKey("Pera"));
        System.out.println("Hay Kiwi " + tree.containsKey("Kiwi"));

        //Obtener valorn

        System.out.println("Valor de pera "+ tree.get("Pera"));

        //Eliminar item

        tree.remove("Pera");
        System.out.println(tree);
    }

}
