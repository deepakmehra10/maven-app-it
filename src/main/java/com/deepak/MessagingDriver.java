package com.deepak;

import java.util.logging.Logger;

public class MessagingDriver {
    
    public static void main(String[] args) {
        SocialMessageAggregator socialMessageAggregator = new SocialMessageAggregator();
        
        String userMessage = socialMessageAggregator.aggregateMessages();
        System.out.println(userMessage);
    }
}
