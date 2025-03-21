package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

 public class DelegationSortedIntList implements IntegerList {

    private SortedIntList sortedList;
    private int totalAdded;

    public DelegationSortedIntList() {
        this.sortedList = new SortedIntList();
        this.totalAdded = 0;
    }


    public boolean add(int num) {
        boolean result = sortedList.add(num);
        if (result) {
            totalAdded++;
        }
        return result;
    }

  
    public boolean addAll(IntegerList list) {
        boolean modified = false;
        for (int i = 0; i < list.size(); i++) {
            modified |= add(list.get(i));
        }
        return modified;
    }


    public int get(int index) {
        return sortedList.get(index);
    }


    public boolean remove(int num) {
        return sortedList.remove(num);
    }


    public boolean removeAll(IntegerList list) {
        return sortedList.removeAll(list);
    }


    public int size() {
        return sortedList.size();
    }


    public int getTotalAdded() {
        return totalAdded;
    }
}