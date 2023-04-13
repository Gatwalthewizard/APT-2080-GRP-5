package Payment;

public class Payment {

    private String receiptID;

    private String amount;

    private String date;

    private String method;

    private boolean isMobile;

    private boolean isCash;
    boolean paymentMethod;


    public void setReceiptID(String receiptID) {
        this.receiptID = receiptID;
    }

    public String getReceiptID() {
        return receiptID;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setMethod() {

    }

}
