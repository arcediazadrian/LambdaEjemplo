package lambda;

import java.util.ArrayList;
import java.util.List;

public class TratarDatos {

	List<String> lista = new ArrayList<String>();

	public TratarDatos() {
		lista.add("a");
		lista.add("b");
		lista.add("c");
		lista.add("d");
	}

	List<String> obtenerDatos(Recuperador recuperador) {
		return recuperador.filtra(lista);
	}
}