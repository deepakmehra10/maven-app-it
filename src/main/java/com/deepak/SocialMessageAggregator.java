package com.deepak;

import com.deepak.messagingapps.FacebookMessage;
import com.deepak.messagingapps.InstagramMessage;

public class SocialMessageAggregator {
    
    private InstagramMessage instagramMessage = new InstagramMessage();
    
    private FacebookMessage facebookMessage = new FacebookMessage();
    
    public String aggregateMessages() {
        
        String aggregatedMessage = "Combined message is as follows \n"
                + "Message from facebook - " + facebookMessage.fromMessenger()
                + "\nMessage from Instagram - " + instagramMessage.getDirectMessage();
        
        return aggregatedMessage;
    }
}
