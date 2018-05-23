package intermedio2;
import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fechar();
	}
	
	public static void fechar() {
		LocalDateTime date = LocalDateTime.now();
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		  String text = date.format(formatter);
		  System.out.println("Fecha: "+text);
	      System.out.println("GTM: "+ZonedDateTime.of(date,ZoneId.of("GMT0")).format(formatter));
	      System.out.println("GTM: "+ZonedDateTime.now(ZoneId.of("GMT0")).format(formatter));
	      System.out.println("India: "+ZonedDateTime.now(ZoneId.of("Asia/Kolkata")).format(formatter));
	      System.out.println("UTC: "+ZonedDateTime.now(ZoneId.of("UTC")).format(formatter));
	      System.out.println("Todas las zonas horarias----------");
	      for(String zona: ZoneId.getAvailableZoneIds()) {
	    	  System.out.println(zona);
	      }
	}

}
