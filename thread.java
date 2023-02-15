class workerThread implements Runnable{
    private String data;
    public workerThread(final String anydata){
        this.data=anydata;
    }
    public void run(){
        for(int i=0;i<=10;i++)
        {
            System.out.println(7+"X"+i+"="+7*i);
        }
    }
}
public class thread {
    public static void main(final String [] args) {
        System.out.println("program started");
        workerThread obj1=new workerThread( "creating thread through runnable");
        final Thread t1=new Thread(obj1);
        t1.start();
        t1.setName("first thread");
        System.out.println("ending");
        
    }
 
    
}
