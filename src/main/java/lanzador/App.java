package lanzador;

import utils.Jython;

public class App {
    public static void main(String[] args) {
        var jython = new Jython();
        String salida = jython.interpretarPython("src/main/python/holamundo.py");
        System.out.println(salida);
    }
}
