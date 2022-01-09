package loboh67;

public class Viatura {

    private String matricula;
    private float preco;
    private int kmPercorridos;
    private int autonomia;
    private Reservatorio reservatorio;
    private int tipoViatura;

    public Viatura(String matricula, float preco, int kmPercorridos, int autonomia, Reservatorio reservatorio) {
        this.matricula = matricula;
        this.preco = preco;
        this.kmPercorridos = kmPercorridos;
        this.autonomia = autonomia;
        this.reservatorio = reservatorio;
    }

    public int getTipoViatura() {
        return tipoViatura;
    }

    public void setTipoViatura(int tipoViatura) {
        this.tipoViatura = tipoViatura;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getKmPercorridos() {
        return kmPercorridos;
    }

    public void setKmPercorridos(int kmPercorridos) {
        this.kmPercorridos = kmPercorridos;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public Reservatorio getReservatorio() {
        return reservatorio;
    }

    public void setReservatorio(Reservatorio reservatorio) {
        this.reservatorio = reservatorio;
    }

    @Override
    public String toString() {
        return "Viatura{" +
                "matricula='" + matricula + '\'' +
                ", preco=" + preco +
                ", kmPercorridos=" + kmPercorridos +
                ", autonomia=" + autonomia +
                ", reservatorio=" + reservatorio +
                '}';
    }

}
