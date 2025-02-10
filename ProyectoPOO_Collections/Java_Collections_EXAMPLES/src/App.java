import java.util.LinkedList;
import java.util.List;
//import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidos a la farra de heroes!");

        List<String> heroesLista = new LinkedList<>();
        heroesLista.add("Batman");
        heroesLista.add("Superman");
        heroesLista.add("Hulk");
        heroesLista.add("Antman");
        heroesLista.add("Puta");
        heroesLista.add("Aironman");
        heroesLista.add("Spiderman");

        if(heroesLista.contains("Spiderman")){
            System.out.println("Spiderman esta farreando");
        }

        heroesLista.remove("Hulk");
        if(!heroesLista.contains("Hulk")){
            System.out.println("Hulk se fue en uber");
        }

        System.out.println("Lista de Heroes \n");

        for (String heroe : heroesLista) {
            System.out.println(heroe);
        }

    }
}
