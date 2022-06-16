package assignments;

import java.time.LocalDateTime;

public class Date_time {

	public static void main(String[] args) {
      
		LocalDateTime systemdate=LocalDateTime.now();
		String date = systemdate.toString().replaceAll(":"  , "-");
		System.out.println(date);
	}

}
