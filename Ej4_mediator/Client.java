package Ej4_mediator;

public class Client {
    public static void main(String[] args) {
        Whatsapp w = new Whatsapp();

        Persona p0 = new Persona("Alexia", "1").setCanalComunicacion(w);
        Persona p1 = new Persona("Mariel", "2").setCanalComunicacion(w);
        Persona p2 = new Persona("Valentina", "3").setCanalComunicacion(w);
        Persona p3 = new Persona("Guli", "4").setCanalComunicacion(w);
        Persona p4 = new Persona("Fabian", "5").setCanalComunicacion(w);
        Persona p5 = new Persona("Kike", "6").setCanalComunicacion(w);
        Persona p6 = new Persona("Carolina", "7").setCanalComunicacion(w);
        Persona p7 = new Persona("Ximena", "8").setCanalComunicacion(w);
        Persona p8 = new Persona("Adrian", "9").setCanalComunicacion(w);
        Persona p9 = new Persona("Fernando", "10").setCanalComunicacion(w);

        w.addPersonaToContactos(p0);
        w.addPersonaToContactos(p1);
        w.addPersonaToContactos(p2);
        w.addPersonaToContactos(p3);
        w.addPersonaToContactos(p4);
        w.addPersonaToContactos(p5);
        w.addPersonaToContactos(p6);
        w.addPersonaToContactos(p7);
        w.addPersonaToContactos(p8);
        w.addPersonaToContactos(p9);

        w.addPersonaToGrupo(p0);
        w.addPersonaToGrupo(p1);
        w.addPersonaToGrupo(p2);
        w.addPersonaToGrupo(p3);
        w.addPersonaToGrupo(p4);
        w.addPersonaToGrupo(p5);
        w.addPersonaToGrupo(p6);
        w.addPersonaToGrupo(p7);
        w.addPersonaToGrupo(p8);
        w.addPersonaToGrupo(p9);


        p0.send("holi owo", p1);
        p9.send("BUENAS TARDES");
    }
}
