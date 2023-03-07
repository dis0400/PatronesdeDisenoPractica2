package Ej2_chainRespons;

public class CuerpoEManager implements ICuerpoEjercito {
    
    private ICuerpoEjercito next;

    @Override
    public ICuerpoEjercito next() {
        return next;
    }

    @Override
    public void orden(String orden) {
        CuerpoECabo cabo = new CuerpoECabo();
        CuerpoECoronel coronel = new CuerpoECoronel();
        CuerpoEGeneral general = new CuerpoEGeneral();
        CuerpoETeniente teniente = new CuerpoETeniente();

        this.setNext(cabo);
        cabo.setNext(coronel);
        coronel.setNext(teniente);
        teniente.setNext(general);

        this.next.orden(orden);
    }

    @Override
    public void setNext(ICuerpoEjercito next) {
        this.next = next;
    }
    
}
