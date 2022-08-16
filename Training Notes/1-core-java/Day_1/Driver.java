
import com.revature.models.Bicycle;

public class Driver {
	public static void main(String[] args) {
		
		Bicycle redBike = new Bicycle(10, "Grey");
		
		System.out.println(redBike.getSpeed());
		
		redBike.peddle(1);
		System.out.println(redBike.getSpeed());
		redBike.applyBrake(100);
		System.out.println(redBike.getSpeed());
	
	}
}
