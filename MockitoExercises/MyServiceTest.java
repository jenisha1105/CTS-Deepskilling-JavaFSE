import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testMockingAndStubbing() {

        // Create Mock Object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the Method
        when(mockApi.getData()).thenReturn("CTS Deep Skilling");

        // Inject Mock Object
        MyService service = new MyService(mockApi);

        // Call Method
        String result = service.fetchData();

        // Verify Output
        assertEquals("CTS Deep Skilling", result);

        // Verify Method Call
        verify(mockApi).getData();
    }
}
