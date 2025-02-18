import javaCiclabile.Ciclabile;

public class Main {
    public static void main(String[] args) {

        Ciclabile ciclabile = new Ciclabile(new int[]{1, 2, 3, 4, 5});

        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());

        System.out.println(ciclabile.addElemento(5));
        System.out.println(ciclabile.addElemento(8));

        System.out.println("Ora i numeri nella lista sono " + ciclabile.getNumeriInteri().size());
    }
}