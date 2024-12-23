import Exceptions.CalculatorException;

public class App {
    public static void main(String[] args) throws Exception {
        //LAS ESCEPCIONES: son eventos que interrumpen el flujo normal de la aplicacion
        //uncheked y cheked
        int numero1 = 50;
        int numero2 = 0;
        int resultado;
        //ystem.out.println(numero1/numero2);

        Calculator calculadora = new Calculator();
         
        try{
            //resultado = (int)numero1/(int)numero2;
            resultado = calculadora.dividir(numero1, numero2);
            System.out.println("La division es: "+resultado);
        } catch (CalculatorException e){ 
            e.printStackTrace();
            //System.out.println("ha ocurrido un error. $$$");
        } finally {
            System.out.println("Hemos acabado el calculo LLEGAMOS A FINALLY");
        }
    }
}
