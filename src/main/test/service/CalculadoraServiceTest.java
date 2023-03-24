import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import model.Poligono;
import model.Quadrado;
import model.Triangulo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.CalculadoraService;

public class CalculadoraServiceTest {

    private static CalculadoraService calculadoraService;
    private static Poligono poligonoMock;

    @BeforeAll
    public static void aoIniciar() {
        calculadoraService = new CalculadoraService();
        poligonoMock = mock(Poligono.class);
    }

    @Test
    public void somarTest() {
        int resultado = calculadoraService.somar(1, 4);
        assertEquals(resultado, 5);
    }

    @Test
    public void subtrairTest() {
        int resultado = calculadoraService.subtrair(5, 4);
        assertEquals(resultado, 1);
    }

    @Test
    public void dividirTest() {
        int resultado = calculadoraService.dividir(12, 4);
        assertEquals(resultado, 3);
    }

    @Test
    public void multiplicarTest() {
        int resultado = calculadoraService.multiplicar(6, 6);
        assertEquals(resultado, 36);
    }

    @Test
    public void calcularAreaQuadradoTest() {
        Quadrado quadradoMock = mock(Quadrado.class);
        when(quadradoMock.calcularArea()).thenReturn(4.0);

        double areaQuadrado = calculadoraService.calcularArea(quadradoMock);
        assertEquals(areaQuadrado, 4.0);
    }

    @Test
    public void calcularAreaTrianguloTest() {
        Triangulo trianguloMock = mock(Triangulo.class);
        when(trianguloMock.calcularArea()).thenReturn(6.0);

        double areaTriangulo = calculadoraService.calcularArea(trianguloMock);
        assertEquals(areaTriangulo, 6.0);
    }

    @Test
    public void identificarTrianguloDeMenorAreaTest() {
        Triangulo triangulo1 = new Triangulo(2, 3);
        Triangulo triangulo2 = new Triangulo(3, 4);

        Triangulo trianguloDeMenorArea = calculadoraService.identificarTrianguloDeMenorArea(triangulo1, triangulo2);
        assertEquals(trianguloDeMenorArea, triangulo1);
    }

    @Test
    public void identificarQuadradoDeMenorAreaTest() {
        Triangulo quadrado1 = new Quadrado(2);
        Triangulo quadrado2 = new Quadrado(3);

        Quadrado quadradoloDeMenorArea = calculadoraService.identificarQuadradoDeMenorArea(quadrado1, quadrado2);
        assertEquals(quadradoloDeMenorArea, quadrado1);
    }
}