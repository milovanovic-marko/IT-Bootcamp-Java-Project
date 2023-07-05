package grupa4oop.zadatak20.baza;

import grupa4oop.zadatak20.interfejsi.MerljivoU2D;

public abstract class Figura extends Oblik implements MerljivoU2D {
    public Figura() {
    }

    @Override
    public String getOsobine() {
        return "Obim: " + obim() + "\nPovrsina: " + povrsina();
    }
}
