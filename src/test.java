/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// İşlemleri (prosesleri) temsil eden sınıf
class Process {
    String name;
    int remainingTime;

    public Process(String name, int remainingTime) {
        this.name = name;
        this.remainingTime = remainingTime;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N: İşlem sayısı, T: Kuantum süresi
        int n = scanner.nextInt();
        int t = scanner.nextInt();

        // Aktif süreçler için Kuyruk (Queue)
        Queue<Process> queue = new LinkedList<>();
        // Askıya alınan süreçler için Yığın (Stack)
        Stack<Process> stack = new Stack<>();

        // Girdileri oku ve kuyruğa ekle
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int time = scanner.nextInt();
            queue.add(new Process(name, time));
        }

        int finishedCount = 1;

        // Kuyrukta veya yığında işlem olduğu sürece döngü devam eder
        while (!queue.isEmpty() || !stack.isEmpty()) {

            // KURAL 2: Eğer kuyruk boşsa, yığındaki tüm elemanları sırayla kuyruğa geri taşı (LIFO mantığı)
            if (queue.isEmpty() && !stack.isEmpty()) {
                while (!stack.isEmpty()) {
                    queue.add(stack.pop());
                }
            }

            // Kuyruğun başındaki işlemi al
            Process currentProcess = queue.poll();

            if (currentProcess != null) {
                // İşlemci kuantum süresi (T) kadar veya kalan süre kadar çalışır
                if (currentProcess.remainingTime > t) {
                    currentProcess.remainingTime -= t;
                    // KURAL 1: Kuantum bitti ama işlem tamamlanmadıysa YIĞINA atılır
                    stack.push(currentProcess);
                } else {
                    // KURAL 4: İşlem başarıyla tamamlandı, ekrana yazdır
                    System.out.println(finishedCount + ". " + currentProcess.name);
                    finishedCount++;
                }
            }
        }

        scanner.close();
    }
}
*/