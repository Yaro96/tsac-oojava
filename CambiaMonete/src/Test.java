

/*import java.io.InputStreamReader;
import java.io.BufferedReader ;
import java.io.IOException;*/

public class Test {

	public static void main(String[] args) {
		int val = 2388;
		
		System.out.println("Per cambiare " + val + "euro ti servono: ");
		
		Money[] retArr = MoneyChange.change(val);		
		MoneyChange.count(retArr);
	}

}
