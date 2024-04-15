
package carros;

public class Llanta {
    private String marca;
    private int diametroRin;
    private int altura;
    private int anchura;

    public Llanta(String marca, int diametroRin, int altura, int anchura) {
        this.marca = marca;
        this.diametroRin = diametroRin;
        this.altura = altura;
        this.anchura = anchura;
    }

    @Override
    public String toString() {
        return "Llanta: " + marca + ", Rin: " + diametroRin + ", Altura: " + altura + ", Anchura: " + anchura;
    }
}