package chapter07;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.stream.Collectors;

import master.Master;

public class Sample07 extends Master{
	public static void main(String[] args){
		title("Priodクラスの生成");

		LocalDate date1 = LocalDate.of(2016, 1, 1);
		LocalDate date2 = LocalDate.now();
		LocalTime time1 = LocalTime.of(0, 0, 0);
		LocalTime time2 = LocalTime.now();

		Period period = Period.between(date1, date2);

		out("Period.between");
		// 第一引数が基準になる
		show(Period.between(date1, date2));
		show(Period.between(date2, date1));

		out("getYears");
		show(period.getYears());

		out("getMonths");
		show(period.getMonths());

		out("getDays");
		show(period.getDays());

		out("Period.ofYears");
		show(Period.ofYears(1));

		out("Period.ofWeeks");
		show(Period.ofWeeks(2));

		out("Period.ofMonths");
		show(Period.ofMonths(2));

		out("Period.ofDays");
		show(Period.ofDays(3));

		out("Period.of");
		show(Period.of(1,2,3));

		out("Period.ZERO");
		show(Period.ZERO);

		title("Priodクラスの加算・減算");

		out("基準");
		show(period = Period.of(1,2,3));

		out("plusYears, plusMonths, plusDays, plus");
		show(period.plusYears(3));
		show(period.plusMonths(3));
		show(period.plusDays(3));
		show(period.plus(period));

		title("Priodクラスを用いた加算・減算");

		out("現在日時");
		show(LocalDateTime.now());

		out("LocalDateTime.now().plus");
		show(LocalDateTime.now().plus(period));
		out("LocalDate.now().plus");
		show(LocalDate.now().plus(period));
		out("LocalTime.now().plus");
		try{
			// LocalTimeは日付を持たないため実行時エラー
			show(LocalTime.now().plus(period));
		}catch(Exception e){ e.printStackTrace();}


		title("Durationクラスの生成");

		show(Duration.ofHours(3));
		show(Duration.ofMinutes(21));
		show(Duration.ofSeconds(36));
		show(Duration.ofSeconds(12,300_000_000));
		show(Duration.ofMillis(3));
		show(Duration.ofNanos(45));
		show(Duration.between(time1, time2));

		out("ChronoUnit型の利用");
		show((Arrays.asList(ChronoUnit.values()))
				.stream()
				.map(obj -> obj.toString())
				.collect(Collectors.joining(",")));

		show(Duration.of(1, ChronoUnit.HOURS));
		show(Duration.of(1, ChronoUnit.MINUTES));
		show(Duration.of(1, ChronoUnit.SECONDS));
		try{
			show(Duration.of(1, ChronoUnit.YEARS));
		}catch(Exception e){ e.printStackTrace(); }


	}
}
