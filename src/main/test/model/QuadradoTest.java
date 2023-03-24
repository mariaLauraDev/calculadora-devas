import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import model.Quadrado;
import service.CalculadoraService;

public class CalculadoraServiceTest {

    private CalculadoraService calculadoraService = new CalculadoraService();

    @Test
    public void identificarQuadradoDeMenorAreaTest() {
        Quadrado quadrado1 = new Quadrado(1);
        Quadrado quadrado2 = new Quadrado(2);
        Quadrado quadrado3 = new Quadrado(3);
        Quadrado quadrado4 = new Quadrado(2);

        assertEquals(quadrado1, calculadoraService.identificarQuadradoDeMenorArea(quadrado1, quadrado2));
        assertEquals(quadrado2, calculadoraService.identificarQuadradoDeMenorArea(quadrado2, quadrado3));
        assertNull(calculadoraService.identificarQuadradoDeMenorArea(quadrado2, quadrado4));
    }

    @Test
    public void calcularAreaTest() {
        Quadrado quadrado1 = new Quadrado(5);
        Quadrado quadrado2 = new Quadrado(4);

        double areaQuadrado1 = calculadoraService.calcularArea(quadrado1);
        double areaQuadrado2 = calculadoraService.calcularArea(quadrado2);

        boolean expectedQuadrado1 = areaQuadrado1 == 25;
        boolean expectedQuadrado2 = areaQuadrado2 == 16;

        Assert.assertTrue(expectedQuadrado1);
        Assert.assertTrue(expectedQuadrado2);
    }
}
