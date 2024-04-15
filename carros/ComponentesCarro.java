package carros;

import java.util.List;

public class ComponentesCarro {
    private Motor motor;
    private Chasis chasis;
    private Carroceria carroceria;
    private List<Llanta> llantas;
    private List<Asiento> asientos;
    private int airbags;
    private boolean frenosABS;
    private boolean vidriosElectricos;
    private boolean espejosElectricos;
    private boolean sunroof;

    public ComponentesCarro(Motor motor, Chasis chasis, Carroceria carroceria, List<Llanta> llantas, List<Asiento> asientos,
                            int airbags, boolean frenosABS, boolean vidriosElectricos, boolean espejosElectricos,
                            boolean sunroof) {
        this.motor = motor;
        this.chasis = chasis;
        this.carroceria = carroceria;
        this.llantas = llantas;
        this.asientos = asientos;
        this.airbags = airbags;
        this.frenosABS = frenosABS;
        this.vidriosElectricos = vidriosElectricos;
        this.espejosElectricos = espejosElectricos;
        this.sunroof = sunroof;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Detalles del carro:\n");
        sb.append(motor).append("\n");
        sb.append(chasis).append("\n");
        sb.append(carroceria).append("\n");
        for (int i = 0; i < llantas.size(); i++) {
            sb.append("Llanta ").append(i + 1).append(": ").append(llantas.get(i)).append("\n");
        }
        for (int i = 0; i < asientos.size(); i++) {
            sb.append("Asiento ").append(i + 1).append(": ").append(asientos.get(i)).append("\n");
        }
        sb.append("Airbags: ").append(airbags).append("\n");
        sb.append("Frenos ABS: ").append(frenosABS).append("\n");
        sb.append("Vidrios Eléctricos: ").append(vidriosElectricos).append("\n");
        sb.append("Espejos Eléctricos: ").append(espejosElectricos).append("\n");
        sb.append("Sunroof: ").append(sunroof).append("\n");
        return sb.toString();
    }
}
