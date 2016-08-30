package com.barnabot;

/**
 * Created by hbarnabe on 30/08/2016.
 */
public class Node {
    int key;
    int value;
    Node pre;
    Node next;

    public Node(int key, int value)
    {
        this.key = key;
        this.value = value;
    }
}
