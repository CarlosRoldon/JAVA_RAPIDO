public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("Andrew Stivenson","Perroso",
        25,"Gastronomia");
        persona1.carrera.Estudiando  = true;
        Persona persona2 = new Persona("Sara Valentina","Valvuena",
        19,"Medicina");
        persona2.carrera.Estudiando = false;
        Persona persona3 = new Persona("Cesar Armando","Augurio",
        50,"Contabilidad",4,false);

        persona1.ImprimirInformacion();
        persona2.ImprimirInformacion();
        persona3.ImprimirInformacion();
    }
}
