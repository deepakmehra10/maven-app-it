package com.deepak;

import com.deepak.messagingapps.FacebookMessage;
import com.deepak.messagingapps.InstagramMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SocialMessageAggregatorTest {
    
    // private static SocialMessageAggregator socialMessageAggregator;
    
    @Mock
    private InstagramMessage instagramMessage;
    
    @Mock
    private FacebookMessage facebookMessage;
    
    @InjectMocks
    private SocialMessageAggregator socialMessageAggregator;
   /* @BeforeClass
    public static void setUp() {
        socialMessageAggregator = new SocialMessageAggregator();
    }*/
    
   /* @AfterClass
    public static void tearDown() {
        
        if (socialMessageAggregator != null) {
            socialMessageAggregator = null;
        }
    }*/
    
    @Test
    public void testAggregateMessages() {
        //Stubs
        Mockito.when(instagramMessage.getDirectMessage()).thenReturn("Instagram Message");
        Mockito.when(facebookMessage.fromMessenger()).thenReturn("Facebook Message");
        
        String actualResult = socialMessageAggregator.aggregateMessages();
        String expectedResult = "Combined message is as follows "
                + "\nMessage from facebook - Facebook Message"
                + "\nMessage from Instagram - Instagram Message";
        
        assertEquals("Checking aggregated Messages", expectedResult, actualResult);
    }
}
