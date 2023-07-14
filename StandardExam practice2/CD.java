package Standard;

import java.util.Objects;

public class CD extends LendingItem{
    private String productId;
    private String title;
    private String company;

    public CD(String productId, String title, String company) {
        super();
        this.productId = productId;
        this.title = title;
        this.company = company;
    }

    public String getProductId() {
        return productId;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public int getNumCopiesInLib() {
        return 0;
    }

    @Override
    public void setNumCopiesInLib(int numCopiesInLib) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CD cd)) return false;
        return productId.equals(cd.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}
