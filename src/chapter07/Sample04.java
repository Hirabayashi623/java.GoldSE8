package chapter07;

import java.time.LocalDateTime;

import master.Master;

public class Sample04 extends Master{
	public static void main(String[] args){
		LocalDateTime now = LocalDateTime.now();

		out("現在時刻");
		show(now);

		out("plusDays");
		show(now.plusDays(3));
		show(now.plusDays(100));

		out("plusMonths");
		show(now.plusMonths(3));

		out("plusYears");
		show(now.plusYears(3));

		out("plusWeeks");
		show(now.plusWeeks(3));

		out("plusHours");
		show(now.plusHours(3));

		out("plusMinutes");
		show(now.plusMinutes(3));

		out("plusSeconds");
		show(now.plusSeconds(3));

		out("minusYears  ※plusに対応するminusメソッドが準備されている ");
		show(now.minusYears(3));
	}
}
