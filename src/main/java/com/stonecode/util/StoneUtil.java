package com.stonecode.util;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class StoneUtil {
	 
	 public static boolean isStringNotEmpty(String param){
		 if(param!=null&&!param.isEmpty()){
			 return true;
		 }
		 return false;
	 }
	 
	 public static String getCurrentTimeString(boolean isYear,boolean isMonth,boolean isDay,boolean isHour,boolean isMinute,boolean isSecond,boolean isMillisecond) {
		 Calendar calendar=Calendar.getInstance();
		 String key="";
		 if(isYear){
			 key+=calendar.get(Calendar.YEAR);
		 }
		 if(isMonth){
			 key+=calendar.get(Calendar.MONTH);
		 }
		 if(isDay){
			 key+=calendar.get(Calendar.DAY_OF_MONTH);
		 }
		 if(isHour){
			 key+=calendar.get(Calendar.HOUR_OF_DAY);
		 }
		 if(isMinute){
			 key+=calendar.get(Calendar.MINUTE);
		 }
		 if(isSecond){
			 key+=calendar.get(Calendar.SECOND);
		 }
		 if(isMillisecond){
			 key+=calendar.get(Calendar.MILLISECOND);
		 }
		return key;
	 }
	 
	 public static String getUniqueId() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	 }
	 
	 public static String getMixValicode(int length) { 
			String[] dic= { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J","K", "L", "M", "N",  "P", "Q", "R", "S", "T", "U", "V", "W","X", "Y",  "1", "2", "3", "4", "5", "6", "7", "8", "9" };
			String result="";
			for(int i=0;i<length;i++){
				int index =(int) Math.floor(Math.random() * 33); 
				result+=dic[index];
			}
			return result;
		}
	 
	 public static List<Integer> getPaginationRangeList(int currentPage,int totalPage){
		 List<Integer> pageIndexList=new ArrayList<>();
		 
		 int start=currentPage-2;
		 int end=currentPage+2;
		 if(currentPage-1<1){
			 start=start+2;
			 end=end+2;
		 }else if(currentPage-2<1){
			 start=start+1;
			 end=end+1;
		 }
		 if(currentPage+1>totalPage){
			 start=start-2;
			 end=end-2;
		 }else if(currentPage+2>totalPage){
			 start=start-1;
			 end=end-1;
		 }
		 for(int i=start;i<=end;i++){
			 if(i>=1&&i<=totalPage){
				 pageIndexList.add(i);
			 }
		 }
		 return pageIndexList;
	 }
	 
	 public static Map<String,Object> formatResult(String code,Map<String,Object> data){
		 Map<String,Object> result=new HashMap<>();
		 result.put(Constants.HTTP_CODE, code);
		 if(data!=null&&!data.isEmpty()){
			 result.put(Constants.HTTP_DATA, data);
		 }
		 return result;
	 }
	 
	public static void main(String[] args) {
		//System.out.println(getValicode(6));
		//sendEmail("shiruiaaa@qq.com","密码找回邮件","12345679");
		System.out.println("key"+System.currentTimeMillis());
		//System.out.println(MD5.encode("Abc123"));
	    // System.out.println(getCurrentTimeString(true,true,true,true,true,true,true));
		//System.out.println(getUniqueId());
		//System.out.println(getPaginationRangeList(19,20));
	}
}
