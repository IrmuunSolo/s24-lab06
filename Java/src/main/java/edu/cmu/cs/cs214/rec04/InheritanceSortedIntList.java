package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{
    
    private int totalAdded;

    public InheritanceSortedIntList() {
        super();
        this.totalAdded = 0;
    }

     /**
     * @return жагсаалт өөрчлөгдсөн бол true буцаана
     */
    public boolean add(int num) {
        boolean result = super.add(num);
            totalAdded++;

        return result;
    }


    public boolean addAll(IntegerList list) {
        boolean changed = false;
        for (int i = 0; i < list.size(); i++) {
            changed = add(list.get(i));
        }
        return changed;
    }

    public int getTotalAdded() {
        return totalAdded;
    }

}