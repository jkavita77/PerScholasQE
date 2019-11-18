package junit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SimpleClassTest {

	
		@Test
		public void returnTrueTest() {
			SimpleClass sc = new SimpleClass();
			 boolean actual = sc.returnTrue();
			 assertTrue(actual);
		}

		@Test
		public void returnObjectNullTest() {
			SimpleClass sc = new SimpleClass();
			assertNull(sc.returnNull());
		}
		
		@Test
		public void returnNotNull() {
			SimpleClass sc = new SimpleClass();
			assertNotNull(sc.returnNotNull());
		}
		
		@Test
		public void returnOne() {
			SimpleClass sc = new SimpleClass();
//			assertEquals(sc.returnOne(),1);
			assertSame(sc.returnOne(),1);}
			
			@Test
			public void returnList() {
				SimpleClass sc = new SimpleClass();
//				assertEquals(sc.returnOne(),1);
				assertSame(sc.returnList().get(0),"red");
				assertSame(sc.returnList().get(1),"green");
				assertSame(sc.returnList().get(2),"blue");
				assertThat(sc.returnList().get(0), is("red"));

				//assertThat(simpleClass.returnList().get(0), is("red"));
}
			
			
			@Test
			public void returnArrayList() {
				SimpleClass sc = new SimpleClass();
				// Charlie's method to compare classes
				assertTrue(sc.returnList().getClass().toString().equals("class java.util.ArrayList"));				
			}
			
}

