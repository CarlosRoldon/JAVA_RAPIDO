package Exceptions;

public class CalculatorException extends Exception {
    private String descripcion;

    public CalculatorException(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String getMessage(){
        return getDescripcion();
    }
}
