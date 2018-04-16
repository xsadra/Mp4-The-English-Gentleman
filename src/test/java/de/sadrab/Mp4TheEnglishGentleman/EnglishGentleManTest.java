package de.sadrab.Mp4TheEnglishGentleman;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class EnglishGentleManTest {

    @Autowired
    private EnglishGentleMan englishGentleMan;

    @Test
    void smoke() {
        Cigarate cigarate = englishGentleMan.smoke();
        assertNotNull(cigarate);
    }

    @Test
    void read() {
        NewsPaper newsPaper = englishGentleMan.read();
        assertNotNull(newsPaper);
    }

    @Test
    void isEnjoy() {
        Boolean enjoy = englishGentleMan.isEnjoy();
        assertTrue(enjoy);
    }
}