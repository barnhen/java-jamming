package com.barnabot;

import java.util.HashMap;

/**
 * Created by hbarnabe on 02/08/2016.
 */
public class LruCache {
    int capacity;
    HashMap<Integer, Node> Map = new HashMap<Integer, Node>();
    Node Head = null;
    Node End = null;

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
        if(null != n.pre)
        {
            n.pre.next = n.next;
        }
        else{
            Head = n.next;
        }

        if(null != n.next)
        {
            n.next.pre = n.pre;
        }
        else{
            End = n.pre;
        }
    }


    public void SetHead(Node n)
    {
        n.next = Head;
        n.pre = null;

        if(null != Head)
        {
            Head.pre = n;
        }

        Head = n;

        if(null != End){
            End = Head;
        }
    }

    public void Set(int key, int value)
    {
        if(Map.containsKey(key))
        {
            Node old = Map.get(key);
            old.value = value;
            Remove(old);
            SetHead(old);
        }
        else{
            Node created = new Node(key, value);
            if(Map.size() >= capacity){
                Map.remove(End.key);
                Remove(End);
                SetHead(created);
            }
            else{
                SetHead(created);
            }

            Map.put(key, created);
        }
    }
}
