
package carros;
public class Carroceria {
    private TipoCarroceria tipoCarroceria;
    private String color;

    public Carroceria(TipoCarroceria tipoCarroceria, String color) {
        this.tipoCarroceria = tipoCarroceria;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carroceria: " + tipoCarroceria + ", Color: " + color;
    }
}