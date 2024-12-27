import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidos a la farra de heroes!");

        Set<String> heroesLista = new HashSet<>();
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

        //heroesLista.removeAll(heroesLista);

        if(heroesLista.isEmpty()){
            System.out.println("La lista esta vacia, La fiesta acabó");
        } else{
            System.out.println("Aun hay "+heroesLista.size()+" Heroes Reunidos");
        }

    }
}
