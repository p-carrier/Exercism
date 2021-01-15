class Darts {

    private double distance;

    Darts(double x, double y) {
       this.distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    int score() {
        if (this.distance > 10) {
            return 0;
        } else if (this.distance > 5) {
            return 1;
        } else if (this.distance > 1) {
            return 5;
        } else {
            return 10;
        }
    }

}
