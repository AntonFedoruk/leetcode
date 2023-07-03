package ua.java.dsa.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

public class CountSortObjects {
    public static void main(String[] args) {
        ArrayList<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker(123, "Qwerty", "+1237894563", 5));
        workerList.add(new Worker(433, "Hanchik", "+6339874302", 7));
        workerList.add(new Worker(412, "Konsasa", "+9888356112", 2));
        workerList.add(new Worker(328, "Kolosha", "+3132456612", 5));
        workerList.add(new Worker(121, "Moh", "+6662228834", 3));
        workerList.add(new Worker(563, "Fosha", "+1230984756", 2));

        for (Worker worker : countSort(workerList)) {
            System.out.println(worker);
        }
    }

    public static Worker[] countSort(List<Worker> workers) {
        final int MAX_VALUE = 10;

        int[] count = new int[MAX_VALUE];

        for (int i = 0; i < workers.size(); i++) {
            count[workers.get(i).qualification]++;
        }

        Worker[] out = new Worker[workers.size()];
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        for (int i = workers.size() - 1; i >= 0; i--) {
            Worker worker = workers.get(i);
            out[count[worker.qualification] - 1] = worker;
            count[worker.qualification]--;
        }
        return out;
    }

    static class Worker{
        int id;
        String name, phone;
        int qualification;

        public Worker(int id, String name, String phone, int qualification) {
            this.id = id;
            this.name = name;
            this.phone = phone;
            this.qualification = qualification;
        }

        @Override
        public String toString() {
            return "Worker{" +
                    "id="+ id+
                    ", name='" +name+'\''+
                    ", phone='" +phone+'\''+
                    ", qualification='" +qualification +
                    '}';
        }
    }
}
