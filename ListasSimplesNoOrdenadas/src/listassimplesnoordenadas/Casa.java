package listassimplesnoordenadas;

public class Casa {
    private int anio;
    private int cantidadVentanas;

    public Casa() {
    }

    public Casa(int anio, int cantidadVentanas) {
        this.anio = anio;
        this.cantidadVentanas = cantidadVentanas;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCantidadVentanas() {
        return cantidadVentanas;
    }

    public void setCantidadVentanas(int cantidadVentanas) {
        this.cantidadVentanas = cantidadVentanas;
    }

    @Override
    public String toString() {
        return "Casa{" + "anio=" + anio + ", cantidadVentanas=" + cantidadVentanas + '}';
    }
    
    
}
