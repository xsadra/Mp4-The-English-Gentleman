package de.sadrab.Mp4TheEnglishGentleman;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterEnglishMan {
    @Bean
    public ApplicationRunner startEnMan(EnglishGentleMan englishGentleMan) {
        return args -> {
            englishGentleMan.read();
            englishGentleMan.smoke();
            Boolean isEnjoy = englishGentleMan.isEnjoy();
            if (isEnjoy) {
                System.out.println("I enjoy :)");
                return;
            }
            System.out.println("Not enjoy :(");
        };
    }
}
