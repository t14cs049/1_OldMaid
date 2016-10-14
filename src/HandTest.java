import static org.junit.Assert.*;

import org.junit.Test;


public class HandTest {

	@Test
	public void testAddCard() {
		Card crd1 = new Card(Card.DIAMOND,2);
		Hand hnd1 = new Hand();
		
		hnd1.addCard(crd1);
		
		assertEquals( 1, hnd1.getNumberOfCards() );
	}

	@Test
	public void testPickCard() {
		fail("まだ実装されていません");
	}

	@Test
	public void testFindSameNumberCard() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetNumberOfCards() {
		Card crd1 = new Card(Card.DIAMOND,2);
		Hand hnd1 = new Hand();
		
		hnd1.addCard(crd1);
		
		assertEquals( 1, hnd1.getNumberOfCards() );
	}

	@Test
	public void testShuffle() {
		fail("まだ実装されていません");
	}

	@Test
	public void testToString() {
		Card crd1 = new Card(Card.DIAMOND,2);
		Hand hnd1 = new Hand();
		
		hnd1.addCard(crd1);
		
		assertEquals( "D2 ", hnd1.toString() );
	}

}
