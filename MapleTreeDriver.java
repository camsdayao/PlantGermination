/**
 * 
 */
package PlantGermination;

import java.util.Scanner;

/**
 * @author CamilleDayao
 *
 */
public class MapleTreeDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Mapletree tree = new Mapletree();
		
		System.out.print("Enter plant date (dd/mm/yyyy): ");
		String pDate = scan.next();
		
		tree.plantMethod(pDate);
		System.out.print("Enter germination date (dd/mm/yyyy): ");
		String hgtDate = scan.next();
		System.out.print("Enter observed height in meters: ");
		float hgt = scan.nextFloat();
		tree.germinateMethod(hgt, hgtDate);
		tree.dumpMethod();
		
		
	}

}
