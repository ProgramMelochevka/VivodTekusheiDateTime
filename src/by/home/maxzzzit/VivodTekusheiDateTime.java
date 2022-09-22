package by.home.maxzzzit;

import java.util.Date;
import java.util.Locale;

// Вывод текущей даты и времени по шаблону
public class VivodTekusheiDateTime {
	public static void main(String[]args) {
			Locale locale_ru_RU = new Locale("ru", "RU");
			System.out.printf(locale_ru_RU,	"Сейчас время в нашей стране:\n"
			+ "%1$td %1$tB %1$tY %1$tH:%1$tM:%1$tS\n"
			+ "%1$td.%1$tm.%1$tY", new Date());
	}
}
