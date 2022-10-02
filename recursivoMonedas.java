public class recursivoMonedas {

    // Función para encontrar el número total de formas de obtener un cambio
    // de `target` de un suministro ilimitado de monedas en el conjunto `S`
    public static int count(int[] monedas, int target) {
        // si el total es 0, devuelve 1
        if (target == 0) {
            return 1;
        }

        // devuelve 0 si el total se vuelve negativo
        if (target < 0) {
            return 0;
        }

        // inicializa el número total de formas a 0
        int result = 0;

        // hacer por cada moneda
        for (int c : monedas) {
            // recurre para ver si se puede alcanzar el total incluyendo la moneda actual `c`
            result += count(monedas, target - c);
        }

        // devuelve el número total de formas
        return result;
    }

    public static void main(String[] args) {
        // `n` monedas de denominaciones dadas
        int[] monedas = {1, 2, 5, 10};

        // cambio total requerido
        int target = 5;

        System.out.println("The total number of ways to get the desired change is " + count(monedas, target));
    }
}

