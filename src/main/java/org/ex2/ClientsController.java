package org.ex2;

import org.ex1.Client;

public class ClientsController {

    private static final String WELCOME_TO_SHOP_MESSAGE_ID = "welcome-shop-id";
    private View view;

    public Client newClient(String dni, String name){
        Client c = new Client(dni, name);
        Translations t = Translations.getInstance();
        view.setMessage(t.getTranslation(WELCOME_TO_SHOP_MESSAGE_ID));

        return c;
    }
}
