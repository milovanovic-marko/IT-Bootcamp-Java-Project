package grupa4oop.zadatak5;

public class Trougao {

    private double stranicaA, stranicaB, stranicaC;

    public Trougao(double stranicaA, double stranicaB, double stranicaC) {
        daLiJeTrougaoValidan(stranicaA, stranicaB, stranicaC);
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
    }

    private void daLiJeTrougaoValidan(double stranicaA, double stranicaB, double stranicaC) {
        if (stranicaA * stranicaB * stranicaC > 0) {
            if ((stranicaA + stranicaB > stranicaC) && (stranicaA + stranicaC > stranicaB) && (stranicaB + stranicaC > stranicaA)) {
                this.stranicaA = stranicaA;
                this.stranicaB = stranicaB;
                this.stranicaC = stranicaC;
            } else {
                System.out.println("Stranice trougla nisu validne!");
                this.stranicaA = -1;
                this.stranicaB = -1;
                this.stranicaC = -1;
            }
        } else {
            System.out.println("Stranice trougla nisu validne!");
            this.stranicaA = -1;
            this.stranicaB = -1;
            this.stranicaC = -1;
        }
    }

    public double obim() {
        return stranicaA + stranicaB + stranicaC;
    }

    public double povrsina() {
        double s = 0.5 * (stranicaA + stranicaB + stranicaC);
        return Math.sqrt(s * (s - stranicaA) * (s - stranicaB) * (s - stranicaC));
    }

    @Override
    public String toString() {
        return "Duzina stranice A je: " + stranicaA +
               "\nDuzina stranice B je: " + stranicaB +
               "\nDuzina stranice C je: " + stranicaC;
    }
}
