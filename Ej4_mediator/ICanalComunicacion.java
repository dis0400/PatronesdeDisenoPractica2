package Ej4_mediator;

public interface ICanalComunicacion {
    void send(String message, Persona persona, Persona recipiente);
    void send(String message, Persona persona);
}
