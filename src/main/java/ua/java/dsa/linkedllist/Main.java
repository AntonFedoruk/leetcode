package ua.java.dsa.linkedllist;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        SingleLinkList<Contact> contactList = new SingleLinkList<>();
        contactList.addToEnd(new Contact(123, "Qwerty", "+1237894563"));
        contactList.addToEnd(new Contact(433, "Hanchik", "+6339874302"));
        contactList.addToEnd(new Contact(412, "Konsasa", "+9888356112"));
        contactList.addToEnd(new Contact(328, "Kolosha", "+3132456612"));
        contactList.addToEnd(new Contact(121, "Moh", "+6662228834"));
        contactList.addToEnd(new Contact(563, "Fosha", "+1230984756"));

        for (Contact contact : contactList) {
            System.out.println(contact);
        }

        contactList.reverse();

        System.out.println("_______________");

        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }



    static class Contact{
        int id;
        String name, phone;

        public Contact(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }

    public static class SingleLinkList<T> implements Iterable<T> {
        ListItem<T> head, tail;

        @Override
        public Iterator<T> iterator() {
            return new Iterator<T>() {
                ListItem<T> current = head;
                @Override
                public boolean hasNext() {
                    return current != null;
                }

                @Override
                public T next() {
                    T data = current.data;
                    current = current.nextItem;
                    return data;
                }
            };
        }

        private static class ListItem<T> {
            T data;
            ListItem<T> nextItem;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void addToEnd(T item) {
            ListItem<T> newItem = new ListItem<>();
            newItem.data = item;
            if (isEmpty()) {
                head = newItem;
                tail = newItem;
            } else {
                tail.nextItem = newItem;
                tail = newItem;
            }
        }

        public void reverse() {
            if (!isEmpty() && head.nextItem != null) {
                //(1st pointer) head is prev el at this point
                tail = head; // tail should be pointed at head
                ListItem<T> currentItem = head.nextItem; //(2nd pointer)next el after head become the currentItem
                head.nextItem = null;//this el will be the las el in the list(TAIL)
                while (currentItem != null) {
                    ListItem<T> nextItem = currentItem.nextItem; //(3rd pointer)
                    currentItem.nextItem = head; //we replace 2nd(currentItem) with 1st(prev)
                    head = currentItem; // move forward
                    currentItem = nextItem;
                }
            }
        }
    }
}