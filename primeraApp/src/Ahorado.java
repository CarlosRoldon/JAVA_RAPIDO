import java.util.Random;
import java.util.Scanner;

public class Ahorado {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hola, perros!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina la palabra secreta...");

        String[] palabrasAleatorias = {"jarron","lampara","azucar","moneda","casacada",
        "comercial","enemigo","dulce","boludo","cancion","balon","mentira","avenida","avispa","alternativa"};

        String palabraSecreta = palabrasAleatorias[numeroRandom()];
        int intentosMaximos = 8;
        int intentos = 0;
        boolean isUnloked = false;

        //Arreglo
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            //System.out.print(letrasAdivinadas[i]);
        }

        while(!isUnloked && intentos < intentosMaximos){
            System.out.println("Palabra a adivinar: "+ String.valueOf(letrasAdivinadas)+" - tiene ("+palabraSecreta.length()+" letras)");
            System.out.println("Introduce una letra: ");
            char letra = Character.toLowerCase(sc.next().charAt(0));
            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if(palabraSecreta.charAt(i)==letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("Letra incorrecta te quedan "+(intentosMaximos-intentos)+" intentos");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                System.out.println("!FELICIDADES¡ has adivinado la palabra : "+ palabraSecreta);
                isUnloked = true;
            }
        }

        if(!isUnloked){
            System.out.println("GAME OVER, te has quedado sin intentos!");
        }
        sc.close();
    }

    public static int numeroRandom(){
        Random random = new Random();
        return random.nextInt(15); //genera un numero aleatorio de 0 a 14
    }
}
