package Interface;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Integer> st = new ArrayList<>();
        st.add(80);
        st.add(20);
        st.add(30);

        display(st);



        // Make a call to display method as per question requirements here

    }
    public static void display(Iterable<Integer> st){
        Iterator it = st.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    // Write the display method as per requirements of question here

}