package com.barnabot;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("HIsasasas");

        LruCache lru = new LruCache(5);
        lru.Set(1, 100);
        lru.Set(2, 200);
        lru.Set(3, 300);
        lru.Set(4, 400);
        lru.Set(5, 500);
        lru.Set(6, 600);
        lru.Set(7, 700);
        System.out.println("lru 1: " + lru.Get(1));
        System.out.println("lru 2: " + lru.Get(2));
        System.out.println("lru 3: " + lru.Get(3));
        System.out.println("lru 4: " + lru.Get(4));
        System.out.println("lru 5: " + lru.Get(5));
    }
}
