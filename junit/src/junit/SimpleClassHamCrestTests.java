package junit;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

import java.awt.List;
import java.util.Arrays;

import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.number.OrderingComparison.lessThan;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

public class SimpleClassHamCrestTests {
 @Test
 public void returnTrueTest() {
	 SimpleClass sc = new SimpleClass();
	 assertThat(sc.returnTrue(), is(true));
 }
 
 
 @Test
 public void returnFalseTest() {
	 SimpleClass sc = new SimpleClass();
	 assertThat(sc.returnFalse(), is(not(true)));
 }
  
 @Test
 public void returnNotNullTest() {
	 SimpleClass sc = new SimpleClass();
	 assertThat(sc.returnNotNull(), notNullValue());
}
 
 @Test
 public void returnOneTest() {
	 SimpleClass sc = new SimpleClass();
	 assertThat(sc.returnOne(), is(1));
	 assertThat(sc.returnOne(), equalTo(1));
	 assertThat(sc.returnOne(), allOf(not(2), lessThan(5)));
	 assertThat(sc.returnOne(), sameInstance(1));
	 assertThat(sc.returnOne(), anyOf(equalTo(1), not(equalTo(2))));
 }
 
 @Test
 public void returnNullTest() {
	 SimpleClass sc = new SimpleClass();
	 assertThat(sc.returnNull(), nullValue());
} 
 @Test
 public void returnListTest() {
	 SimpleClass sc = new SimpleClass();
	// List<String> actual = sc.returnList();
	// List<String> expected = Arrays.asList("red", "Green");
	 
	 
	 assertThat(sc.returnOne(), is(1));
	 assertThat(sc.returnOne(), equalTo(1));
	 assertThat(sc.returnOne(), allOf(not(2), lessThan(5)));
	 assertThat(sc.returnOne(), sameInstance(1));
	 assertThat(sc.returnOne(), anyOf(equalTo(1), not(equalTo(2)))); 
 
}
}
