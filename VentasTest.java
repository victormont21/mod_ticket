
package MenuPrincipal;

import javax.swing.JTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class VentasTest {
    
    public VentasTest() {
    }

    @Test
    public void testFecha_actual() {
        System.out.println("fecha_actual");
        Ventas instance = null;
        instance.fecha_actual();
        fail("The test case is a prototype.");
    }

    @Test
    public void testId_cliente_auto() {
        System.out.println("id_cliente_auto");
        Ventas instance = null;
        int expResult = 0;
        int result = instance.id_cliente_auto();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testId_venta_auto() {
        System.out.println("id_venta_auto");
        Ventas instance = null;
        int expResult = 0;
        int result = instance.id_venta_auto();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testId_factura_auto() {
        System.out.println("id_factura_auto");
        Ventas instance = null;
        int expResult = 0;
        int result = instance.id_factura_auto();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testLimpiarTabla() {
        System.out.println("limpiarTabla");
        JTable tabla = null;
        Ventas instance = null;
        instance.limpiarTabla(tabla);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ventas.main(args);
        fail("The test case is a prototype.");
    }
    
}
