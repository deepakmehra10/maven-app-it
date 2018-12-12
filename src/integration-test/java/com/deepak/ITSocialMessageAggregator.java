package com.deepak;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ITSocialMessageAggregator {
    
    private static SocialMessageAggregator socialMessageAggregator;
    
    @BeforeClass
    public static void setUp() {
        socialMessageAggregator = new SocialMessageAggregator();
    }
    
    @AfterClass
    public static void tearDown() {
        
        if (socialMessageAggregator != null) {
            socialMessageAggregator = null;
        }
    }
    
    @Test
    public void testAggregateMessages() {
        String actualResult = socialMessageAggregator.aggregateMessages();
        String expectedResult = "Combined message is as follows "
                + "\nMessage from facebook - Facebook message from Messenger."
                + "\nMessage from Instagram - Message from Instagram App.";
        
        assertEquals("Checking aggregated Messages", expectedResult, actualResult);
    }
}
