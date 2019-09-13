package nivel2;
import nivel1.Jogador;
class Principiante extends Jogador

public class Principiante {
    public double bonus;

    public Principiante(double bonus, String nome, int score){
        super(bonus);
        this.bonus = bonus;
    }
}