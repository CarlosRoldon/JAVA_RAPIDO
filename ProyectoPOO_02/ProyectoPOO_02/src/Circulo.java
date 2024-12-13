public class Circulo extends Figura{

    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    //GETTERS AND SETTERS
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        // Calculamos el area de un circulo
        return Math.PI*(radio*radio);
    }

}
