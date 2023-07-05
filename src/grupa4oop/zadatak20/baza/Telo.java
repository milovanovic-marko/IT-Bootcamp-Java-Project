package grupa4oop.zadatak20.baza;

import grupa4oop.zadatak20.interfejsi.MerljivoU3D;

public abstract class Telo extends Oblik implements MerljivoU3D {
    public Telo() {
    }

    @Override
    public String getOsobine() {
        return "Povrsina: " + povrsina() + "\nZapremina: " + zapremina();
    }
}
