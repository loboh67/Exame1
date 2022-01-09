package loboh67;

public class Carro extends Viatura {

    public Carro(String matricula, float preco, int kmPercorridos, int autonomia, Reservatorio reservatorio) {
        super(matricula, preco, kmPercorridos, autonomia, reservatorio);
        setTipoViatura(1);
    }

}
