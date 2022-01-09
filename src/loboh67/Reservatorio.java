package loboh67;

public class Reservatorio {

    private int capacidade;
    private int tipoReservatorio;

    public Reservatorio(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getTipoReservatorio() {
        return tipoReservatorio;
    }

    public void setTipoReservatorio(int tipoReservatorio) {
        this.tipoReservatorio = tipoReservatorio;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Reservatorio{" +
                "capacidade=" + capacidade +
                '}';
    }

}
