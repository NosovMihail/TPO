import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ArcsinTest {

    private final ArcsinImpl arcsin = new ArcsinImpl();
    private int n = 13;
    private final double delta = 0.005;

    @ParameterizedTest
    @CsvSource( {
            "-1, -1.35642",
            "-0.8, -0.92729",
            "-0.6, -0.64350",
            "-0.5, -0.52359",
            "-0.3, -0.30469",
            "-0.1, -0.10016",
            "0, 0",
            "0.2, 0.20136",
            "0.4, 0.41151",
            "0.841471, 1.0",
            "1, 1.35642",
    } )
    protected void test5EqualSegments( double x, double y ) {
        assertEquals( arcsin.arcsin( x, n ), y, delta );
    }

    @ParameterizedTest
    @CsvSource( {
            "-1, 1",
            "-0.9, 0.9",
            "-0.7, 0.7",
            "-0.35, 0.35",
            "-0.115, 0.115",
            "-0.54, 0.54",
            "-0.01, 0.01"
    } )
    public void test5Parity( double x1, double x2 ) {
        assertEquals( arcsin.arcsin( x1, n ), arcsin.arcsin( x2, n ) * (-1), delta );
    }

}
