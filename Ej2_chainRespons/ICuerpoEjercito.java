package Ej2_chainRespons;

public interface ICuerpoEjercito {
    void setNext(ICuerpoEjercito next);
    ICuerpoEjercito next();

    void orden(String orden);
}
