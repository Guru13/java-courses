package by.guru13.lessons.collections.linkedList;

/**
 * Created by ASUS on 20.07.2015.
 */
public class SimpleLinkedListRunner {
    public static void main(String[] args) {
        System.err.println("test all add methods");
        System.out.println();
        SimpleLinkedList<String> sll = new SimpleLinkedList();
        sll.addFirst("test 1");
        sll.addFirst("test 2");
        sll.addFirst("test 3");
        sll.addFirst("test 4");
        System.out.print(sll.getSize() + "{ ");
        for (String str : sll){
            System.out.print(str + " ");
        }
        System.out.println(" }");


        String mark = new String("mark");
        sll.addLast(mark);
        sll.addLast("test 0");
        System.out.print(sll.getSize() + "{ ");
        for (String str : sll){
            System.out.print(str + " ");
        }
        System.out.println(" }");


        String middle = new String("middle");
        sll.addAfter(middle, mark);
        System.out.print(sll.getSize() + "{ ");
        for (String str : sll){
            System.out.print(str + " ");
        }
        System.out.println(" }");

        sll.addAfter("middle(-1)", mark);
        System.out.print(sll.getSize() + "{ ");
        for (String str : sll){
            System.out.print(str + " ");
        }
        System.out.println(" }");

        System.out.println();
        System.err.println("test addAfter, list size = 1");
        System.out.println();

        sll = new SimpleLinkedList();
        sll.addLast(mark);
        System.out.print(sll.getSize() + "{ ");
        for (String str : sll){
            System.out.print(str + " ");
        }
        System.out.println(" }");

        sll.addAfter("last", mark);
        System.out.print(sll.getSize() + "{ ");
        for (String str : sll){
            System.out.print(str + " ");
        }
        System.out.println(" }");

//        System.out.println();
//        System.err.println("test addAfter, no prev element exception");
//        System.out.println();
//
//        sll = new SimpleLinkedList();
//        sll.addLast("test");
//        System.out.print(sll.getSize() + "{ ");
//        for (String str : sll){
//            System.out.print(str + " ");
//        }
//        System.out.println(" }");
//
//        sll.addAfter("last", mark);
//        System.out.print(sll.getSize() + "{ ");
//        for (String str : sll){
//            System.out.print(str + " ");
//        }
//        System.out.println(" }");
    }
}
