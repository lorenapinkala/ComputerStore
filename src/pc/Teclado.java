
package pc;


public class Teclado extends DispositivoEntrada{
    
    //atributos teclado
    private int idTeclado;
    private int contadorTeclados;
    
    
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.contadorTeclados=++this.idTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", contadorTeclados=" + contadorTeclados + '}';
    }
    
    
}