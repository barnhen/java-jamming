package com.barnabot;

import java.util.HashMap;

/**
 * Created by hbarnabe on 30/08/2016.
 */
public class LruCache {
    int capacity;
    HashMap<Integer, Node> Map = new HashMap<Integer, Node>();
    Node Head = null;
    Node end = null;

    public LruCache(int capacity)
    {
        this.capacity = capacity;
    }

    public int Get(int key)
    {
        if(Map.containsKey(key))
        {
            Node n = Map.get(key);
            Remove(n);
            SetHead(n);
            return n.value;

        }
        return -1;
    }

    public void Remove(Node n)
    {

    }

    public void SetHead(Node n)
    {

    }

    public void Set(int key, int value)
    {

    }
}
