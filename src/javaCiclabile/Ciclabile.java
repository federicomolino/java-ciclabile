package javaCiclabile;

import java.util.ArrayList;
import java.util.List;

public class Ciclabile {

        private List<Integer> numeriInteri;

        private int count;


        public Ciclabile(int numeriInteri[]) {
            this.numeriInteri = new ArrayList<Integer>(numeriInteri.length);
            //aggiungo i vari numeri
            for (int i = 0; i < numeriInteri.length; i++) {
                this.numeriInteri.add(numeriInteri[i]);
            }

            count = 0;
        }

        public Ciclabile(){

        }

        public int getElementoSuccessivo(){

           if (count < numeriInteri.size()) {
               //Diamo a numero il valore
               int numero = numeriInteri.get(count);
               count++;
               return numero;
           }else {
               System.out.println("Non sono più presenti elementi");
               return 0;
           }
        }

        public boolean hasAncoraElementi() {
            //verifico se il count ha la stessa grandezza della lista
            if (count < numeriInteri.size()) {
                System.out.println("Ancora ci sono elementi");
                return true;
            }else{
                System.out.println("Non ci sono elementi da restituire");
                return false;
            }
        }

        public int addElemento(int numeroAggiunto){
            this.numeriInteri.add(numeroAggiunto);
            getElementoSuccessivo();
            return numeroAggiunto;
        }

        public List<Integer> getNumeriInteri() {
            return numeriInteri;
        }
}
