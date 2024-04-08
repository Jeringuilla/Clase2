
package hilos_gráfico;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexb
 */
public class Avance_threadTest {
    
    Avance_thread objeto_thread;
    
    public Avance_threadTest() {
    }
    
    @BeforeEach
    public void setUp() {
        objeto_thread = new Avance_thread();
    }
    
    @AfterEach
    public void tearDown() {
        objeto_thread = null;
    }

    /**
     * Test of run method, of class Avance_thread.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        //Avance_thread instance = new Avance_thread();
        objeto_thread.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
