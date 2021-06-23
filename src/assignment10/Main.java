package assignment10;

public class Main {
    public static void main(String[] args) {
        SList<Integer> list=new SList<>();
        SListIterator<Integer> sListIterator=list.iterator();
        System.out.println(list);
        sListIterator.insert(1);
        sListIterator.insert(2);
        sListIterator.insert(3);
        sListIterator.insert(4);
        System.out.println(list);
        sListIterator=list.iterator();
        sListIterator.remove(2);
        System.out.println(list);
    }
}
