
package carros;


    public class Motor {
    private double volumenLitros;

    public Motor(double volumenLitros) {
        this.volumenLitros = volumenLitros;
    }

    @Override
    public String toString() {
        return "Motor: " + volumenLitros + " litros";
    }
}

