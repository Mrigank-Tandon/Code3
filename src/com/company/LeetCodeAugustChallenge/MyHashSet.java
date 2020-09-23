package com.company.LeetCodeAugustChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

class MyHashSet {
    class MapUsingAl<K> {

        ArrayList<LinkedList<Entity>> entities = new ArrayList<>();

        public MapUsingAl() {

            for (int i = 0; i <10 ; i++) {

                entities.add(new LinkedList<>());
            }
        }

        public void add(K key){

            int index = Math.abs(key.hashCode()%entities.size());

            LinkedList<Entity> list = entities.get(index);

            for (Entity entity: list) {

                if(entity.key.equals(key)){

                    entity.key = key;
                    return;
                }
            }

            list.add(new Entity(key));
        }

        public boolean contains(K key){

            int index = Math.abs(key.hashCode()%entities.size());

            LinkedList<Entity> list = entities.get(index);

            for (Entity entity: list) {

                if(entity.key.equals(key)){

                    return true;
                }
            }

            return false;
        }


        public K remove(K key){


            int index = Math.abs(key.hashCode()%entities.size());

            LinkedList<Entity> list = entities.get(index);

            Entity target = null;

            for (Entity entity: list) {

                if(entity.key.equals(key)){

                    target = entity;
                    break;
                }
            }

            K temp = target.key;
            list.remove(target);

            return temp;
        }

        class Entity{

            K key;


            public Entity(K key) {
                this.key = key;

            }
        }
    }


    /** Initialize your data structure here. */
    public MyHashSet() {

    }
    MapUsingAl<Integer> map = new MapUsingAl<>();
    public void add(int key) {
        map.add(key);
    }

    public void remove(int key) {
        map.remove(key);
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return map.contains(key);
    }
}
//public class DesignHashSet_705 {
//
//    Node root = new Node();
//
//    public void add(int key) {
//        Node current = root;
//        do {
//            int rem = key % 10;
//            key /= 10;
//            if (current.digits[rem] == null) current.digits[rem] = new Node();
//            current = current.digits[rem];
//        } while (key > 0);
//        current.isNumber = true;
//    }
//
//    public void remove(int key) {
//        Node current = root;
//        do {
//            current = current.digits[key % 10];
//            key /= 10;
//            if (current == null) return;
//        } while (key > 0);
//        current.isNumber = false;
//    }
//
//    public boolean contains(int key) {
//        Node current = root;
//        do {
//            current = current.digits[key % 10];
//            key /= 10;
//        } while (current != null && key > 0);
//        return current != null && current.isNumber;
//    }
//
//
//    static class Node {
//        Node[] digits = new Node[10];
//        boolean isNumber = false;
//    }
//}
//boolean[] a;
//    /** Initialize your data structure here. */
//    public MyHashSet() {
//        a = new boolean[1000001];
//    }
//
//    public void add(int key) {
//        a[key] = true;
//    }
//
//    public void remove(int key) {
//        a[key] = false;
//    }
//
//    /** Returns true if this set contains the specified element */
//    public boolean contains(int key) {
//        return a[key];
//    }


/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
