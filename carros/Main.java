
package carros;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(2.0);
        Chasis chasis = new Chasis(TipoChasis.Monocasco);
        Carroceria carroceria = new Carroceria(TipoCarroceria.Tubular, "rojo");
        List<Llanta> llantas = new ArrayList<>();
        llantas.add(new Llanta("Goodyear", 25, 20, 15));
        llantas.add(new Llanta("Goodyear", 25, 20, 15));
        llantas.add(new Llanta("Goodyear", 25, 20, 15));
        llantas.add(new Llanta("Goodyear", 25, 20, 15));
        List<Asiento> asientos = new ArrayList<>();
        asientos.add(new Asiento("Cuero", true));
        asientos.add(new Asiento("Cuero", true));
        asientos.add(new Asiento("Tela", false));

        ComponentesCarro carro = new ComponentesCarro(motor, chasis, carroceria, llantas, asientos,
                                                       6, true, true, true, true);

        System.out.println(carro);
    }
}
