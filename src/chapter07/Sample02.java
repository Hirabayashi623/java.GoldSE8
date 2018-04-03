package chapter07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import master.Master;

public class Sample02 extends Master{
	public static void main(String[] args){
		// 現在時刻から生成
		out("LocalDate.now");
		show(LocalDate.now());

		out("LocalDate.of");
		show(LocalDate.of(2017, 12, 10));
		show(LocalDate.ofYearDay(2017, 300));

		out("LocalDate.of Month利用");
		show(LocalDate.of(2017, Month.DECEMBER, 10));

		out("LocalDate.parse");
		show(LocalDate.parse("2017-12-01"));

		out("LocalDate.parse フォーマット利用");
		show(DateTimeFormatter.ofPattern("yyyyMMdd"));
		show(LocalDate.parse("20171210", DateTimeFormatter.ofPattern("yyyyMMdd")));

		LocalDateTime now = LocalDateTime.now();

		out("現在時刻");
		show(now);

		out("getYear");
		show(now.getYear());

		out("getMonthValue");
		show(now.getMonthValue());

		out("getMonth");
		show(now.getMonth());

		out("getDayOfYear");
		show(now.getDayOfYear());

		out("getDayOfMonth");
		show(now.getDayOfMonth());

		out("getDayOfMonth");
		show(now.getDayOfWeek());

		out("getHour");
		show(now.getHour());

		out("getMinute");
		show(now.getMinute());

		out("getSecond");
		show(now.getSecond());
	}
}
