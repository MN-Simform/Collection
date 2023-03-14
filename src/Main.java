import java.util.*;

public class Main {
    public void arrayList(){
        System.out.println("-------- ArrayList --------");

        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("ArrayList : " +  al); //Empty List
        al.add(10);
        al.add(20);
        al.add(40);
        al.add(2,30); // Add Element At Specified Index
        System.out.println("ArrayList : " + al);

        ArrayList<Integer> al2= new ArrayList<>(); //Created 2nd ArrayList
        al2.add(50);
        al2.add(60);

        al.addAll(al2); //Add Collection of al2
        System.out.println("Add al2 Collection : " + al);

        al.remove(3); //Remove Element At Specified Index
        System.out.println("After Removing Element ar 3rd Index(40) : " + al);

        al.removeAll(al2); // Remove Collection
        System.out.println("Removed al2 Collection : " + al);

        System.out.print("Iterating Using Lambda : "); //Approach 1
        al.forEach((arrListVal) -> System.out.print(arrListVal + ", "));
        System.out.println();

        al.clear();
        System.out.println("Clearing ArrayList : " + al);
        System.out.println();

//        Approach 2 // Iterate Using Iterator
//        Iterator itr = al.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//
//        }
//        Approach 3 // Iterate Using For
//        for(int i : al){
//            System.out.println(i);
//        }
    }

    public void hashSet(){
        System.out.println("-------- HashSet --------");
        HashSet<String> hs = new HashSet<>();
        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");
        System.out.println("HashSet : " + hs);

        HashSet<String> hs2 = new HashSet<>();
        hs2.add("Five");
        hs2.add("Six");

        hs.addAll(hs2);
        System.out.println("Add hs2 Collection : " + hs);

        hs.remove("Four");
        System.out.println("Remove Four : " + hs);

        hs.removeAll(hs2);
        System.out.println("Remove hs2 Collection : " + hs);

        System.out.print("Iterate Using Lambda : ");
        hs.forEach((hashSetVal) ->System.out.print(hashSetVal + ", "));
        System.out.println();
    }

    public void hashMap(){
        System.out.println("-------- HashMap --------");
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Java");
        hm.put(2, "Python");
        hm.put(1, "Java"); //Duplicate Key & Value
        hm.put(2, "ASP.Net"); //Override Value of Key 2
        hm.put(3, "JavaScript");
        hm.put(4, "C Language");
        System.out.println("Adding Duplicate Key : " + hm);

        hm.putIfAbsent(5, "Go Lang"); //Check If The Key Is Exist Or Not. If Not It Will Add
        hm.putIfAbsent(5, "Ruby"); //Will Not Override // Already Exist
        System.out.println("Put If Absent : " + hm);

        System.out.print("Iterating HashMap :");
        for(Map.Entry m : hm.entrySet()){
            System.out.print(m + ", ");
        }
        System.out.println();
    }
    public void treeSet(){
        System.out.println("-------- TreeSet --------");
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(20);
        ts.add(30);
        ts.add(10);
        ts.add(50);
        ts.add(40);
        System.out.println("TreeSet :" + ts);

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts.add(5);
        ts.add(2);

        ts.addAll(ts2);
        System.out.println("Add ts2 Collection : " + ts);

        ts.remove(2);
        System.out.println("Remove Number '2' : " + ts);

        System.out.println("Descending Order : " + ts.descendingSet());

        System.out.print("Iterate TreeSet : ");
        ts.forEach((treeSetVal) -> System.out.print(treeSetVal + ", "));
        System.out.println();
    }

    public void treeMap(){
        System.out.println("-------- TreeMap --------");
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("One", 1);
        tm.put("Five", 5);
        tm.put("Ten", 10);
        tm.put("Twenty", 20);
        System.out.println("TreeMap : " + tm);

        tm.remove("Twenty");
        System.out.println("Remove Twenty : " + tm);

        System.out.println("Descending Order : " + tm.descendingMap());

        System.out.print("Iterate TreeMap : ");
        for(Map.Entry m:tm.entrySet()){
            System.out.print(m.getKey()+" "+m.getValue() + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Main main = new Main();

        main.arrayList();
        System.out.println();

        main.hashSet();
        System.out.println();

        main.hashMap();
        System.out.println();

        main.treeSet();
        System.out.println();

        main.treeMap();
        System.out.println();
    }
}