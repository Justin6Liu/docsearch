import org.junit.*;
import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;



public class DocSearchTest {
    @Test
    public void showBehavior() throws IOException, URISyntaxException{
        Handler testHandler = new Handler("technical");
        assertEquals("Don't know how to handle that path!",testHandler.handleRequest(new URI("localhost:4000")));
    }
}
