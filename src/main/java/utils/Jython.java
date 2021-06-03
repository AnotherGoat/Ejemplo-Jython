package utils;

import org.python.util.PythonInterpreter;

import java.io.StringWriter;

public class Jython {
    public void interpretarPython(String archivo) {
        try (PythonInterpreter pyInterp = new PythonInterpreter()) {
            StringWriter output = new StringWriter();
            pyInterp.setOut(output);

            pyInterp.execfile(archivo);
        }
    }
}
