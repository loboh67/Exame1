package loboh67;

public class TratorAgricola extends Viatura {

    private int horasTrabalho;

    public TratorAgricola(String matricula, float preco, int kmPercorridos, int autonomia, Reservatorio reservatorio, int horasTrabalho) {
        super(matricula, preco, kmPercorridos, autonomia, reservatorio);
        this.horasTrabalho = horasTrabalho;
        setTipoViatura(2);
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    @Override
    public String toString() {
        return super.toString() + "TratorAgricola{" +
                "horasTrabalho=" + horasTrabalho +
                '}';
    }

}
