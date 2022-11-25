
package pc;

public class DispositivoEntrada {
    
    //atributos
    private String tipoEntrada;
    private String marca;
    
    //constructor
    public DispositivoEntrada(String tipoEntrada, String marca){
        this.marca= marca;
        this.tipoEntrada= tipoEntrada;
    }
    
    
    //getters and setters

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //string

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }
    
    
    
}
