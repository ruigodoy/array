package com.rui;

import util.Utils;

public class ArrayLimitado extends MeuArray {

    public ArrayLimitado() {
        this.tamanhoVetorAtual = 5;
        array = new Double[tamanhoVetorAtual];
    }

    @Override
    public void adicionarElemento(Double elementos) {

        if(Utils.temEspaco(array)){
            for(int i = 0; i < array.length; i++){
                if(array[i] == null){
                    array[i] = elementos;
                    break;
                }
            }
        }else{
            System.out.println("Valor ultrapassado!");
        }
    }
}
