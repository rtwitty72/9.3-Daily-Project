package com.company;

import java.time.LocalDateTime;

/**
 * Created by macbookpro on 7/19/17.
 */
public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;
    protected String status;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }


    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {

        System.out.println("The recipient is: " + recipient);
        System.out.println("The provider is: " + smtpProvider);
        System.out.println("The subject is: " + getSubject());
        System.out.println("The body is: " + getBody());
        System.out.println("The creation date is: " + getCreatedAt());
    }

    @Override
    public void printText(){
        super.printText();
        System.out.println("Text from protected method");
    }

    @Override
    public boolean equals(Object o) {
        return status.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        EmailNotification clonedEmailedNofification = new EmailNotification(this.getSubject(), this.getBody(), this.getRecipient(), this.getSmtpProvider());
        return clonedEmailedNofification;
    }
}



