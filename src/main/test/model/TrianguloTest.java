import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.CalculadoraService;

public class TrianguloTest {

    private static CalculadoraService calculadoraMock;
    private Triangulo triangulo;

    @BeforeAll
    public static void aoIniciar() {
        calculadoraMock = mock(CalculadoraService.class);
        triangulo = new Triangulo (2,2);
    }

    @Test
    public void calcularAreaTest() {
        when(calculadoraMock.calcularArea(triangulo)).thenReturn(2);
        double areaTriangulo = triangulo.calcularArea();

        assertEquals(areaTriangulo, 2);
    }

    @Test
    public void identificarTrianguloDeMenorAreaTest() {
        Triangulo triangulo1 = new Triangulo(2, 2);
        Triangulo triangulo2 = new Triangulo(3, 3);
        Triangulo triangulo3 = new Triangulo(1, 1);

        when(calculadoraMock.calcularArea(triangulo1)).thenReturn(2.0);
        when(calculadoraMock.calcularArea(triangulo2)).thenReturn(4.5);
        when(calculadoraMock.calcularArea(triangulo3)).thenReturn(0.5);

        assertEquals(triangulo3, CalculadoraService.identificarTrianguloDeMenorArea(triangulo1, triangulo2, triangulo3));
        assertEquals(triangulo1, CalculadoraService.identificarTrianguloDeMenorArea(triangulo1, triangulo2));
    }
}
