package pc;

public class Monitor {

    //atributos de la clase
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private int contadorMonitores;

    private Monitor(String hp) {
        this.idMonitor = ++contadorMonitores;

    }

    public Monitor(String marca, double tamanio) {
        this("hp");
        this.marca = marca;
        this.tamanio = tamanio;
    }

    //getters y setters
    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public int getContadorMonitores() {
        return contadorMonitores;
    }

    public void setContadorMonitores(int contadorMonitores) {
        this.contadorMonitores = contadorMonitores;
    }

    //toString
    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + ", contadorMonitores=" + contadorMonitores + '}';
    }

}
