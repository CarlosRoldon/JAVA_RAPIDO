public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Pulpo pulpo01 = new Pulpo("Pulpo Calamardo", 8);
        Delfin delfin01 = new Delfin("Delfin del fin");
        pulpo01.cantidadTentaculos = 5;
        pulpo01.nadar();
        pulpo01.comunicarse();
        delfin01.nadar();
        delfin01.comunicarse();
        pulpo01.alimentarse();
        delfin01.alimentarse();
    }
}
