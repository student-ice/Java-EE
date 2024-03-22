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

    @Override
    public String toString() {
        return "学号:" + this.getStuNo() + "\t姓名:" + this.getStuName()
                + "\t年龄:" + this.getStuAge() + "\t年级:" + this.getGraName() + "\t学生证Id:" + this.cardId + "\t学生证信息:" + this.cardInfo;
    }
}
