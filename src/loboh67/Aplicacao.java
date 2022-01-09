package loboh67;

import java.util.ArrayList;

public class Aplicacao {

    ArrayList<Viatura> listaViatura;

    public static void main(String[] args) {
	Aplicacao aplicacao = new Aplicacao();
    aplicacao.start();
    }

    public Aplicacao() {
        listaViatura = new ArrayList<Viatura>();
    }

    private void start() {
        Tanque t = new Tanque(80);
        Bateria b1 = new Bateria(1200, 220);
        Bateria b2 = new Bateria(3200, 120);
        Carro c1 = new Carro("AA-11-22", 23400, 12000, 780, t);
        Carro c2 = new Carro("BB-21-44", 69900, 200, 490, b1);
        Carro c3 = new Carro("ZA-22-PA", 140000, 0, 790, b2);
        TratorAgricola t1 = new TratorAgricola("BB-22-21", 42000, 56000, 1200, t, 25);
        TratorAgricola t2 = new TratorAgricola("32-CA-44", 20000, 45000, 620, t, 12);
        listaViatura.add(c1);
        listaViatura.add(c2);
        listaViatura.add(c3);
        listaViatura.add(t1);
        listaViatura.add(t2);
        TratorAgricola tratorAgricola = menorHorasTrabalho();
        System.out.println(tratorAgricola.getPreco());
        System.out.println(maisEletricidade());
    }

    private TratorAgricola menorHorasTrabalho() {
        int horasTrabalho = 0;
        TratorAgricola trator = null;
        for (Viatura v : listaViatura) {
            if (v.getTipoViatura() == 2) {
                int horasTrabalhoViatura = ((TratorAgricola) v).getHorasTrabalho();
                if (horasTrabalho == 0) {
                    horasTrabalho = horasTrabalhoViatura;
                    trator = (TratorAgricola) v;
                } else {
                    if (horasTrabalhoViatura < horasTrabalho) {
                        horasTrabalho = horasTrabalhoViatura;
                        trator = (TratorAgricola) v;
                    }
                }
            }
        }
        return trator;
    }

    private Carro maisEletricidade() {
        int maiorReservatorio = 0;
        Carro carro = null;
        for (Viatura viatura : listaViatura) {
            if (viatura.getTipoViatura() == 1) {
                Reservatorio reservatorio = viatura.getReservatorio();
                if (reservatorio.getTipoReservatorio() == 2) {
                    if (reservatorio.getCapacidade() > maiorReservatorio) {
                        maiorReservatorio = reservatorio.getCapacidade();
                        carro = (Carro) viatura;
                    }
                }
            }
        }
        return carro;
    }
}
