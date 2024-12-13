public abstract class CreaturasMarinass {
    //Atributo
    private String nombre;
    
    public CreaturasMarinass(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Obliga a sobreescribir en las clases heredadas
    abstract void nadar();
}
