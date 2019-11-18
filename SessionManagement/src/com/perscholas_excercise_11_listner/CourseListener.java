package com.perscholas_excercise_11_listner;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

import javax.servlet.annotation.WebListener;

@WebListener
public class CourseListener implements ServletRequestAttributeListener {

	@Override
    public void attributeAdded(ServletRequestAttributeEvent event)  { 
        System.out.println("Request attribute");
    }

@Override
    public void attributeRemoved(ServletRequestAttributeEvent event)  { 
        System.out.println("Request attribute removed");
    }

@Override
    public void attributeReplaced(ServletRequestAttributeEvent event)  { 
        System.out.println("Attribute replaced" );
    }
}
