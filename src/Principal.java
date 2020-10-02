import com.rui.ArrayDobroTamanho;
import com.rui.ArrayLimitado;
import com.rui.ArrayMetadeTamanho;



public class Principal {
    public static void main(String[] args){

        //Ao adicionar um elemento e já estiver no limite, o array deverá dobrar de tamanho
        ArrayDobroTamanho arrayDobroTamanho = new ArrayDobroTamanho();

        arrayDobroTamanho.adicionarElemento(1.0);
        arrayDobroTamanho.adicionarElemento(2.0);
        arrayDobroTamanho.adicionarElemento(3.0);
        arrayDobroTamanho.adicionarElemento(4.0);
        arrayDobroTamanho.adicionarElemento(5.0);


        arrayDobroTamanho.imprimeElementos();

        arrayDobroTamanho.removerElemento(1.0);
        System.out.println(arrayDobroTamanho.recuperarElemento(2));

        System.out.println("-------------------------------------------------------------------");

        //Ao adicionar um elemento e já estiver no limite, o array deverá aumentar em 50%
        ArrayMetadeTamanho arrayMetadeTamanho = new ArrayMetadeTamanho();

        arrayMetadeTamanho.adicionarElemento(1.0);
        arrayMetadeTamanho.adicionarElemento(2.0);
        arrayMetadeTamanho.adicionarElemento(3.0);
        arrayMetadeTamanho.adicionarElemento(4.0);
        arrayMetadeTamanho.adicionarElemento(5.0);

        arrayMetadeTamanho.imprimeElementos();

        arrayMetadeTamanho.removerElemento(5.0);
        System.out.println(arrayMetadeTamanho.recuperarElemento(3));

        System.out.println("-------------------------------------------------------------------");

        //Ao adicionar um elemento e já estiver no limite, o array não deverá permitir
        ArrayLimitado arrayLimitado = new ArrayLimitado();

        arrayLimitado.adicionarElemento(1.0);
        arrayLimitado.adicionarElemento(2.0);
        arrayLimitado.adicionarElemento(3.0);
        arrayLimitado.adicionarElemento(4.0);
        arrayLimitado.adicionarElemento(5.0);
        arrayLimitado.adicionarElemento(5.0);

        arrayLimitado.imprimeElementos();

        arrayMetadeTamanho.removerElemento(2.0);
        System.out.println(arrayMetadeTamanho.recuperarElemento(3));

    }
}
