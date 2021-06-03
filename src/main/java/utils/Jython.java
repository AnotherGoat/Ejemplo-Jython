package utils;

import lombok.Data;
import org.python.util.PythonInterpreter;

import java.io.StringWriter;

@Data
public class Jython {
    public String interpretarPython(String archivo) {
        try (var py = new PythonInterpreter()) {
            StringWriter output = new StringWriter();
            py.setOut(output);

            py.execfile(archivo);
            return output.toString().trim();
        }
    }
}
