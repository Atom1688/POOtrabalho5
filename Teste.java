import nivel2.Principiante;
import nivel2.Profissional;
import nivel3.Senior;
public class Teste {
	public static void main(String[] args) {
		Principiante principiante = new Principiante(10.00,"Jeferson",4);
		Profissional profissional = new Profissional("Neilmar",420,69000000.00);
		Senior senior = new Senior("Veio da bola",720,1000.00,720000.00);

		principiante.ganhar(2);
		principiante.perder(10);
		principiante.imprimir();
		System.out.println("--");
		profissional.ganhar(20);
		profissional.perder(1);
		profissional.imprimir();
		System.out.println("--");
		senior.ganhar(0);
		senior.perder(100);
		senior.imprimir();
	}
}