package com.rui;


abstract class MeuArray  {
    protected Double[] array;
    protected int tamanhoVetorAtual;

    public abstract void adicionarElemento(Double elemento) ;

    public void removerElemento(Double elemento) {
        for(int i = 0; i < tamanhoVetorAtual; i++){
            if(array[i].doubleValue() == elemento){
                System.out.println("Valor: " + array[i] + " da posição: " + i + " removido com sucesso!");
                array[i] = null;
                break;
            }
        }
    }

    public Double recuperarElemento(Integer index) {
        if(index != null && index < tamanhoVetorAtual)
            return array[index];
        return null;
    }

    public  void imprimeElementos(){
        for(int i = 0; i < tamanhoVetorAtual; i++){
            System.out.println(array[i]);
        }
    }

    public Double[] expandirVetor(Double[] array, double multiplicador){

        Double[] auxArray = new Double[(int)(tamanhoVetorAtual * multiplicador)];
        System.arraycopy(array,0, auxArray,0, tamanhoVetorAtual);

        array = new Double[(int)(tamanhoVetorAtual * multiplicador)];
        System.arraycopy(auxArray,0,array,0, tamanhoVetorAtual);

        tamanhoVetorAtual *= multiplicador;

        return array;
    }
}
