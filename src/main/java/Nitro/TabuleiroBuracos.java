package Nitro;

import java.util.*;

public class TabuleiroBuracos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int positionX = 4;
		int positionY = 3;
		
		int qntLoop = scan.nextInt();
		
		boolean down = false;		
		int moveCavalo = 0;
		int moveWithoutDown = 0;
		
		while (qntLoop != 0) {
			
			if (!down) {
				moveWithoutDown++;
			}
			
			moveCavalo = scan.nextInt();	
			
			if (moveCavalo == 1) {
				positionX += 1;
				positionY += 2;
			} else if (moveCavalo == 2) {
				positionX += 2;
				positionY += 1;
			} else if (moveCavalo == 3 ) {
				positionX += 2;
				positionY -= 1;
			} else if (moveCavalo == 4 ) {
				positionX += 1;
				positionY -= 2;
			} else if (moveCavalo == 5 ) {
				positionX -= 1;
				positionY -= 2;
			} else if (moveCavalo == 6 ) {
				positionX -= 2;
				positionY -= 1;
			} else if (moveCavalo == 7 ) {
				positionX -= 2;
				positionY += 1;
			} else if (moveCavalo == 8 ) {
				positionX -= 1;
				positionY += 2;
			}
			if ((positionX == 1 && positionY == 3) || 
				(positionX == 2 && positionY == 3) ||
				(positionX == 2 && positionY == 5) ||
				(positionX == 5 && positionY == 4)
				){
				down = true;
			}			
			qntLoop--;
		}
		System.out.print(moveWithoutDown);
	}
}


