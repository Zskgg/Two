package ustils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	
	
	
	//杩斿洖涓�涓湪鏌愪釜鏃堕棿娈电殑闅忔満鏃ユ湡
	
	public static Date randomDate(Date minDate ,Date maxDate) {
		//浠�1970骞村埌minDate鐨勬绫虫暟
		long l1 = minDate.getTime();
		//浠�1970骞村埌maxDate鐨勬绫虫暟
		long l2 = maxDate.getTime();
		
		Calendar c = Calendar.getInstance();
		
	//	
		long l3 = (long) (Math.random() * (l2-l1 +1 )+l1);
		c.setTimeInMillis(l3);
		
		return c.getTime();
		
		
	}

	
	/*
	* 鏂规硶1锛�(5鍒�)    杩斿洖浼犲叆鏃ユ湡鐨勬湀鍒�
	* 缁欎竴涓椂闂村璞★紝杩斿洖璇ユ椂闂存墍鍦ㄦ湀鐨�1鏃�0鏃�0鍒�0绉掋�備緥濡備竴涓狣ate瀵硅薄鐨勫�兼槸2019-05-18 11:37:22
	* 鍒欒繑鍥炵殑缁撴灉涓�2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		//鑾峰彇鏃ュ巻绫�
		Calendar c = Calendar.getInstance();
		
		//鏍规嵁浼犲叆鐨勬棩鏈熸瀯寤烘棩鍘嗙被
		c.setTime(src);
		//璁剧疆鏈堝垵
		c.set(Calendar.DAY_OF_MONTH, 1);//鏃�
		c.set(Calendar.HOUR_OF_DAY, 0);//灏忔椂
		c.set(Calendar.MINUTE, 0);//鍒嗛挓
		c.set(Calendar.SECOND, 0);//绉�
		
		 return c.getTime();
		
	}
	/*
	* 鏂规硶2锛�(5鍒�)
	* 缁欎竴涓椂闂村璞★紝杩斿洖璇ユ椂闂存墍鍦ㄦ湀鐨勬渶鍚庢棩23鏃�59鍒�59绉掞紝闇�瑕佽�冭檻鏈堝ぇ鏈堝皬鍜屼簩鏈堢壒娈婃儏鍐点��
	* 渚嬪涓�涓狣ate瀵硅薄鐨勫�兼槸2019-05-18 11:37:22锛屽垯杩斿洖鐨勬椂闂翠负2019-05-31 23:59:59
	* 渚嬪涓�涓狣ate瀵硅薄鐨勫�兼槸2019-02-05 15:42:18锛屽垯杩斿洖鐨勬椂闂翠负2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		// 1璁╂彃鍏ョ殑鏈堜唤鍔�1 ,2鍐嶈鏃ユ湡鍙樹负鏈堝垵, 3鏈�鍚� 璁╂棩鏈熷噺鍘讳竴绉�
		//2019-09-05    -->2019-10-05  --->2019-10-01 :0:0:0----鍦ㄥ噺鍘�1绉�
		Calendar c = Calendar.getInstance();
		
		c.setTime(src);
		
		//璁╂湀浠藉姞1
		c.add(Calendar.MONTH, 1);
		//璁╂棩鏈熷彉鎴愭湀鍒�
		Date date = getDateByInitMonth(c.getTime());
		//璁╂湀鍒濆垵濮嬪寲鏃ュ巻绫�
		c.setTime(date);
		//璁╂棩鏈熷噺鍘�1绉�
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}

}
