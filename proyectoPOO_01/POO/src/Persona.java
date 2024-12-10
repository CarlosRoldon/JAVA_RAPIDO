public class Persona {
    
    //Atributos Caracteristicas de objeto
    private String nombre;
    private String apellido;
    private int edad;
    private Carrera carrera;

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

    public String getNombre() {
        return nombre.toUpperCase();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido.toUpperCase();
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    
    public String nombreCompleto(){
        return getNombre()+" "+getApellido(); 
    }

    //public String enviaSaludo

    public void ImprimirInformacion(){
        String estuddiandoSIoNO;
        if(carrera.Estudiando){
            estuddiandoSIoNO = "si";
            System.out.println(nombreCompleto()+" de "+getEdad()+" años, "+estuddiandoSIoNO+
            " esta estudiando"+
            carrera.nombreCarrera+" de "+carrera.duracion+" años totales");
        } else {
            estuddiandoSIoNO = "no";
            System.out.println(nombreCompleto()+" de "+getEdad()+" años, "+estuddiandoSIoNO+
            " esta estudiando"+carrera.nombreCarrera+", ya que culminó sus "+carrera.duracion+
            " años de duracion");
        }
    }
}
