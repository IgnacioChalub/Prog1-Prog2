package austral.prog2.tp7.Ejercicio4;

import java.util.HashMap;

public class Ciudades {

    HashMap<String, String> Cities = new HashMap<String, String>();

    public void addCity(String name, String codigo){
        if(codigo.length() != 4){
            throw new IllegalArgumentException("El codigo postal debe tener 4 cifras");
        }else if(Cities.containsKey(codigo) || Cities.containsValue(name)){
            throw new IllegalArgumentException("EL codigo o ciuidad ya existen");
        }
        Cities.put(codigo, name);
    }

    public String getCity(String codigo){
        if(codigo.length() != 4){
            throw new IllegalArgumentException("El codigo postal debe tener 4 cifras");
        }else if(Cities.get(codigo) == null){
            throw new IllegalArgumentException("No existe ciudad con ese codigo");
        }
        return Cities.get(codigo);
    }




















    public static void main(String[] args) {
        Ciudades cities = new Ciudades();
        cities.addCity("Buenos Aires","1111");
        cities.addCity("Cordoba","2222");

        //cities.addCity("Cordoba","2222"); // codigo o ciudad ya existen
        //cities.addCity("Cordoba", "3333");
        //cities.addCity("Cordoba", "2222");

        try{
            cities.addCity("Cordoba", "111"); // codigo debe tener 4 cifras
        }catch(IllegalArgumentException  e){
            System.out.println(e.getMessage());
        }


        System.out.println(cities.getCity("1111"));
        System.out.println(cities.getCity("2222"));

        //System.out.println(cities.getCity("8888")); //no existe ciudad con ese codigo
        //System.out.println(cities.getCity("333")); // codigo debe tener 4  cifras
        //System.out.println(cities.getCity("333333")); // codigo debe tener 4  cifras
    }

}
