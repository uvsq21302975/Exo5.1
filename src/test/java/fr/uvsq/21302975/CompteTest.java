package exo3_1.java;


import org.junit.Test;

import static org.junit.Assert.*;




public class CompteTest {

	@Test
	public void testConsulteSolde() {
		Compte test = new Compte(20);
		assertEquals("compte pas bien crée",new Double(test.ConsulteSolde()),new Double(20.0));
		
		try {
			Compte ab = new Compte(1);// fail si solde rentré est nul
			}
			catch(IllegalArgumentException e )
		{
			 fail();
			}
	}

	@Test
	public void testCredit() {
		Compte test = new Compte(20);
		test.Credit(10);
		assertEquals(new Double(test.ConsulteSolde()),new Double(30.0));
	}
	
	@Test
	public void testDebit() {
		Compte test = new Compte(20);
		boolean bool_test=test.Debit(15);
		assertTrue("debit pas fait", bool_test); 
	}
	
	@Test
	public void testVirement() {
		Compte c1 = new Compte(100);
		Compte c2 = new Compte(50);
		c1.Virement(c2, 50);
		assertEquals(new Double(c1.ConsulteSolde()),new Double(50.0));
		assertEquals(new Double(c2.ConsulteSolde()),new Double(100.0));
	}
	

	@Test 
	(expected= IllegalArgumentException.class)
		public void solde_negatif(){
		Compte test = new Compte(-5);
	}
	
	
}
