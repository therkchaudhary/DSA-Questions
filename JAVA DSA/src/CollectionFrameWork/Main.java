package CollectionFrameWork;

import java.util.*;

public class Main {
    static void main(String[] args) {
//        //List or collection -> interface
//
//        //ArrayList -> concrete class
//        ArrayList<Integer> list = new ArrayList<>();
//
//        //add
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list);
//        list.add(40);
//        System.out.println(list);
//
//        //--------------------------------------------------------------
//
//        //remove
//        list.remove(0);
//        System.out.println(list);
//
//        //--------------------------------------------------------------
//
//        //addAll
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(101);
//        list2.add(102);
//        list2.add(20);
//
//        list.addAll(list2);
//        System.out.println(list);
//
//        //--------------------------------------------------------------
//
//        //removeAll
//        list.removeAll(list2);
//        System.out.println(list);
//
//        System.out.println(list.size());
//
//        System.out.println("printing list2: " + list2);
//        list2.clear();
//        System.out.println(list2.size());
//
//        //---------------------------------------------------------------
//
//        //i want to traverse list using iterator
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println("Element: " + iterator.next());
//        }
//
//        //---------------------------------------------------------
//        List<Integer> list3 = new ArrayList<>();
//        list3.add(11);
//        list3.add(12);
//        list3.add(14);
//        System.out.println(list3.get(0));
//        System.out.println(list3.get(1));
//        System.out.println(list3.get(2));
//
//        System.out.println("before set: " + list3);
//        list3.set(0,100);
//        System.out.println("after set: " + list3);
//
//        //------------------------------------------------------------
//
////        Collection<Integer> collection = new ArrayList<>();
//
//
//        //toArray
//        Object[] arr = list3.toArray();
//        for(Object obj: arr){
//            System.out.println(obj);
//        }
//
//
//        //contains
//        System.out.println(list3.contains((1000)));
//
//        list.add(6);
//        list.add(12);
//        System.out.println("Printing Entire List: " + list);
//
//        //sort an arrayList
//        Collections.sort(list);
//        System.out.println("Printing Entire List: " + list);
//
//        //HW -> how can we sort in descending order
//
//        ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
//        System.out.println("Printing Entire newList: " + newList);
//
//        ArrayList<Integer> marks = new ArrayList<>();
//        marks.ensureCapacity(100);
//
//        System.out.println(marks.isEmpty());
//        System.out.println(newList.indexOf(40));


        //**********************************************************
//                               Linkedlist
        //**********************************************************

//        List<Integer> list = new LinkedList<>();
//
//        //add
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list);
//        list.add(40);
//        System.out.println(list);
//
//        //--------------------------------------------------------------
//
//        //remove
//        list.remove(0);
//        System.out.println(list);
//
//        //--------------------------------------------------------------
//
//        //addAll
//        List<Integer> list2 = new LinkedList<>();
//        list2.add(101);
//        list2.add(102);
//        list2.add(20);
//
//        list.addAll(list2);
//        System.out.println(list);
//
//        //--------------------------------------------------------------
//
//        //removeAll
//        list.removeAll(list2);
//        System.out.println(list);
//
//        System.out.println(list.size());
//
//        System.out.println("printing list2: " + list2);
//        list2.clear();
//        System.out.println(list2.size());
//
//        //---------------------------------------------------------------
//
//        //i want to traverse list using iterator
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println("Element: " + iterator.next());
//        }
//
//        //---------------------------------------------------------
//
//        List<Integer> list3 = new LinkedList<>();
//        list3.add(11);
//        list3.add(12);
//        list3.add(14);
//        System.out.println(list3.get(0));
//        System.out.println(list3.get(1));
//        System.out.println(list3.get(2));
//
//        System.out.println("before set: " + list3);
//        list3.set(0,100);
//        System.out.println("after set: " + list3);
//
//        //------------------------------------------------------------
//
////        Collection<Integer> collection = new ArrayList<>();
//
//
//        //toArray
//        Object[] arr = list3.toArray();
//        for(Object obj: arr){
//            System.out.println(obj);
//        }
//
//
//        //contains
//        System.out.println(list3.contains((1000)));
//
//        list.add(6);
//        list.add(12);
//        System.out.println("Printing Entire List: " + list);
//
//        //sort an arrayList
//        Collections.sort(list);
//        System.out.println("Printing Entire List: " + list);
//
//        //HW -> how can we sort in descending order
//
////        LinkedList<Integer> newList = (LinkedList<Integer>)list.clone();
////        System.out.println("Printing Entire newList: " + newList);
//
//        ArrayList<Integer> marks = new ArrayList<>();
//        marks.ensureCapacity(100);
//
//        System.out.println(marks.isEmpty());
//        list.add(30);
//        list.add(24);
//        list.add(30);
//        System.out.println("Printing original list: " + list);
//        System.out.println(list.lastIndexOf(30));
////        System.out.println(list.indexOf(40));
//
//        //addFirst and addLast
//        list.remove(3);
//        list.remove(3);
//        list.remove(3);
//        list.remove(3);
//        System.out.println("Printing original list: " + list);
//        list.addFirst(101);
//        System.out.println("Printing original list: " + list);
//        list.addLast(102);
//        System.out.println("Printing original list: " + list);

        //***********************************************************
        //                       Stack
        //***********************************************************
//        List<Integer> list = new Stack<>();
//
//        //add
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list);
//        list.add(40);
//        System.out.println(list);
//
//        //--------------------------------------------------------------
//
//        //remove
//        list.remove(0);
//        System.out.println(list);
//
//        //--------------------------------------------------------------
//
//        //addAll
//        List<Integer> list2 = new Stack<>();
//        list2.add(101);
//        list2.add(102);
//        list2.add(20);
//
//        list.addAll(list2);
//        System.out.println(list);
//
//        //--------------------------------------------------------------
//
//        //removeAll
//        list.removeAll(list2);
//        System.out.println(list);
//
//        System.out.println(list.size());
//
//        System.out.println("printing list2: " + list2);
//        list2.clear();
//        System.out.println(list2.size());
//
//        //---------------------------------------------------------------
//
//        //i want to traverse list using iterator
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println("Element: " + iterator.next());
//        }
//
//        //---------------------------------------------------------
//
//        List<Integer> list3 = new Stack<>();
//        list3.add(11);
//        list3.add(12);
//        list3.add(14);
//        System.out.println(list3.get(0));
//        System.out.println(list3.get(1));
//        System.out.println(list3.get(2));
//
//        System.out.println("before set: " + list3);
//        list3.set(0,100);
//        System.out.println("after set: " + list3);
//
//        //------------------------------------------------------------
//
////        Collection<Integer> collection = new ArrayList<>();
//
//
//        //toArray
//        Object[] arr = list3.toArray();
//        for(Object obj: arr){
//            System.out.println(obj);
//        }
//
//
//        //contains
//        System.out.println(list3.contains((1000)));
//
//        list.add(6);
//        list.add(12);
//        System.out.println("Printing Entire List: " + list);
//
//        //sort an arrayList
//        System.out.println("Sorting ");
//        Collections.sort(list);
//        System.out.println("Printing Entire List: " + list);
//
//        //HW -> how can we sort in descending order
//
////        LinkedList<Integer> newList = (LinkedList<Integer>)list.clone();
////        System.out.println("Printing Entire newList: " + newList);
//
//        ArrayList<Integer> marks = new ArrayList<>();
//        marks.ensureCapacity(100);
//
//        System.out.println(marks.isEmpty());
//        list.add(30);
//        list.add(24);
//        list.add(30);
//        System.out.println("Printing original list: " + list);
//        System.out.println(list.lastIndexOf(30));
////        System.out.println(list.indexOf(40));
//
//        //addFirst and addLast
//        list.remove(3);
//        list.remove(3);
//        list.remove(3);
//        list.remove(3);
//        System.out.println("Printing original list: " + list);
//        list.addFirst(101);
//        System.out.println("Printing original list: " + list);
//        list.addLast(102);
//        System.out.println("Printing original list: " + list);

        //=======================Stack===========================

        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st);

        st.push(11);
        System.out.println(st);

        st.push(12);
        System.out.println(st);

        st.pop();
        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st.search(12));

        System.out.println(st.empty());
    }
}


