public class Persona {
    
    //Atributos Caracteristicas de objeto
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;

    //Constructor SOLO NOMBRE CARRERA
    public Persona (String nombre, String apellido, int edad, String nombreCarrera){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        carrera = new Carrera(nombreCarrera,5,true);
    }
    //Constructor Carrera completa
    public Persona (String nombre, String apellido, int edad, String nombreCarrera,int duracionCarrera, boolean Estudiando){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        carrera = new Carrera(nombreCarrera,duracionCarrera,Estudiando);
    }
    
    //Metodos comportamiento del obejto

    public String nombreCompleto(){
        return nombre+" "+apellido; 
    }

    //public String enviaSaludo

    public void ImprimirInformacion(){
        String estuddiandoSIoNO;
        if(carrera.Estudiando){
            estuddiandoSIoNO = "si";
            System.out.println(nombreCompleto()+" de "+edad+" años, "+estuddiandoSIoNO+
            " esta estudiando"+
            carrera.nombreCarrera+" de "+carrera.duracion+" años totales");
        } else {
            estuddiandoSIoNO = "no";
            System.out.println(nombreCompleto()+" de "+edad+" años, "+estuddiandoSIoNO+
            " esta estudiando"+carrera.nombreCarrera+", ya que culminó sus "+carrera.duracion+
            " años de duracion");
        }
    }
}
