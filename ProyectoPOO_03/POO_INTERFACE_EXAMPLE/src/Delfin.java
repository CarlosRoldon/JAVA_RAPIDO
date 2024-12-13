import interfaces.Alimentable;
import interfaces.Comunicable;

public class Delfin extends CreaturasMarinass implements Comunicable, Alimentable{

    public Delfin(String nombre){
        super(nombre);
    }
    @Override
    void nadar() {
        System.out.println("Delfin Nadando...");
    }

    @Override
    public void comunicarse() {
        System.out.println("Soy "+getNombre()+" y grito: "+GRITO+" con mi cabezota RAAA!");
    }
    @Override
    public void alimentarse() {
        System.out.println("Me estoy Alimentando de Cacaguetes Delfinicos");
    }
}
