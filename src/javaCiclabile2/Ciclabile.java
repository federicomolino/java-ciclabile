package javaCiclabile2;

public class Ciclabile {

    private final int [] elenco;

    private int indice;

    private int indiceScrittura;

    public Ciclabile(int [] elenco) {
        this.elenco = elenco;
    }

    public Ciclabile() {
        this.elenco = new int[10];
    }

    void addElemento(int elemento) {
        if (indiceScrittura < elenco.length) {
            this.elenco[indiceScrittura] = elemento;
            indiceScrittura++;
        }else{
            System.out.println("Elenco completo");
        }
    }

    int getElementoSuccessivo(){
        if (hasAncoraElementi()){
            int valore = elenco[indice];
            indice++;
            return valore;
        }else{
            return -1;
        }
    }

    boolean hasAncoraElementi(){
        if (indice < elenco.length) {
            return true;
        }else{
            return false;
        }
    }
}
