package lanzador;

import utils.Jython;

public class App {
    public static void main(String[] args) {
        var jython = new Jython();
        jython.interpretarPython("src/main/python/holamundo.py");
    }
}
