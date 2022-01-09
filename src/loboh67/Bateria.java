package loboh67;

public class Bateria extends Reservatorio {

    private int tempoCarga;

    public Bateria(int capacidade, int tempoCarga) {
        super(capacidade);
        this.tempoCarga = tempoCarga;
        setTipoReservatorio(2);
    }

    public int getTempoCarga() {
        return tempoCarga;
    }

    public void setTempoCarga(int tempoCarga) {
        this.tempoCarga = tempoCarga;
    }

    @Override
    public String toString() {
        return super.toString() + "Bateria{" +
                "tempoCarga=" + tempoCarga +
                '}';
    }

}
