package com.cnu.mentoring.vineet.cdp.collections.homeTask_1;

import org.apache.log4j.Logger;

import java.util.*;

public class CollectionsTasks {

    private static final Logger LOGGER = Logger.getLogger(CollectionsTasks.class);

    public void arrayListExample() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++)
            list.add(i);
        LOGGER.info("ArrayList - Order of insertion is maintained " + list);
        Collections.shuffle(list, new Random(3));
        LOGGER.info("ArrayList - Shuffled" + list);
        list.add(3240);
        LOGGER.info("ArrayList Add - All added elements are added to the end of the list by default" + list);
        list.remove(new Integer(324));
        LOGGER.info("ArrayList Remove - First matched element is removed from the list " + list);
        LOGGER.info("ArrayList Size - Gives the size of the list " + list.size());
        list.clear();
        LOGGER.info("ArrayList clear - Clears all the elements in the list " + list);
    }

    public void linkedListExample() {
        // LinkedList has more functions to manipulate a list as it implements both List and Queue interfaces.

        LinkedList<String> list = new LinkedList<>();
        for (int i = 1; i < 100; i++)
            list.add("" + i);
        LOGGER.info("LinkedList order of insertion is maintained " + list);
        list.addFirst("0");
        list.addLast("100");
        LOGGER.info("LinkedList provides additional method to add to starting or ending of the list " + list);
        LOGGER.info("LinkedList provides methods to get first and last elements of the list, the first element is " + list.getFirst() +
                " and the last element is " + list.getLast());
        LOGGER.info("LinkedList offer methods return true or false based on the status of addition of elements to the list " + list.offerLast("101"));
        LOGGER.info("LinkedList peek gives first element of list " + list.peek());
        LOGGER.info("LinkedList pop gives the first element of the list and removes it from the list " + list.pop());
        LOGGER.info("LinkedList poll gives us the first element of the list " + list.poll());
        LOGGER.info("LinkedList removeFirstOccurrence removes the first occurrence of the element in the list " + list.removeFirstOccurrence("0") +
                " and similarly removeLastOccurrence removes the last occurrence of the element in the list " + list.removeLastOccurrence("100"));
        LOGGER.info(list);
    }

    public void hashmapExample() {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 97; i <= 122; i++)
            map.put((char) i, i - 96);
        LOGGER.info("The order of insertion is not maintained for hashmap " + map);
        LOGGER.info("To view all the mappings in the map " + map.entrySet());
        LOGGER.info("To view all the keys in the map " + map.keySet());
        LOGGER.info("To check if the map contains key " + map.containsKey('a'));
        LOGGER.info("To check if the map contains value " + map.containsValue(2));
        LOGGER.info("To get a value with its key " + map.get('a'));
        LOGGER.info("To set a value for a key " + map.put('a', 100));
    }

    public void linkedHashMapExample() {
        /* LinkedHashMap extends Hashmap and the additional functionality provided by LinkedHashMap is it maintains order
        of insertion and provides a LRU cache for it's entries */

        int MAX_NUMBER_OF_ENTRIES = 6;

        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<Character, Integer>() {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > MAX_NUMBER_OF_ENTRIES;
            }
        };
        for (int i = 97; i <= 122; i++)
            linkedHashMap.put((char) i, i - 96);
        LOGGER.info("LinkedHashMap has similar methods to HashMap");
        LOGGER.info("LinkedHashMap " + linkedHashMap);
    }

    public void hashSetExample() {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            hashSet.add(i);
            hashSet.add(i);
        }
        LOGGER.info("HashSet only contains unique elements " + hashSet);
        LOGGER.info("HashSet contains element 1 " + hashSet.contains(1));
        LOGGER.info("HashSet remove element 1 " + hashSet.remove(1));
        LOGGER.info("HashSet after removing " + hashSet);
    }

    public void linkedHashSetExample() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for(int i=0 ;i<20;i++)
            linkedHashSet.add(""+i);
        LOGGER.info("Order of insertion is maintained for LinkedHashSet " + linkedHashSet);
        LOGGER.info("All other methods are similar to HashSet");
    }

    public void treeSetExample() {

    }
}
