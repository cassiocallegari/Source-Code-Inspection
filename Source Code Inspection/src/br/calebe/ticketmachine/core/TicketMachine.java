package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 * CASSIO NAGLE CALLEGARI 31326773
 * LUIZ GUILHERME MARGHERITO PAES DE ALMEIDA 31339913
 * 
 */
public class TicketMachine {

    public double valor;
    public double saldo;
    private int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(double valor) {
        this.valor = valor;
        this.saldo = 0;
    }

    public void inserir(double quantia) throws PapelMoedaInvalidaException {
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length && !achou; i++) {
            if (papelMoeda[1] == quantia) {
                achou = true;
            }
        }
        if (!achou) {
            throw new PapelMoedaInvalidaException();
        }
        this.saldo += quantia;
    }

    public double getSaldo() {
        return saldo;
    }

    public Iterator<Integer> getTroco() {
        return null;
        
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException();
        }
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        return result;
    }
}