package mapdemo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Comparable com;
        Runnable r;
        Comparator com1;

        HashMap<Integer, String> hm = new HashMap();
        hm.put(600069, "Chennai");
        hm.put(637001, "Namakkal");
        hm.put(638012, "Erode");
        hm.put(456786,"Mumbai");
//        System.out.println(hm.entrySet());
//        System.out.println(hm.keySet());
//        System.out.println(hm.values());
        Iterator<Map.Entry<Integer,String>> entry=hm.entrySet().iterator();
        while (entry.hasNext()){
            Map.Entry<Integer,String> en = entry.next();
            System.out.println(en.getKey());
            System.out.println(en.getValue());
        }
        for(Map.Entry<Integer,String> e:hm.entrySet()){
            System.out.println(e.getKey()+"\n "+e.getValue());
        }
        System.out.println("***********************");
        Iterator<Integer> itr=hm.keySet().iterator();
        while(itr.hasNext()){
            Integer key = itr.next();
            System.out.println(key +" "+hm.get(key));
        }
        for(Integer k:hm.keySet()){
            System.out.println(k+" "+hm.get(k));
        }
    }
}
