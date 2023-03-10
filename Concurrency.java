import java.util.concurrent.*;
// i don't understand this concept
public class Concurrency{
    public static void main(String[] args) {
        executorInvoke();
        executorServiceInvoke();
    }
    private static void executorInvoke(){
        Executor executor=new Caller();
        executor.execute(()->{
            System.out.println("Executor example");
        });
    }

    private static void executorServiceInvoke(){
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        executorService.submit(() ->{
            System.out.println("Executor service example ");
        });
    }
}
class Caller implements Executor{
    @Override
    public void execute(Runnable command) {
        command.run();
    }
}
class FutureDemo{
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newSingleThreadExecutor();

        Future<String>future=executorService.submit(() ->{
            Thread.sleep(10000);
            return "Completed";
        }) ;
        try {
            while (!future.isDone()){
                System.out.println("Task Still in Progress ....Wait");
                Thread.sleep(500);
            }
            System.out.println("Task Completed !");
            String result =future.get(3000, TimeUnit.MILLISECONDS);
            System.out.println(result);
            executorService.shutdown();
        } catch (ExecutionException | InterruptedException | TimeoutException e) {
            future.cancel(true);
            future.isDone();
            future.isCancelled();
        }
    }
}