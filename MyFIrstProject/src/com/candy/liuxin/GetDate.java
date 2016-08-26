package com.candy.liuxin;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDate {
	public static void main(String[] args){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String sysdate = sdf.format(date);
		System.out.println(sysdate);
	}

}
