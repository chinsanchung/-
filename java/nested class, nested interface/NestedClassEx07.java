package ch16;

import java.util.HashMap;

public class NestedClassEx07 {

	public static void main(String[] args) {
	//����ó ���α׷��� ����ó Ŭ����
		class ContactInfo {
			String address;
			String phoneNo;
			ContactInfo(String address, String phoneNo) {
				this.address = address;
				this.phoneNo = phoneNo;
			}
		}
		HashMap<String, ContactInfo> hashtable = new HashMap<String, ContactInfo>();
		hashtable.put("Lee", new ContactInfo("����� ������", "02-111-1111"));
		hashtable.put("Han", new ContactInfo("����� ���ϱ�", "02-222-2222"));
		hashtable.put("Park", new ContactInfo("��⵵ ����", "031-333-3333"));
		ContactInfo obj = hashtable.get("Han");
		System.out.println("<Han's phoneNo>");
		System.out.println("address: " + obj.address);
		System.out.println("phoneNo: " + obj.phoneNo);

	}

}
