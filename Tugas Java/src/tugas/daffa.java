package tugas ;

import java.util.ArrayList;
import java.util.Arrays;

public class daffa {
    public static void main(String[] args) {
        String [] nama = {"a","b","d","i"};
        System.out.println("======================");
        System.out.println("karakter : " + Arrays.toString(nama));

        // 1. isEmpty()
        System.out.println("\nisEmpty() : \t" + nama[0].isEmpty()); 
        System.out.println("\t\t" + nama[1].isEmpty());
        System.out.println("\t\t" + nama[2].isEmpty());
        System.out.println("\t\t" + nama[3].isEmpty());

        // 2. size()
        System.out.println("\nsize() : " + nama.length);

        // 3. get()
        System.out.println("\nget()");
        System.out.println("get(0) : " + Arrays.asList(nama).get(0));
        System.out.println("get(2) : " + Arrays.asList(nama).get(2));
        // System.out.println("get(6) : " + Arrays.asList(nama).get(6));
        // System.out.println("get(-3) : " + Arrays.asList(nama).get(-3));

        // 4. indexOf()
        System.out.println("\nindexOf()");
        System.out.println("indexOf(a) : " + Arrays.asList(nama).indexOf("a"));
        System.out.println("indexOf(c) : " + Arrays.asList(nama).indexOf("c"));
        System.out.println("indexOf(q) : " + Arrays.asList(nama).indexOf("q"));

        // 5. remove()
        System.out.println("\nremove()");
        ArrayList<String> nama1 = new ArrayList<String>();
        nama1.add("a");
        nama1.add("b");
        nama1.add("d");
        nama1.add("i");
        System.out.println("karakter sebelum diremove : " + nama1);

        nama1.remove(0);
        //nama1.remove(3);
        nama1.remove(2);
        System.out.println("karakter setelah diremove : " +nama1);

        // 6. add()
        System.out.println("\nadd()");
        System.out.println("karakter sebelum diadd : " + nama1);
        nama1.add(0,"e");
        nama1.add(2,"f");
        nama1.add(3,"g");
        nama1.add(4,"h");
        nama1.add(6,"h");
        //nama1.add(-3, "j");
        System.out.println("karakter setelah diadd : " + nama1);
    }
}