package Standard;

import java.util.*;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		for (LibraryMember mem : members) {
			var chk = mem.getCheckoutRecord();
			for (CheckoutRecordEntry cor : chk.getCheckoutRecordEntry()) {
				if (cor.getItem().equals(item)){
					phoneNums.add(mem.getPhone());
				}
			}
			Collections.sort(phoneNums);
		}
		return phoneNums;

	}



}