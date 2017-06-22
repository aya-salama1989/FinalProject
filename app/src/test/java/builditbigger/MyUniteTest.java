package builditbigger;

import com.example.JokesClass;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertTrue;

/**
 * Created by Dell on 22/06/2017.
 */

@RunWith(JUnit4.class)

public class MyUniteTest {
    @Test
    public void isString() {
        JokesClass jokesClass = new JokesClass();
        assertTrue(jokesClass.getAJoke().matches("I am a funny joke, hehehe"));
    }
}
