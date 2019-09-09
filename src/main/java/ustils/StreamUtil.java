package ustils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtil {

	
	/*
	* 鏂规硶1锛氭壒閲忓叧闂祦锛屽弬鏁拌兘浼犳棤闄愪釜銆�(3鍒�)
	* 渚嬪浼犲叆FileInputStream瀵硅薄銆丣DBC涓瑿onnection瀵硅薄閮藉彲浠ュ叧闂��
	*/
	public static void closeAll(AutoCloseable ... ables){
		
		if(ables.length!=0) {
			
			for (AutoCloseable autoCloseable : ables) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					e.printStackTrace();
			}
			}
		}
	}
	/*
	* 鏂规硶2锛氫紶鍏ヤ竴涓枃鏈枃浠跺璞★紝榛樿涓篣TF-8缂栫爜锛岃繑鍥炶鏂囦欢鍐呭(3鍒�)锛岃姹傛柟娉曞唴閮ㄨ皟鐢ㄤ笂闈㈢1涓柟娉曞叧闂祦(3鍒�)
	*/
	public static String readTextFile(InputStream src){
		//瀛楄妭杈撳嚭娴�
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] b=new byte[1024];
		String str =null;
		int x=0;
		try {
			while((x=src.read(b))!=-1) {
				out.write(b);	
			}
			//
			 str =out.toString("utf-8");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		//鍏虫祦
		closeAll(out,src);
		return  str;
	}
	/*
	* 鏂规硶3锛氫紶鍏ユ枃鏈枃浠跺璞★紝杩斿洖璇ユ枃浠跺唴瀹�(3鍒�)锛屽苟涓旇姹傚唴閮ㄨ皟鐢ㄤ笂闈㈢2涓柟娉�(5鍒�)銆�* 杩欐槸鍏稿瀷鐨勬柟娉曢噸杞斤紝璁颁綇浜嗗悧锛熷皯骞粹��
	*/
	public static String readTextFile(File txtFile){
		try {
			return readTextFile(new FileInputStream(txtFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
		
		
	}
}
