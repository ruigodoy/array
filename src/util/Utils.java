package util;

public class Utils {

    public static Boolean temEspaco(Double[] array){

        for(int i = 0; i < array.length ; i++){
            if(array[i] == null ) {
                return true;
            }
        }
        return false;
    }
}
