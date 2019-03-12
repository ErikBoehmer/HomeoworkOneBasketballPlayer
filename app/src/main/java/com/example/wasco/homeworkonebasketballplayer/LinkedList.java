package com.example.wasco.homeworkonebasketballplayer;

public class LinkedList
{
    private Node head;
    private Node tail;
    private int count;
    private int currNode;
    private int prevNode;


    public LinkedList()
    {
        this.head = null;
        this.count = 0;
    }
    public int removeEnd()
    {
        Node n = new Node();
        if(this.head == null)
        {
            this.head = n;
            this.tail = n;
        }
        else
        {
            tail.setNextNode(null);
            tail = n;

        }
        count--;
    }
    public int removeAtIndex()
    {
        while (int i = 0; i < index; i++)
        {

            prevNode = currNode;
            this.tail.getNextNode();

        }
    }

    public int removeFront()
    {
        Node currNode = this.head;
        this.head = this.head.getNextNode();
        currNode.setNextNode(null);
        this.count --;
        return currNode.getPayload();
    }
    public int getAtIndex(int index)
    {
        Node currNode = this.head;
        for(int i = 0; i < index; i++)
        {
            currNode = currNode.getNextNode();
        }
        return currNode.getPayload();
    }
    public void addAtIndex(int value, int index)
    {
        if(index ==0)
        {
            this.addFront(value);
        }
        else if(this.count == index)
        {
            this.addEnd(value);
        }
        else
        {
            Node currNode = this.head;
            for(int i = 0; i < index - 1; i++)
            {
                currNode = currNode.getNextNode();
            }
            Node n = new Node(value);
            n.setNextNode(currNode.getNextNode());
            currNode.setNextNode(n);
            this.count++;
        }
    }
    public void addEnd(int value)
    {
     Node n = new Node(value);
     if(this.head == null)
     {
         this.head = n;
         this.tail = n;
     }
     else
     {
         tail.setNextNode(n);
         tail = n;

     }
     count++;
    }

    public void addFront(int value)
    {
        Node n = new Node(value);
        if(this.head == null)
        {
            this.head = n;
            this.tail = n;
        }
        else
        {
            n.setNextNode(head);
            head = n;
        }
        count++;
    }

    public void display()
    {
        String answer = "******* ";
        Node currNode = head;
        for(int i = 0; i < this.count; i++)
        {
            answer = answer + currNode.getPayload() + " -> ";
            currNode = currNode.getNextNode();
        }
        System.out.println(answer);
    }
}