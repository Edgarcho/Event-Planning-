package models;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/5/18.
 */
public class EventTest {

    @Test
    public void returnEvent_returnFirstAttributes_HashMap(){
        Event testEvent = new Event();
        HashMap<String,Integer> expectedOutput = new HashMap<String,Integer>();
        expectedOutput.put("Guest",1);
        assertEquals(expectedOutput,testEvent.returnEvent("Guest",1));
    }

}