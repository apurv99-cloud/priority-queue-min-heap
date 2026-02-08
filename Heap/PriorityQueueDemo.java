import java.util.PriorityQueue;

public class PriorityQueueDemo {

    static class Student implements Comparable<Student> {
        private String name;
        private int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        public String getName() {
            return name;
        }

        public int getRank() {
            return rank;
        }

        @Override
        public int compareTo(Student other) {
            
            return Integer.compare(this.rank, other.rank);
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Student("A", 5));
        priorityQueue.add(new Student("B", 4));
        priorityQueue.add(new Student("C", 1));
        priorityQueue.add(new Student("D", 7));

        while (!priorityQueue.isEmpty()) {
            Student current = priorityQueue.poll();
            System.out.println(current.getName() + " -> " + current.getRank());
        }
    }
}
