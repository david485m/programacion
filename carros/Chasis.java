
package carros;

public class Chasis {
    private final TipoChasis tipoChasis;

    public Chasis(TipoChasis tipoChasis) {
        this.tipoChasis = tipoChasis;
    }

    @Override
    public String toString() {
        return "Chasis: " + tipoChasis;
    }
}
