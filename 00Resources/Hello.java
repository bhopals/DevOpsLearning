import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Hello {

public static void main(String[] args) {
		
		System.out.println("Loop Started AT:"+getFormattedDate2());
		for(int i=0;i<20;i++){
			System.out.println("Looping of Index:"+i);
		}
		System.out.println("Loop Started AT:"+getFormattedDate2());
	}

	
	private static String getFormattedDate2() {
		Calendar currentTime = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
		return formatter.format(currentTime.getTime()); 
	}

}
