package models;

import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/5/18.
 */
public class EventTest {

    @Test
    public void newEvent_newInstatiation_newEventObject(){
        Event testEvent = new Event();
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEvent_addEventName_eventName() throws Exception {
        Event testEvent = new Event();
        testEvent.eventName = "Birthday";
        assertEquals("Birthday", testEvent.eventName);
    }

}