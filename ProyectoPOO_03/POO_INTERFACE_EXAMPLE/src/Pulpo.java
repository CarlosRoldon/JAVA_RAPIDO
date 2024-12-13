import interfaces.Alimentable;
import interfaces.Comunicable;

public class Pulpo extends CreaturasMarinass implements Comunicable, Alimentable{

    int cantidadTentaculos;

    public Pulpo(String nombre,int Tentaculos){
        super(nombre);
        this.cantidadTentaculos = Tentaculos;
    }
    @Override
    void nadar() {
        System.out.println("El pulpo esta nadando...");
    }

    @Override
    public void comunicarse() {
        System.out.println("Soy "+getNombre()+" y grito: "+GRITO+" con mis tres corazones RAAA!");
        System.out.println("tengo "+cantidadTentaculos+" tentaculos");
    }
    @Override
    public void alimentarse() {
        System.out.println("Me alimento de peces soy el octopus");
    }
}
