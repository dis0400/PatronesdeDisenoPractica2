package Ej6_;

public interface ICanalComunicacion {
    ICanalComunicacion suscribir(Desarrollador desarrollador);
    ICanalComunicacion quitarSuscripcion(Desarrollador desarrollador);
    void send(String message, Persona persona, Persona recipiente);
    void send(String message, Persona persona);
}
