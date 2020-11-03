import java.util.Scanner;		//IMPORTAR SCANNER
public class Palíndromo {

	//PALÍNDROMO: PALABRAS ESCRITAS IGUAL DEL DERECHO Y DEL REVÉS.
	//EJEMPLO: ANA
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		String palabra = new String ();			//CREAR NUEVA LÍNEA DE PALABRAS
		palabra = teclado.next();		//ALMACENAR VALOR EN CADENA
		int i=0;		//VARIABLE I
		
		while (i<palabra.length() && palabra.charAt(i)==palabra.charAt(palabra.length()-i-1) ) {			//MIENTRAS (CONDICIÓN)
			i++;		//ACTUALIZAR I
		}
		
		if (i==palabra.length()) {		//SI LA I ES IGUAL A LOS CARACTERES DE LA CADENA
			System.out.printf("La palabra, %s", palabra +" es un palíndromo.");		//ES PALÍNDROMO
		} else {		//SI NO		(SE ECONTRÓ UNA LETRA DIFERENTE)
			System.out.printf("La palabra %s", palabra +" no es un palíndromo.");		//NO ES PALÍNDROMO
		}

	}

}
