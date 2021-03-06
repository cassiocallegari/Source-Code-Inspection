package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 * CASSIO NAGLE CALLEGARI 31326773
 * LUIZ GUILHERME MARGHERITO PAES DE ALMEIDA 31339913
 * 
 */
class Troco {

    public PapelMoeda[] papeisMoeda;
    public PapelMoeda[] valor;
    
    
    public Troco (double valor) {
        int count = 0;
        
       papeisMoeda[5] = new PapelMoeda(100, count);
         count = 0;
        while (valor % 100 == 0) {
            count++;
        }
        papeisMoeda[4] = new PapelMoeda(50, count);
        count = 0;
        while (valor % 50 == 0) {
            count++;
        }
        papeisMoeda[3] = new PapelMoeda(20, count);
        count = 0;
        while (valor % 20 == 0) {
            count++;
        }
        papeisMoeda[2] = new PapelMoeda(10, count);
        count = 0;
        while (valor % 10 == 0) {
            count++;
        }
        papeisMoeda[1] = new PapelMoeda(5, count);
        count = 0;
        while (valor % 5 == 0) {
            count++;
        }
        papeisMoeda[0] = new PapelMoeda(2, count);
        count = 0;
        while (valor % 2 == 0) {
            count++;
        }
    }
    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            for (int i = 0; i < 6; i++) {
                if (troco.papeisMoeda[i] != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            for (int i = 0; i < 6 && ret != null; i++) {
                if (troco.papeisMoeda[i] != null) {
                    ret = troco.papeisMoeda[i];
                    troco.papeisMoeda[i] = null;
                }
            }
            return ret;
        }

        @Override
        public void remove() {
            next();
        }
    }
}