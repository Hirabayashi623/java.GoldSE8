package chapter07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import master.Master;

public class Sample03 extends Master{
	public static void main(String[] args){
		LocalDate localDate 			= LocalDate.now();
		LocalTime localTime 			= LocalTime.now();
		LocalDateTime localDateTime 	= LocalDateTime.now();

		DateTimeFormatter format_iso_date 				= DateTimeFormatter.ISO_DATE;
		DateTimeFormatter format_basic_iso_date 			= DateTimeFormatter.BASIC_ISO_DATE;
		DateTimeFormatter format_iso_time					= DateTimeFormatter.ISO_TIME;
		DateTimeFormatter format_iso_date_time 			= DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter format_iso_local_date_time 	= DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		DateTimeFormatter format_iso_local_date 			= DateTimeFormatter.ISO_LOCAL_DATE;

		out("DateTimeFormatterクラスのフォーマット操作");
		show(format_iso_date.format(localDate));

		out("LocalDateクラスのフォーマット操作");
		show(localDate.format(format_iso_date));

		out("各種フォーマット：ISO_DATE");
		show(localDate.format(format_iso_date));

		out("各種フォーマット：BASIC_ISO_DATE");
		show(localDate.format(format_basic_iso_date));

		out("各種フォーマット：ISO_TIME");
		show(localTime.format(format_iso_time));

		out("各種フォーマット：ISO_DATE_TIME");
		show(localDateTime.format(format_iso_date_time));

		out("各種フォーマット：ISO_LOCAL_DATE_TIME");
		show(localDateTime.format(format_iso_local_date_time));

		out("各種フォーマット：ISO_LOCAL_DATE");
		show(localDate.format(format_iso_local_date));

		out("LocalDateクラスにISO_TIMEフォーマット");
		try{
			show(localDate.format(format_iso_time));
		}catch(Exception e){	e.printStackTrace();	}

		out("フォーマットの指定 yyyy/MM/dd HH:mm:ss");
		show(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));

		out("フォーマットの指定 yyyy/MMMM/dd HH:mm:ss");
		show(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss")));
	}
}
