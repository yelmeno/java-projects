import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<hasta> acilServis = new PriorityQueue<hasta>();
        acilServis.offer(new hasta("Murat","Apandist"));
        acilServis.offer(new hasta("Selim","Yanık"));
        acilServis.offer(new hasta("Dilan","Baş Ağrısı"));
        acilServis.offer(new hasta("Taha","Kırık"));
        int i = 1;
        while (acilServis.isEmpty() != true){
            System.out.println("*********************");
            System.out.println(i + ". Sırada");
            System.out.println(acilServis.poll());
            System.out.println("**********************");
            i++;
        }
    }
}