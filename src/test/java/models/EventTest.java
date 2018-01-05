package models;

import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/5/18.
 */
public class EventTest {

    @Test
    public void returnEvent_returnFirstAttributes_ArrayList(){
        Event testEvent = new Event();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add("1");
        assertEquals(expectedOutput,testEvent.returnEvent("1"));
    }

    @Test
    public void returnEvent_returnNextAttributes_ArrayList() throws Exception {
        Event testEvent = new Event();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add("1");
        expectedOutput.add("Dinner");
        assertEquals(expectedOutput,testEvent.returnEvent("Dinner"));
    }
}