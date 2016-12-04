package Florian;

import org.junit.Test;
import junit.framework.TestCase;

public class QueueTest extends TestCase{
	@Test
	public void testQueue() {
		Queue q = new Queue(3);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		assertEquals(1, q.dequeue());
		assertEquals(2, q.dequeue());
		assertEquals(3, q.dequeue());
		  try{
			  q.dequeue();
		      fail("Aus leerer Queue kann nicht entnommen werden.");
		    } catch(IllegalStateException e){
		    }
			q.enqueue(1);
			q.enqueue(2);
			q.enqueue(3);
			q.enqueue(4);
			assertEquals(4, q.dequeue());
			assertEquals(2, q.dequeue());
			assertEquals(3, q.dequeue());
	}
}
