public class Animal {
    private String nombre;
    private int cantidadPatas;
    private int edad;
    private static int contadorAnimales = 0;

    public Animal(String nombre, int cantidadPatas, int edad) {
        this.nombre = nombre;
        this.cantidadPatas = cantidadPatas;
        this.edad = edad;
        contadorAnimales++;
    }

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getCantidadPatas() {
        return cantidadPatas;
    }



    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    public String hacerSonido() {
        return "Haciendo sonido Generico de Animal";
    }

    public static int getContadorAniamles(){
        return contadorAnimales;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Soy un "+getNombre()+" y tengo "+getCantidadPatas()+" patas con "+getEdad()+" años";
    }
}
