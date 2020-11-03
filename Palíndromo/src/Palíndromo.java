import java.util.Scanner;		//IMPORTAR SCANNER
public class Pal�ndromo {

	//PAL�NDROMO: PALABRAS ESCRITAS IGUAL DEL DERECHO Y DEL REV�S.
	//EJEMPLO: ANA
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		String palabra = new String ();			//CREAR NUEVA L�NEA DE PALABRAS
		palabra = teclado.next();		//ALMACENAR VALOR EN CADENA
		int i=0;		//VARIABLE I
		
		while (i<palabra.length() && palabra.charAt(i)==palabra.charAt(palabra.length()-i-1) ) {			//MIENTRAS (CONDICI�N)
			i++;		//ACTUALIZAR I
		}
		
		if (i==palabra.length()) {		//SI LA I ES IGUAL A LOS CARACTERES DE LA CADENA
			System.out.printf("La palabra, %s", palabra +" es un pal�ndromo.");		//ES PAL�NDROMO
		} else {		//SI NO		(SE ECONTR� UNA LETRA DIFERENTE)
			System.out.printf("La palabra %s", palabra +" no es un pal�ndromo.");		//NO ES PAL�NDROMO
		}

	}

}
