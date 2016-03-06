
public class GetExcelColumnNumberFromName {
	
	public int getColNum(String colName){
		colName = colName.trim();
		StringBuffer buff =  new StringBuffer(colName);
		char chars[] = buff.reverse().toString().toLowerCase().toCharArray();
		int retVal = 0, multiplier = 0;
		for(int i = 0; i < chars.length; i++){
			multiplier = (int)chars[i] - 96;
			retVal += multiplier * Math.pow(26,i);
		}
		
		return retVal;
	}

}
