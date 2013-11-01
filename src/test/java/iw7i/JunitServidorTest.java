package iw7i;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import iw7i.JunitServidor;

public class JunitServidorTest {
	private JunitServidor jt;
	
	@Before
	public void setUp() throws Exception {
		jt = new JunitServidor(80);
		//launchServer(jt);
	}

	@After
	public void tearDown() throws Exception {
		 /*
		   * se ejecuta al acabar el test. en este caso
		   * lo dejo vacio ya que no tengo que hacer nada
		   * despues del test
		   * 
		   */
	}

	@Test
	public void testServidor() {
		assertTrue(jt.isRunning());
	}

}
