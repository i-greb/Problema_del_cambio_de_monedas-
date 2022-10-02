
/*El sistema monetario consta de monedas de valores p1, p2, p3, … , (orden creciente). Escribir una aplicación que
tenga como entrada el valor de las n monedas, en orden creciente, y una cantidad x de cambio. Calcule:
a)	 El número mínimo de monedas que se necesiten para dar el cambio x.
b)	El número de formas diferentes de dar el cambio de la cantidad x con las p monedas.
Aplicar técnicas recursivas para resolver el problema.
*/

public class cambio {
    public int calcularCambio(int n) {
        int monedas[] = {10,5,2,1};
        int cantidad[] = {0, 0, 0, 0};
        cantidad[0] = n;

        for (int i = 0; i < 4; i++) {
            cantidad[i] = n / monedas[i];
            while (cantidad[i] > 0 && cantidad[i] != n - 1) {
                int res = n - (monedas[i] * cantidad[i]);
                for (int j = 0; j < 4; j++) {
                    if (j > i) {
                        cantidad[j] = res / monedas[j];
                        res -= monedas[j] * cantidad[j];
                    }
                    System.out.println(cantidad[j] + " monedas de " + monedas[j]);
                }
                System.out.println("----------------------");
                cantidad[i]--;
                System.out.println( );
            }
        }
        return n;
    }

    public static void main(String args[]) {
        cambio prueba1 = new cambio();
        System.out.println(prueba1.calcularCambio(5));
    }
}
