package Ej5_;


public class Client {
    public static void main(String[] args) {

        Git g = new Git();
        Github gh = new Github();

        Commit a = new Commit();
        a.addCodigo("PRIMERA LINEA");
        g.setCommit(a);
        gh.createCommit(g.crearMemento("1.1.23", "linea 1", "12hz"));

        a.addCodigo("SEGUNDA LINEA");
        g.setCommit(a);
        gh.createCommit(g.crearMemento("1.1.23", "linea 2", "13hz"));

        a.addCodigo("TERCERA LINEA");
        g.setCommit(a);
        gh.createCommit(g.crearMemento("1.1.23", "linea 3", "14hz"));

        a.addCodigo("CUARTA LINEA");
        g.setCommit(a);
        gh.createCommit(g.crearMemento("1.1.23", "linea 4", "15hz"));

        a.addCodigo("QUINTA LINEA");
        g.setCommit(a);
        gh.createCommit(g.crearMemento("1.1.23", "linea 5", "16hz"));

        a.show();

        g.suscribir(new Desarrollador("Fabian", "1")).suscribir(new Desarrollador("Mariel", "12")).suscribir(new Desarrollador("Nabil", "123"));

        System.out.println("DE VUELTA AL PRIMER COMMIT: ");

        a = g.recuperarCommit(gh.getCommit("12hz"));
        a.show();

        g.quitarSuscripcion(new Desarrollador("Marco", "1")).quitarSuscripcion(new Desarrollador("Wendy", "12"))
        .quitarSuscripcion(new Desarrollador("Vannesa", "123"));

        g.suscribir(new Desarrollador("Luciana", "1")).suscribir(new Desarrollador("Fernanda", "12")).suscribir(new Desarrollador("Valentina", "123"));

        System.out.println("DE VUELTA AL QUINTO COMMIT: ");

        a = g.recuperarCommit(gh.getCommit("16hz"));
        a.show();

    }
}
