package test;

class SumArray{
	
	public int sum(int[] arr) throws InterruptedException 
	{
		int result = 0;
		
		for(int element : arr)
		{
			result = result + element; 
			
			System.out.println("Running total for "+Thread.currentThread().getName()+" is "+result);
			Thread.sleep(300);
		}
		return result;
	}
}


class CThread implements Runnable{
	
	private int[] arr;
	private Thread thread;
	
	public CThread(String name,int[] arr) {
		this.arr = arr;
		this.thread = new Thread(this, name);
		this.thread.start();	
	}

	private static SumArray sa = new SumArray();
	@Override
	public void run()// no locking , ramdom thread access sum function 
	{
		
		try {
			// thread locking 
			synchronized (sa)  {
				
				   int result = sa.sum(arr);
					System.out.println("Result : " + result);
			}
	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void run()// no locking , ramdom thread access sum function 
	{
		
		try {
			
			      int result = sa.sum(arr);
			System.out.println("Result : " + result);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}*/
	
	
}

public class Program {
	public static void main(String[] args) {
		
		int[] arr1 = { 1,2,3,4,5,6,7,8,9,10 };
		CThread th1 = new CThread("Th1",arr1);
		
		int[] arr2 = { 11,12,13,14,15,16,17,18,19,20 };
		CThread th2 = new CThread("Th2",arr2);
		
		int[] arr3 = { 21,22,23,24,25,26,27,28,29,20};
		CThread th3 = new CThread("Th3",arr3);
		
		int[] arr4 = { 31,32,33,34,35,36,37,38,39,40};
		CThread th4 = new CThread("Th4",arr4);
	}
}
