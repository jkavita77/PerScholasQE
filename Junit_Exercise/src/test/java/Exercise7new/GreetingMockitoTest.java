package Exercise7new;


	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertSame;
	import static org.mockito.Mockito.mock;
	import static org.mockito.Mockito.when;

	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.mockito.Mockito;

import Excercise7.Greeting;

	public class GreetingMockitoTest {
		private static Greeting  greeting ;

		@BeforeClass
		public static void create() {
			greeting = mock(Greeting.class);
			when(greeting.selectLanguage(1)).thenReturn("English");

		}

		@Test
		public void testEnglish() {
			assertEquals("English", greeting.selectLanguage(1));
		}
}
