//hacemos una Clase llamada figura que es abstracta
public abstract class Figura {
    //Este comportamiento sera OBLIGATORIO en las clases que hereden de figura
    abstract double calcularArea();
    void ImprimirInfo(){
        System.out.println("Esta informacion viene desde la clase abastracta");
    }

}
