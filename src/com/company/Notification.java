package com.company;

import java.time.LocalDateTime;

/**
 * Created by macbookpro on 7/19/17.
 */
public class Notification {
private String subject;
private String body;
private LocalDateTime createdAt;

protected String status = "So far so good";


    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;

    }

    public void transport() {
    throw new NoTransportException();

    }


    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getCreatedAt() {return createdAt;
    }

    public void showStatus() {
        System.out.println(this.status);
    }

    protected void printText() {
        System.out.println("Text from protected method");

    }

}
