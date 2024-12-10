//Gato hereda de Animal 
public class Gato extends Animal{

    public Gato(String nombre, int cantidadPatas, int edad){
        //con super llamamos a el constructor de la clase padre
        //para heredar la informacion de este
        super(nombre,cantidadPatas,edad);
    }

    @Override
    public String hacerSonido() {
        // TODO Auto-generated method stub
        return "Estamos Maullando, somos gatos";
    }

    public String rascarEspalda(){
        return "Me estoy rascando la espalda!!!, MIAU";
    }

}
