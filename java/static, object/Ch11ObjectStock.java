
class Ch11ObjectStock {
	String stockCode;
	int stockNum;
	Ch11ObjectStock(String stockCode, int stockNum) {
		this.stockCode = stockCode;
		this.stockNum = stockNum;
	}
	public String toString() {
		String str = "��ǰ�ڵ�: " + stockCode + "������: " + stockNum;
		return str;
	}
	
	
}
