package com.bomoda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.io.FileWriter;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.dao.BizDao;
import com.dao.PageDao;
import com.dao.impl.BizDaoImpl;
import com.dao.impl.PageDaoImpl;
import com.pay.domain.Biz;
import com.pay.domain.Page;

public class TranslatePage {

	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub

		readHtmlToNewpages("wechat_test/pages");

		translatePages("wechat_test/newpages");

	}

	public static void readHtmlToNewpages(String fileName) throws IOException {
		File inFile = new File(fileName);
		File outFile = new File("wechat_test//newpages");
		BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
		Document doc = (Document) Jsoup.parse(inFile, "UTF-8");
		int num = 0;

		Elements url = doc.getElementsByTag("URL");
		Elements title = doc.getElementsByTag("TITLE");
		//Elements content = doc.getElementsByTag("BODY");
		Elements time = doc.getElementsByTag("TIME");
		Elements date = doc.getElementsByTag("DATE");
		Elements id = doc.getElementsByTag("ID");

		Elements elements = doc.getAllElements();

		ArrayList alid = new ArrayList();
		ArrayList alurl = new ArrayList();
		ArrayList altitle = new ArrayList();
		//ArrayList alcontent = new ArrayList();
		ArrayList altime = new ArrayList();
		ArrayList aldate = new ArrayList();

		ArrayList al = new ArrayList();

		for (Element i : url) {
			alurl.add(i.text());
		}
		for (Element i : title) {
			num++;
			if (num % 2 == 0) {
				altitle.add(i.text());
			}
		}
		//for (Element i : content) {
		//	alcontent.add(i.text());

		//}
		for (Element i : id) {
			alid.add(i.text());
		}

		for (Element i : date) {
			aldate.add(i.text());
		}

		for (Element i : time) {
			altime.add(i.text());
		}

		for (int i = 0; i < alurl.size(); i++) {
			bw.write(String.valueOf(alid.get(i)));
			bw.write("\t");
			bw.write(String.valueOf(alurl.get(i)));
			bw.write("\t");
			bw.write(String.valueOf(altitle.get(i)));
			bw.write("\t");
			bw.write(String.valueOf(altitle.get(i)));
			bw.write("\t");
			bw.write(String.valueOf(altime.get(i)));
			bw.write("\t");
			bw.write(String.valueOf(aldate.get(i)));
			bw.write("\t");
			bw.write("\r\n");
		}

		bw.close();
	}

	public static void translatePages(String fileName) throws ParseException {
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
				Page page = new Page();

				page.setId(Integer.parseInt(recordStr[0]));
				page.setUrl(recordStr[1]);
				page.setTitle(recordStr[2]);
				page.setContent(recordStr[3]);
				
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Long time = new Long(Long.parseLong(recordStr[4]));
				String d = format.format(time);
				String[] mytime = d.split(" ");
				Date date = format.parse(recordStr[5]+ " " + mytime[1]);
				
				page.setTimestamp(date);

				PageDao pagedb = new PageDaoImpl();
				pagedb.insert(page);
				pagedb.commit();

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
