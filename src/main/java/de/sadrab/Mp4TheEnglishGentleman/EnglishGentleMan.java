package de.sadrab.Mp4TheEnglishGentleman;

import org.springframework.stereotype.Component;

@Component
public class EnglishGentleMan {
    private Monocle monocle;
    private Lighter lighter;
    private Cigarate cigarate;
    private NewsPaper newsPaper;

    public EnglishGentleMan(Monocle monocle, Lighter lighter) {
        this.monocle = monocle;
        this.lighter = lighter;
    }

    public Cigarate smoke() {
        this.cigarate = lighter.lighten();
        return cigarate;
    }

    public NewsPaper read() {
        this.newsPaper = monocle.see();
        return newsPaper;
    }

    public Boolean isEnjoy() {
        if (cigarate != null && newsPaper != null)
            return true;
        return false;
    }
}
