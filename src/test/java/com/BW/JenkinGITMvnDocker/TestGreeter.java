package com.BW.JenkinGITMvnDocker;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;


public class TestGreeter     
{
    private Greeter greeter;
    
    @Before
    public void setup() {
    	greeter = new Greeter();
    }
    @Test
    public void greetShouldIncludeTheOneBeingGreeted(){
    	String someone ="World";
    	Assert.assertNotEquals(greeter.greet(someone), (someone));
    	//asertThat(greeter.greet(someone), containsString(someone));
    	
    	
    }
   
    @Test
    public void greetShouldIncludeGreetingPhrase(){
    	String someone ="World";
    	Assert.assertEquals(greeter.greet(someone).length(), 13);
    	
    }
    
       
}
