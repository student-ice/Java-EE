package cn.edu.sxgkd.entity;

public class StudentAndCardBusiness extends Student {
    private int cardId;
    private String cardInfo;

    public StudentAndCardBusiness(int cardId, String cardInfo) {
        this.cardId = cardId;
        this.cardInfo = cardInfo;
    }

    public StudentAndCardBusiness() {
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }
}
