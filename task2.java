import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    static void enqueue(Queue<Integer> list, int element) {
        list.add(element);
    }

    static int dequeue(Queue<Integer> list) {
        return list.poll();
    }

    static int first(Queue<Integer> list) {
        return list.peek();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в очереди: ");
        int amount = Integer.parseInt(iScanner.nextLine());
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            queue.add(random.nextInt(100));
        }
        System.out.println("Полученная очередь: ");
        System.out.println(queue);

        System.out.println("Введите число, которое хотите добавить в конец очереди: ");
        int element = Integer.parseInt(iScanner.nextLine());
        System.out.printf("Добавим элемент %d в конец очереди: \n", element);
        enqueue(queue, element);
        System.out.println(queue);

        System.out.println("Извлечем первый элемент из очереди c удалением: ");
        int firstElementDelete = dequeue(queue);
        System.out.printf("Элемент равен %d\n", firstElementDelete);
        System.out.println("Очередь: ");
        System.out.println(queue);

        System.out.println("Извлечем первый элемент из очереди без удаления: ");
        int firstElement = first(queue);
        System.out.printf("Элемент равен %d\n", firstElement);
        System.out.println("Очередь: ");
        System.out.println(queue);
    }
}
