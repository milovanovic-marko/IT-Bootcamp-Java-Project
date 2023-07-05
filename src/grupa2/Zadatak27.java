/*
* 27.* Napisati fuknciju koja racuna kontinualnu kamatnu stopu za zadatu osnovicu,
* nominalnu kamatnu stopu i vremenski period.
* */
package grupa2;

public class Zadatak27 {

    static double kontinualnaKamata(double osnovica, double nominalnaKamata, double periodOtplate) {
        return osnovica * Math.exp(nominalnaKamata*periodOtplate);
    }

    public static void main(String[] args) {
        double osnovica = 10000;
        double nominalnaKamata = 0.03;
        double periodOtplate = 12;
        System.out.println(kontinualnaKamata(osnovica, nominalnaKamata, periodOtplate));
    }
}
