class Triangle {

    private final double side1;
    private final double side2;
    private final double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        nonZeroSideTest(side1, side2, side3);
        triangleInequalityTest(side1, side2, side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    boolean isEquilateral() {
        return sideEquality(side1, side2) && sideEquality(side1, side3);
    }

    boolean isIsosceles() {
        return sideEquality(side1, side2) || sideEquality(side1, side3) || sideEquality(side2, side3);
    }

    boolean isScalene() {
        return !isIsosceles();
    }

    private boolean triangleInequality(double sideA, double sideB, double sideC) {
        return sideA + sideB < sideC;
    }

    private boolean sideEquality(double sideA, double sideB) {
        return sideA == sideB;
    }

    private void nonZeroSideTest(double side1, double side2, double side3) throws TriangleException {
        if (side1 == 0 || side2 == 0 || side3 == 0) throw new TriangleException();
    }

    private void triangleInequalityTest(double side1, double side2, double side3) throws TriangleException {
        if (triangleInequality(side1, side2, side3)
                || triangleInequality(side1, side3, side2)
                || triangleInequality(side3, side2, side1)) throw new TriangleException();
    }
}
