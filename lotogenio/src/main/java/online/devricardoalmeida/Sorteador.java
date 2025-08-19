package online.devricardoalmeida;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteador {
	

	public static List<Integer> gerarSena() {
        return gerarNumeros(6, 60);
    }

    public static List<Integer> gerarLotoFacil() {
        return gerarNumeros(15, 25);
    }

    private static List<Integer> gerarNumeros(int quantidade, int maximo) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        while (numeros.size() < quantidade) {
            int numero = random.nextInt(maximo) + 1;
            if (!numeros.contains(numero)) {
                numeros.add(numero);
            }
        }

        numeros.sort(null);
        return numeros;
    }

}