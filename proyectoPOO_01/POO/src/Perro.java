public class Perro extends Animal {

    public Perro(String nombre, int cantidadPatas, int edad){
        super(nombre, cantidadPatas, edad);
    }

    @Override
    public String hacerSonido() {
        // TODO Auto-generated method stub
        return "Estamos Ladrando, Somos perros";
    }

    public String traerPelota(){
        return "Aca esta tu pelota Humano!!! WoW";
    }

}
