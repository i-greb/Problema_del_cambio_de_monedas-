/*
public class monedas {
    public int minCoinsChange(int change) {
        int remainder = -1;
        int div = 0;
        int steps = 0;
        int []numbers= {1,2,5,10};
        for (int i = 0; i < numbers.size() ; i++) {
            if (remainder == 0) {
                return steps;
            } else if (remainder == -1 || remainder > 0) {
                div = change / numbers.get(i);
                remainder = change % numbers.get(i);
                change = remainder;
            }
            steps += div;
        }
        if (remainder == 0) {
            return steps;
        }
        return -1;
    }

}
*/