package org.ex2;

public class Translations {

    private static Translations instance = null;

    private Translations() {}

    public static Translations getInstance() {
        if (instance == null)
            instance = new Translations();
        return instance;
    }

    public String getTranslation(String translationId) {
        // getTranslation implementation
        return "";
    }
}
