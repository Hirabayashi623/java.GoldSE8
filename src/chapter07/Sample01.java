package chapter07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import master.Master;

public class Sample01 extends Master{
	public static void main(String[] args){
		out("LocalDate");
		show(LocalDate.now());

		out("LocalTime");
		show(LocalTime.now());

		out("LocalDateTime");
		show(LocalDateTime.now());

		out("OffsetTime");
		show(OffsetTime.now());

		out("OffsetDateTime");
		show(OffsetDateTime.now());

//		out("ZoneOffset");
//		show(ZoneOffset.of(ZoneId.systemDefault().getId()));

		out("ZonedDateTime");
		show(ZonedDateTime.now());

	}
}
