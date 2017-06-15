package com.bomoda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.dao.BizDao;
import com.dao.impl.BizDaoImpl;
import com.pay.domain.Biz;

public class TranslateBiz {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		translateBiz("wechat_test/biz");

	}

	public static void translateBiz(String fileName) throws ParseException {
		File file = new File(fileName);
		BufferedReader reader = null;
		try {
			
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
		
			while ((tempString = reader.readLine()) != null) {
				
				System.out.println("line " + line + ": " + tempString);
				String[] recordStr = tempString.split("\t");
				for (int i = 0; i < recordStr.length; i++) {
					System.out.println(i + " " + recordStr[i]);
				}
				Biz biz = new Biz();

				biz.setId(Integer.parseInt(recordStr[0]));
				biz.setBizId(recordStr[1]);
				biz.setBizCode(recordStr[2]);
				biz.setBizName(recordStr[3]);
				biz.setBizDescription(recordStr[4]);
				biz.setQrcode(recordStr[5]);

				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Long time = new Long(Long.parseLong(recordStr[6]));
				String d = format.format(time);
				Date date = format.parse(d);
				biz.setTimestamp(date);

				BizDao bizdb = new BizDaoImpl();
				bizdb.insert(biz);
				bizdb.commit();

				line++;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
	}

}
