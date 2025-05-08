class MyThread extends Thread{
    int count;
// crea un nuovo thread.
MyThread(String name){
    super(name);//nome thread
    count =0;
    start();//avvia il thread
}

public void run(){
    System.out.println(getName()+"inizio.");
    try{
        do{
            Thread.sleep(500);
            System.out.println("In"+ getName()+ ",il conteggio " + count);
            count++;
        } while(count<10);
    }
    catch(InterruptedException exc){
        System.out.println(getName()+"interrotto.");
    }
    System.out.println(getName()+"termine.");
}
}

class ExtendThread{
    	public static void main(String[] args) {
		System.out.println("Inizio thread principale");
		MyThread mt= new MyThread("Figlio #1");
		do {
		    System.out.print(".");
		    try {
		        Thread.sleep(100);
		    }
		    catch(InterruptedException exc){
		        System.out.println("Thread principale interrotto.");
		    }
		} while (mt.count !=10);
		System.out.println("Termine thread principale.");
        
}
}