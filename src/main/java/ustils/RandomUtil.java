package ustils;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	
	//鏂规硶1锛氳繑鍥瀖in-max涔嬮棿鐨勯殢鏈烘暣鏁帮紙鍖呭惈min鍜宮ax鍊硷級锛屼緥濡傝繑鍥�1-3涔嬮棿鐨勯殢鏈烘暟锛岄偅涔堣繑鍥�1鎴�2鎴�3閮芥槸姝ｇ‘鐨勶紝杩斿洖4灏变笉瀵广�� (5鍒�)
      //min =1  max =3 
	public static int random(int min, int max){
		Random r  = new Random();
	 return r.nextInt(max-min +1) +min;
	}	
	
	
	//鏂规硶2锛氬湪鏈�灏忓�糾in涓庢渶澶у�糾ax涔嬮棿鎴彇subs涓笉閲嶅鐨勯殢鏈烘暟銆備緥濡傚湪1-10涔嬮棿鍙�3涓笉閲嶅鐨勯殢鏈烘暟锛岄偅涔圼2,6,9]鏄鐨勶紝[3,5,5]鍒欎笉瀵癸紝鍥犱负5閲嶅浜嗐��
	//搴旂敤鍦烘櫙锛氬湪100绡囨枃绔犱腑闅忔満鍙�10绡囨枃绔狅紝鏈堣�冨彲鑳戒細浣跨敤鍒般�� (8鍒�)
	//1~~10  
	public static int[] subRandom (int min, int max, int subs){
		//鐩爣鏁扮粍
		int dest[] =new int[subs];
		
		HashSet<Integer> set = new HashSet<Integer>();
		//寰幆浜х敓闅忔満鏁�,鐩村埌闆嗗悎婊¤冻涓暟
		while(set.size()!=subs) {
			set.add(random(min,max));
		}
		//閬嶅巻set鏀惧叆鏁扮粍
		int i=0;
		for (Integer integer : set) {
			dest[i]=integer;
			i++;
		}
		
		return dest;
	}
	//鏂规硶3锛氳繑鍥�1涓�1-9,a-Z涔嬮棿鐨勯殢鏈哄瓧绗︺�� (8鍒�)
	public static char randomCharacter (){
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return str.charAt(random(0, str.length()-1));
		
	}
	//鏂规硶4锛氳繑鍥炲弬鏁發ength涓瓧绗︿覆(5鍒�)锛屾柟娉曞唴閮ㄨ璋冪敤randomCharacter()鏂规硶 (4鍒�)
	public static String randomString(int length){
		String str="";
		for(int i =0;i<length;i++) {
		 	str+=randomCharacter();
		}
		return str;
		
	}

}
