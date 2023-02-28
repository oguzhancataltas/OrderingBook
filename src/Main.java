import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> treeSet = new TreeSet<>();

        treeSet.add(new Book("Kürk Mantolu Madonna", 160, "Sabahattin Ali", "1998"));
        treeSet.add(new Book("The Little Prens", 96, "Antoine de Saint-Exupery", "2015"));
        treeSet.add(new Book("1984", 352, "George Orwell", "2000"));
        treeSet.add(new Book("Kırmızı Pazartesi", 160, "Gabriel Garcia Marquez", "2000"));
        treeSet.add(new Book("Yabancı", 112, "Albert Camus", "1996"));

        Iterator<Book> itr = treeSet.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next().getBookName());
        }
        System.out.println("**********************************");

        TreeSet<Book> treeSet1 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()- o2.getPageNumber();
            }
        });

        treeSet1.add(new Book("Kürk Mantolu Madonna", 160, "Sabahattin Ali", "1998"));
        treeSet1.add(new Book("The Little Prens", 96, "Antoine de Saint-Exupery", "2015"));
        treeSet1.add(new Book("1984", 352, "George Orwell", "2000"));
        treeSet1.add(new Book("Kırmızı Pazartesi", 120, "Gabriel Garcia Marquez", "2000"));
        treeSet1.add(new Book("Yabancı", 112, "Albert Camus", "1996"));

        Iterator<Book> itr1 = treeSet1.iterator();

        while (itr1.hasNext()){
            System.out.println(itr1.next().getPageNumber());
        }
    }
}
