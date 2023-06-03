package org.ex1;

import lombok.Data;

@Data
public class UnregisteredUser extends Client implements Observer {

    private String email;

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
