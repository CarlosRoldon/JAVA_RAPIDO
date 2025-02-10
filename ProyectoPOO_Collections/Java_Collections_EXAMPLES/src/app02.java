import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class app02 {
    public static void main(String[] args) {
        System.out.println("Bienvenidos al lichigo de Lucho");
        Map<String, Double> inventario = new LinkedHashMap<>();

        inventario.put("Banana", 2000.0);
        inventario.put("Nutela", 10000.0);
        inventario.put("Manzana", 2500.0);
        inventario.put("Azucar", 1000.0);
        inventario.put("Pimienta", 0.80);

        for (String fruta : inventario.keySet()) {
            System.out.println(fruta+": $ "+ inventario.get(fruta));
        }

        if(inventario.containsKey("Azucar")){
            System.out.println("si hay Azucar Choto");
        } else {
            System.out.println("Sos poronga");
        }
        
    }
}
