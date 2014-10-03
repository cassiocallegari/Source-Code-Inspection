package br.calebe.ticketmachine.exception;

/**
 * CASSIO NAGLE CALLEGARI 31326773
 * LUIZ GUILHERME MARGHERITO PAES DE ALMEIDA 31339913
 * 
 */
public class PapelMoedaInvalidaException extends Exception {
    public void imprimeMensagem(){
    System.out.println("A nota é inválida. Insira outra nota.");
}
}