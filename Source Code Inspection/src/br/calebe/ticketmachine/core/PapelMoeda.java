package br.calebe.ticketmachine.core;

/**
 * CASSIO NAGLE CALLEGARI 31326773
 * LUIZ GUILHERME MARGHERITO PAES DE ALMEIDA 31339913
 * 
 */
public class PapelMoeda {

    public double valor;
    public int quantidade;

    public PapelMoeda(double valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}