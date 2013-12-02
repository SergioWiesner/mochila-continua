package mochila;

import java.util.Comparator;

/**
 * @author Daniel Alejandro Castro Garc�a
 */

public class ObjetoComparator implements Comparator<Objeto>{

	@Override
	/*
	 * Devuelve un n�mero negativo, cero o un n�mero positivo si el primer argumento es menor, igual
	 * que, o mayor que el segundo.
	 * 
	 */
	public int compare(Objeto o1, Objeto o2) {
		return Float.compare(o2.getValorPeso(), o1.getValorPeso());
	}

}
