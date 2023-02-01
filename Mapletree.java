/**
 * 
 */
package PlantGermination;

/**
 * @author CamilleDayao
 *
 */
public class Mapletree {

	private String plantDate;
	private float height;
	private String heightDate;
		
	public void plantMethod(String pDate) {
	plantDate = pDate;
	}
	public void germinateMethod(float hgt, String hgtDate) {

	height = hgt;
	heightDate = hgtDate;
	}
	public void dumpMethod() {
		System.out.println("Plant date: " + plantDate);
		System.out.println("Germinate date: " + heightDate);
		System.out.println("Initial height: " + height);
	}
	
	
	
}
