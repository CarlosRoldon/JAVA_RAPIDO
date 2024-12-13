public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola mundo!");
        Circulo circulo = new Circulo(55);
        Rectangulo rectangulo = new Rectangulo(10, 5);
        circulo.ImprimirInfo();
        //System.out.println("El area del Circulo es de: "+circulo.calcularArea());
        System.out.println("El area del Circulo es de: "+String.format("%.3f", circulo.calcularArea()));
        System.out.println("El area del Rectangulo es de: "+String.format("%.3f", rectangulo.calcularArea()));       
    }
}
