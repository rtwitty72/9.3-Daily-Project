package com.company;

import sun.rmi.transport.Transport;

public class Main {

    public static void main(String[] args) {

        EmailNotification newEmailNotification = new EmailNotification("notification", "This is an email notification", "Rhonda", "Google");
        TextNotification newTextNotification = new TextNotification( "Notification", "This is a notification", "Rhonda", "Google");
        newEmailNotification.transport();
        newTextNotification.transport();
        newEmailNotification.printText();

        Object emailNotificationClone = null;
        try {
            emailNotificationClone = newEmailNotification.clone();
        } catch
                (CloneNotSupportedException e) {
            e.printStackTrace();

        }
        newEmailNotification.equals(emailNotificationClone);


        System.out.println(newEmailNotification.equals(emailNotificationClone));
        System.out.println(newEmailNotification.getSubject());
        System.out.println(newEmailNotification.getCreatedAt());
    }

}



