
import avion.Avioneta;
import avion.Jet;
import carro.Carro;
import carro.Sedan;
import carro.Suv;

public class Test {

	private void ejecutarCarro() {
		Carro carro = new Sedan();
		carro.imprimir();

		carro = new Suv();
		carro.imprimir();
	}

	private static void ejecutarAvion() {
		Aeropuerto aeropuerto = new Aeropuerto(new Jet());
		aeropuerto.takeOff();
		
		aeropuerto = new Aeropuerto(new Avioneta());
		aeropuerto.takeOff();
	}

	public static void main(String[] args) {
//		new Test().ejecutar();
		ejecutarAvion();

	}

}
