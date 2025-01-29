public class Main {
    public static void main(String[] args) {

        System.out.println("=== Debug Test Program ===");

        int[] numeros = {10, 20, 30, 40};
        int soma = 0;

        // Loop para somar os valores do array
        for (int i = 0; i <= numeros.length; i++) { // Bug: vai até numeros.length
            soma += numeros[i];
        }

        System.out.println("A soma total é: " + soma);
    }
}

