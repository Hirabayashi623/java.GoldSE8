package chapter07;

import java.time.LocalDate;
import java.time.LocalTime;

// 夏時間開始時刻  3月13日  2時 0分
// 夏時間終了時刻 11月 6日  2時 0分


import java.time.ZoneId;
import java.time.ZonedDateTime;

import master.Master;

public class Sample06 extends Master{
	public static void main(String[] args){
		ZoneId zone = ZoneId.of("America/Los_Angeles");

		LocalDate date1 = LocalDate.of(2016, 3, 13);
		LocalDate date2 = LocalDate.of(2016, 11, 6);
		LocalTime time1 = LocalTime.of(1, 0);
		LocalTime time2 = LocalTime.of(2, 0);
		LocalTime time3 = LocalTime.of(3, 0);

		out(date1 + " " + time1);
		show(ZonedDateTime.of(date1, time1, zone));

		out(date1 + " " + time2);
		show(ZonedDateTime.of(date1, time2, zone));

		out(date1 + " " + time3);
		show(ZonedDateTime.of(date1, time3, zone));

		out(date2 + " " + time1);
		show(ZonedDateTime.of(date2, time1, zone));

		out(date2 + " " + time2);
		show(ZonedDateTime.of(date2, time2, zone));

		out(date2 + " " + time3);
		show(ZonedDateTime.of(date2, time3, zone));
	}


}
