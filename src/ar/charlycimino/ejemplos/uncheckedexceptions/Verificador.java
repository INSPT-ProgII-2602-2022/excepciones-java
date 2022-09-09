
package ar.charlycimino.ejemplos.uncheckedexceptions;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Verificador {
    public static void checkEsNegativo(int x)  {
        if (x < 0)
            throw new RuntimeException("No puede ser negativo");
    }  
}
