package com.PerScholas_Excercise5;

import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.PerScholas_Exercixe5.ListMapClass;
import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.hamcrest.collection.IsMapContaining.hasKey;
import static org.hamcrest.collection.IsMapContaining.hasValue;

public class ListMapClassTest {

	 @Test
     public void listtest() {
	ListMapClass simple = new ListMapClass();	 
	assertThat(ListMapClass.cities(), hasItem("Dallas"));
	assertThat( ListMapClass.cities(), everyItem( is(not("orange")) ) );
	assertTrue(ListMapClass.cities().contains("Boston"));
	     }
	 
	 
	@Test
         public void MapMethod()
         {
             Map<String, String> courses = ListMapClass.getCoursesMap();
             ListMapClass TM = new ListMapClass();
             assertThat(courses,hasEntry("ASM", "Application Support Management"));
             assertThat(courses, hasKey("JD"));
             assertThat(courses, hasValue("Data Engineering"));
         }
         
         
//         @Test
//         public void getUserList() {
//    	ListMapClass simple = new ListMapClass();	 
//    	//assertThat(ListMapClass.getUserList(), hasItem("John"));
//    	//assertThat( ListMapClass.cities(), everyItem( is(not("orange")) ) );
//    	//assertTrue(ListMapClass.cities().contains("Boston"));
    	     

}
