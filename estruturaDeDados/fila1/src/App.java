public class App {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Frente da fila: " + queue.peek());

        System.out.println("Elementos removidos da fila:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
