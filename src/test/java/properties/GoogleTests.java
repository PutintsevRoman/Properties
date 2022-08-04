package properties;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GoogleTests extends TestBase {


    @Test
    public void testGoogle() {
        assertEquals(title(), "Google");
    }


}
