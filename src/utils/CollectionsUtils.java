package utils;

import java.util.List;

import static javax.swing.text.StyleConstants.Size;

/**
 * Created by Svecias on 6/9/2017.
 */
public class CollectionsUtils {
    public static <T> T getFirstelement(List<T> list) {

        return list.get(0);                 //pirma elementa gaunam, o paskutiniam "size -1"


    }


    public static <T> T getLastElement(List<T> list) {

        return list.get(list.size() - 1);                 //pirma elementa gaunam, o paskutiniam "size -1"


    }
}





