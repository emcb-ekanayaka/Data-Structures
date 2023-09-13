package com.demo;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkList {
    public static void main(String[] args) {

        /** LinkList By Using ListIterator */

        LinkedList<People> linkedList = new LinkedList<>();
        linkedList.add(new People("alex",25));
        linkedList.add(new People("joe",28));
        linkedList.add(2,new People("gale",38));

        ListIterator<People> peopleListIterator = linkedList.listIterator();
        while (peopleListIterator.hasNext()){
            System.out.println(peopleListIterator.next());
        }

        System.out.println();
        while (peopleListIterator.hasPrevious()){
            System.out.println(peopleListIterator.previous());
        }

        /* --------- traditional way -------------- */

        /** Adding a node at the front of the list*/
        /*      public void push(int new_data)
                {
                    Node new_Node = new Node(new_data);

                    new_Node.next = head;
                    new_Node.prev = null;

                    if (head != null)
                        head.prev = new_Node;
                    head = new_Node;
                }*/

        /** Add a node in between two nodes */
        /* public void InsertAfter(Node prev_Node, int new_data)
        {

            if (prev_Node == null) {
                System.out.println(
                        "The given previous node cannot be NULL ");
                return;
            }

            Node new_node = new Node(new_data);
            new_node.next = prev_Node.next;
            prev_Node.next = new_node;
            new_node.prev = prev_Node;
            if (new_node.next != null)
                new_node.next.prev = new_node;
        }*/

        /**Add a node before a given node in a Doubly Linked List*/
        /* public void InsertBefore(Node next_Node, int new_data)
        {
            if (next_Node == null) {
                System.out.println(
                        "The given next node cannot be NULL ");
                return;
            }

            Node new_node = new Node(new_data);
            new_node.prev = next_Node.prev;
            next_Node.prev = new_node;
            new_node.next = next_Node;
            if (new_node.prev != null)
                new_node.prev.next = new_node;
            else
                head = new_node;
        }*/

        /**Add a node at the end in a Doubly Linked List */
        /*void append(int new_data)
        {
            Node new_node = new Node(new_data);
            Node last = head;
            new_node.next = null;

            if (head == null) {
                new_node.prev = null;
                head = new_node;
                return;
            }
            while (last.next != null)
                last = last.next;

            last.next = new_node;

            new_node.prev = last;
        }*/
    }

    static record People(String name, int age){}
}
