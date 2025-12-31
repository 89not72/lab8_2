import java.util.LinkedList;

/**
 * 繼承 JCF 中的 LinkedList 來實作 Queue
 * Queue 的特性是先進先出 (FIFO)
 */
public class MyQueue<T> extends LinkedList<T> {

    public MyQueue() {
        super();
    }

    // 入列 (Enqueue)：加到隊伍最後面
    // LinkedList 的 addLast() 符合此需求
    public void enqueue(T item) {
        this.addLast(item);
    }

    // 出列 (Dequeue)：從隊伍最前面移除並回傳
    // LinkedList 的 removeFirst() 符合此需求
    public T dequeue() {
        return this.removeFirst();
    }

    // 判斷佇列是否為空
    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    // 取得佇列大小
    @Override
    public int size() {
        return super.size();
    }
}

// --- Person 類別寫在這裡 (MyQueue 的大括號之外) ---
// 這是為了配合 QueueTest.java 的測試需求
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}