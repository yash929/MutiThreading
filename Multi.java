class print 
{
	int k;
	print(int k){
		this.k=k;
	}
	
	public void display(int m){
		System.out.println("Thread Started Printing");
	for(int i=k;i<=m;i++){
		
		System.out.print(i+"\t");
//		try{
//			Thread.sleep(100);
//			}
//		catch(Exception e){
//			e.printStackTrace();
//		}
		
	}System.out.println();
	System.out.println("Thread completed Printing");
}
}

class thread extends Thread{
print p;
int j;
	thread(print p,int i){
	this.p=p;
	this.j=i;
	}
	public void run(){
	     try
	     {
	    	 synchronized(p)
	    	 {
	    		 p.display(j);
	    		 Thread.sleep(1000);
	    	 }
	    	 
	     } 
	     catch (Exception e) 
	     {
	         e.printStackTrace();
	     }
	}
}

public class Multi{
	
	public static void main(String args[])
	{
	print p1=new print(1);
	print p2=new print(501);
	thread t1=new thread(p1,500);
	thread t2=new thread(p2,1000);
	t1.run();
	t2.run();
	
	
	}
}