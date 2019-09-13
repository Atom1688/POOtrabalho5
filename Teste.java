import nivel1.Jogador;
import nivel2.*;

public class Teste {

    public static void main(String[] args){
        Principiante principiante = new Principiante(2, "Maicao", 8);
        Profissional profissional = new Profissional("Nilsola", 6, 250);
        Senior senior = new Senior("Oi", 4, 120, 45);

        principiante.print();
        profissional.print();
        senior.print();

        principiante.ganhar(6);
        profissional.ganhar(6);
        senior.ganhar(7);

        principiante.perder(6);
        profissional.perder(6);
        senior.perder(7);

        principiante.print();
        profissional.print();
        senior.print();
    }
}
