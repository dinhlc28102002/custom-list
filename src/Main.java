public class Main {
    public static void main(String[] args) {
        MyStack<String> testStack = new MyStack<>();
        MyQueue<String> testQueue = new MyQueue<>();

        String[] arrr = {"Moi23", "Moi432", "Moi555"};

        testStack.add("Moi");
        testStack.add("Moi1");
        testStack.add("Moi2");
        testStack.add("Moi3");

        testStack.addAll(arrr);
        testStack.put("index");
        testStack.printAll();


        System.out.println(testStack.size());
        testStack.pop();

        testStack.printAll();
        System.out.println("-------------------------------------------------------------------");


        testQueue.add("Moi");
        testQueue.add("Moi1");
        testQueue.add("Moi2");
        testQueue.add("Moi3");

        testQueue.addAll(arrr);
        testQueue.put("index");
        testQueue.printAll();
//
//        testQueue.pop(2);
//
//        System.out.println(testQueue.size());
    }
}