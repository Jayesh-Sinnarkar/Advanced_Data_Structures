package testers;

import utils.CircularQueue;

public class Tester {
	
	public static void main(String[] args)
	{
		CircularQueue q = new CircularQueue();
		try {
		q.enQueue(15);
		q.enQueue(25);
		q.enQueue(35);
		q.enQueue(45);
		q.enQueue(55);
		q.print();
		q.enQueue(65);
		q.print();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
