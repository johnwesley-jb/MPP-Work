package Standard;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> checkoutRecordEntryList;
   // private CheckoutRecordEntry chkRecEntry;

    public List<CheckoutRecordEntry> getCheckoutRecordEntry() {
        return checkoutRecordEntryList;
    }

    public void addCheckoutEntry(CheckoutRecordEntry checkoutRecordEntry) {
        checkoutRecordEntryList=new ArrayList<>();
        checkoutRecordEntryList.add(checkoutRecordEntry);
    }
}
