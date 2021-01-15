import java.util.ArrayList;
import java.util.List;

class Sieve {
    private List<Integer> sieve;

    Sieve(int maxPrime) {
        List<Integer> nonPrime = new ArrayList<>();
        List<Integer> prime = new ArrayList<>();
        for (int i = 2; i <= maxPrime; i++){
            if(!nonPrime.contains(i)) {
                prime.add(i);
                for(int y = 2; y <= maxPrime; y++) {
                    nonPrime.add(i*y);
                }
            }
        }

        this.sieve = prime;
    }

    List<Integer> getPrimes() {
        return sieve;
    }
}
