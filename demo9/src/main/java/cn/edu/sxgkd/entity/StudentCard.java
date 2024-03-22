package cn.edu.sxgkd.entity;

public class StudentCard {
    private int cardId;
    private String cardInfo;

    public StudentCard() {
    }

    public StudentCard(int cardId, String cardInfo) {
        this.cardId = cardId;
        this.cardInfo = cardInfo;
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

    @Override
    public String toString() {
        return "学生证Id:" + this.cardId + "\t学生证信息:" + this.cardInfo;
    }
}
