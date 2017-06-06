import org.junit.Assert;
import org.junit.Test;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

/**
 * Created by dmitrykolesnikovich on 6.6.17.
 */
public class ReadClassFile {

    @Test
    public void readMagicNumberAppClass() throws Exception {
        DataInputStream dataInputStream = new DataInputStream(Files.newInputStream(Paths.get("/home/dmitrykolesnikovich/workspace/jd-gui/app/build/classes/main/org/jd/gui/App.class")));
        int magicNumber = dataInputStream.readInt();
        assertEquals(magicNumber, -889275714);
    }

}
