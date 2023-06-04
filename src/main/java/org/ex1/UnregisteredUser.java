package org.ex1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnregisteredUser extends Client implements Observer {

    private String email;

    public UnregisteredUser(String dni, String name) {
        super(dni, name);
    }

    @Override
    public void update(Subject subject) {
        String text = generateText((Component) (subject));
        sendMail(email, text);
    }

    private String generateText(Component component) {
        return component.getDescription() + " is now in stock.";
    }

    public void sendMail(String email, String text) {
        // service.sendMail(email, text);
    }
}
