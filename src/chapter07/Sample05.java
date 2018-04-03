package chapter07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import master.Master;

public class Sample05 extends Master{
	public static void main(String[] args){
		out("ZoneId.systemDefault");
		show(ZoneId.systemDefault());

		out("ZoneId.of");
		show(ZoneId.of("America/Los_Angeles"));

		out("ZonedDateTime.of 日時を指定");
		show(ZonedDateTime.of(2017, 12, 10, 15, 36, 54, 0, ZoneId.systemDefault()));

		out("ZonedDateTime.of 日付/時刻APIクラスを利用");
		show(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Los_Angeles")));
		show(ZonedDateTime.of(LocalDate.now(),LocalTime.now() , ZoneId.of("America/Los_Angeles")));

		out("### 表示フォーマット ###");
		ZonedDateTime now = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault());

		out("FormatStyle.FULL");
		show(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));

		out("FormatStyle.LONG");
		show(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));

		// MEDIUMはLocaDateにも使用可能
		out("FormatStyle.MEDIUM");
		show(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

		// SHORTはLocaDateにも使用可能
		out("FormatStyle.SHORT");
		show(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));

		out("ZoneOffset.of");
		show(ZoneOffset.of("+09:00"));
//		show(ZoneOffset.of("+9:00"));   // HH:mmの形式で記述しないと実行時エラー
		show(ZoneOffset.ofHours(-6));

		out("OffsetDateTime.of");
		show(OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.of("+09:00")));
	}
}
