package com.bomoda;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.dao.BizDao;
import com.dao.impl.BizDaoImpl;
import com.pay.domain.Biz;

public class test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
	

		BizDao bizd = new BizDaoImpl();

		Biz biz = new Biz();
		biz.setBizCode("BIZCODE");
		biz.setBizDescription("bizDescription");
		biz.setBizId("bizId4");
		biz.setBizName("bizName");
		biz.setQrcode("qrcode");

//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//		Long time = new Long(465555555);
//
//		String d = format.format(time);

		Date date = new Date();

		biz.setTimestamp(date);

		bizd.insert(biz);
		bizd.commit();

	}

}
