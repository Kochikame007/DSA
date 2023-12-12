package java8;

public class Thread1 implements Runnable {
   private final String word;

   Thread1(String word){
       this.word =word;
   }

    @Override
    public void run() {
           for(int i =0;i<5;i++){
               System.out.println(this.word);
               try{
                   Thread.wait();
               }catch(InterruptedException e){
                   Thread.currentThread().interrupt();
                   e.printStackTrace();
                   return;
               }


           }
    }
}
