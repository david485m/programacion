
package carros;


public class Asiento {
    private String tipoMaterial;
    private boolean tieneFunda;

    public Asiento(String tipoMaterial, boolean tieneFunda) {
        this.tipoMaterial = tipoMaterial;
        this.tieneFunda = tieneFunda;
    }

    @Override
    public String toString() {
        return "Asiento: Material: " + tipoMaterial + ", Funda: " + (tieneFunda ? "Sí" : "No");
    }
}