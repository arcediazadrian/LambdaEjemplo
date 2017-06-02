package lambda;

import java.util.Arrays;
import java.util.List;

import lambda.PruebaLambda.Calculator.IntegerMath;

public class PruebaLambda {

	public static void main(String[] args) {
		TratarDatos tratarDatos = new TratarDatos();

		// Asi es como se lo haria normalmente
		// List<String> lista = tratarDatos.obtenerDatos(new Recuperador() {
		//
		// @Override
		// public List<String> filtra(List<String> datos) {
		// return datos.subList(2, 4);
		// }
		// });

		// Pero con expresiones lambda se convierte a esto

		List<String> lista = tratarDatos.obtenerDatos(datos -> datos.subList(2, 4));

		System.out.println("Resultado: " + Arrays.toString(lista.toArray()));

		// aqui se puede ver la parte del paradigma funcional un poco mejor, ya
		// que mandamos una funcion como parametro de otra funcion
		// mediante un simple ejemplo

		Calculator myApp = new Calculator();
		IntegerMath addition = (a, b) -> a + b;
		IntegerMath subtraction = (a, b) -> a - b;
		System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
		System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));

	}

	public static class Calculator {

		interface IntegerMath {
			int operation(int a, int b);
		}

		public int operateBinary(int a, int b, IntegerMath op) {
			return op.operation(a, b);
		}
	}
}
