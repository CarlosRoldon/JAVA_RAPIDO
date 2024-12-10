public class App {
    public static void main(String[] args) throws Exception {
        
        Animal AnimalGenerico = new Animal("Caballo", 4, 10);
        Gato gatoPeludo = new Gato("Gato Peludo", 4, 12);
        Perro perroBlanco = new Perro("Perro Blanco", 4, 5);

        Imprimir(gatoPeludo.hacerSonido());
        Imprimir(gatoPeludo.rascarEspalda());
        Imprimir(perroBlanco.traerPelota());
        Imprimir(AnimalGenerico.toString());
    }

    public static void  Imprimir(String frase){
        System.out.println(frase);
    }
}
