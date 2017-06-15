package com.bomoda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.dao.BizDao;
import com.dao.ClickDao;
import com.dao.impl.BizDaoImpl;
import com.dao.impl.ClickDaoImpl;
import com.pay.domain.Biz;
import com.pay.domain.Click;

public class TranslateClick {
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		translateClicks("wechat_test/clicks");

	}

	public static void translateClicks(String fileName) throws ParseException {
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
					System.out.println(i + " "+recordStr[i]);
				}
				Click click = new Click();
				
				click.setId(Integer.parseInt(recordStr[0]));
				click.setUrl(recordStr[1]);
				click.setTitle(recordStr[2]);
				click.setReadNumber(Integer.parseInt(recordStr[3]));
				click.setLikeNumber(Integer.parseInt(recordStr[4]));
				

				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Long time = new Long(Long.parseLong(recordStr[5]));
				String d = format.format(time);
				String[] mytime = d.split(" ");
				Date date = format.parse(recordStr[6]+ " " + mytime[1]);
				
				click.setTimestamp(date);
				
				System.out.println(click.getTimestamp().toString());

				ClickDao clickdb = new ClickDaoImpl();
				clickdb.insert(click);
				clickdb.commit();

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
