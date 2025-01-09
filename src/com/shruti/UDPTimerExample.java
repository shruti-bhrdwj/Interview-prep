package com.shruti;

import java.util.Timer;
import java.util.TimerTask;

public class UDPTimerExample {

    public static void main(String[] args) {
        // Create a timer object
        Timer timer = new Timer();

        // Simulate sending a request to UDP Server
        System.out.println("Sending UDP request...");

        // Start the timer for 10 seconds
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // This code will be executed when the timer expires
                System.out.println("Timer expired: Response not received from UDP Server.");
            }
        }, 10000); // 10 seconds in milliseconds

        // Simulate receiving a response from UDP Server (set to true for response, false for no response)
        boolean responseReceived = true;

        if (responseReceived) {
            // Cancel the timer as response is received
            timer.cancel();
            System.out.println("Response received from UDP Server. Timer cancelled.");
        }

        // Continue with other processing...
    }
}

