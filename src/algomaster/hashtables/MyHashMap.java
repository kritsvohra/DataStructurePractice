package algomaster.hashtables;

import java.util.HashMap;

public class MyHashMap {

    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    public MyHashMap(){

    }

    public void put(int key, int value){
        hashMap.put(key, value);
    }

    public int get(int key){
        return hashMap.getOrDefault(key, -1);
    }

    public void remove(int key){
        hashMap.remove(key);
    }

    public static void main(String[] args) {

        MyHashMap obj = new MyHashMap();
        obj.put(1, 1);
        obj.put(2, 2);
        obj.get(1);
        obj.get(3);
        obj.put(2, 1);
        obj.get(2);
        obj.remove(2);
        obj.get(2);

    }
}
