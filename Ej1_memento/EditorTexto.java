package Ej1_memento;

public class EditorTexto {
    private Tesis tesis;

    public void setTesis(Tesis tesis){
        System.out.println("TESIS LISTA PARA SER GUARDADA...");
        this.tesis = tesis.clone();
    }

    public Memento createMemento(String fecha){
        return new Memento(tesis.clone(), fecha);
    }

    public Tesis recuperarTesis(Memento memento){
        this.tesis = memento.getTesis();
        System.out.println("SE RECUPERO LA TESIS DE: "+memento.getFecha()+"--------------------------------------------------------------");
        return this.tesis;
    }
}
