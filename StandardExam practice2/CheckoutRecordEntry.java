package Standard;

import java.time.LocalDate;

public class CheckoutRecordEntry {


   private LendingItem item;
    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private ItemType type;

    public CheckoutRecordEntry(LendingItem item, LocalDate checkoutDate, LocalDate dueDate, ItemType type) {
        this.item = item;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.type = type;
    }

    public LendingItem getItem() {
        return item;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public ItemType getType() {
        return type;
    }
}
