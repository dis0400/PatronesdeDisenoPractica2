package Ej2_chainRespons;

public class Client {
    public static void main(String[] args) {
        CuerpoEManager manager = new CuerpoEManager();

        manager.orden("Limpiezas");
        manager.orden("Manifestaciones");
        manager.orden("Desbloqueos");
        manager.orden("Desbloqueos/Manifestaciones");
        manager.orden("Disciplina");
        manager.orden("Entrevistas");

    }
}
