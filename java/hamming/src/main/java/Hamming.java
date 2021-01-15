class Hamming {

    private String leftStrand;
    private String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        if (this.rightStrand.length() != this.leftStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {
        int distance = 0;
        for (int i = 0; i < this.leftStrand.length(); i++) {
            char left = this.leftStrand.charAt(i);
            char right = this.rightStrand.charAt(i);
            if (left != right) {
                distance += 1;
            }
        }
        return distance;
    }

}
