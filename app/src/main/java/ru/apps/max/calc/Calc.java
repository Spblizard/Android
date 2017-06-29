/**
 * Created by max on 08.03.17.
 */

public class Calc {
    boolean bl;


    public boolean Check(String str1,String str2){
        if(str1.equals("") || str2.equals(""))
            bl = false;
        else
            bl = true;
        return bl;

    }
}
