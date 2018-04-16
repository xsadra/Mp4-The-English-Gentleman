package de.sadrab.Mp4TheEnglishGentleman;

import org.springframework.stereotype.Component;

@Component
public class Lighter {
    private Cigarate cigarate;

    public Lighter(Cigarate cigarate) {
        this.cigarate = cigarate;
    }
    public Cigarate lighten(){
        return cigarate;
    }
}
