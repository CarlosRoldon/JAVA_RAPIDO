public class Persona {
    
    //Atributos Caracteristicas de objeto
    String nombre;
    String apellido;
    int edad;
    //Direccion direccion;

    
    //Metodos comportamiento del obejto

    public String nombreCompleto(){
        return nombre+" "+apellido; 
    }

    //public String enviaSaludo

    public void ImprimirInformacion(){
        System.out.println(nombreCompleto()+" - "+edad);
    }
}
