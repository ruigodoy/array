package com.rui;

import util.Utils;

public class ArrayDobroTamanho extends MeuArray {

    public ArrayDobroTamanho() {
        this.tamanhoVetorAtual = 2;
        array = new Double[tamanhoVetorAtual];
    }

    @Override
    public void adicionarElemento(Double elemento) {
        if(Utils.temEspaco(array)){
            for(int i = 0; i < array.length; i++){
                if(array[i] == null){
                    array[i] = elemento;
                    break;
                }
            }
        }else{
            array = expandirVetor(array, 2.0);
            adicionarElemento(elemento);
        }
    }
}
