package Ej5_;

public interface IRepositorio {
    IRepositorio suscribir(Desarrollador desarrollador);
    IRepositorio quitarSuscripcion(Desarrollador desarrolador);
    void notificar(String mensaje);
}
