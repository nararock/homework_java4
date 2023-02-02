import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class task1 {
    static LinkedList<Integer> reverseList(LinkedList<Integer> enterList) {
        int amount = enterList.size();
        LinkedList<Integer> reverseList = new LinkedList<Integer>();
        for (int i = 0; i < amount; i++) {
            int temp = enterList.pollLast();
            reverseList.add(temp);
        }
        return reverseList;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int amount = Integer.parseInt(iScanner.nextLine());
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < amount; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Дано: ");
        System.out.println(list);
        LinkedList<Integer> reverseList = reverseList(list);
        System.out.println("Перевернутый лист: ");
        System.out.print(reverseList);
    }
}