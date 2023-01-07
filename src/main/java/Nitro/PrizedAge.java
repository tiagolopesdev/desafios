package Nitro;

import java.util.*;

public class PrizedAge {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int qntPeople = scan.nextInt();

	    int[] ticket = new int[qntPeople];
	    
	    for(int i = 0; i < qntPeople; i++) {	    	
	    	ticket[i] = scan.nextInt();
	    }
	    
	    int prizedTicket = scan.nextInt();
	    
	    boolean winner = false;
	    
	    for(int i = 0; i < qntPeople; i++) {
	    	if (ticket[i] == prizedTicket) {
	    		winner = true;	    		
	    		System.out.println("Número da poltrona do vencedor: " + i);
	    		break;
	    	}	    		    	
	    }	    
	    if (!winner) System.out.println("Não há vencedor");	    
	}
}
