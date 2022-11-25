package pc;

public class Raton extends DispositivoEntrada {

    //atrubutos de la clase hija
    private final int idRaton;
    private int contadorRatones;

    //constructor de la clase
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++this.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones + '}';
    }

}
