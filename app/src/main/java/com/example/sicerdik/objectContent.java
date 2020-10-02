package com.example.sicerdik;

public class objectContent {
    private String textTipsAndtrik, textPengertian, textPengetahuanUmum, textBahayaDiabetes;

    public objectContent(String textTipsAndtrik, String textPengertian, String textPengetahuanUmum, String textBahayaDiabetes) {
        this.textTipsAndtrik = textTipsAndtrik;
        this.textPengertian = textPengertian;
        this.textPengetahuanUmum = textPengetahuanUmum;
        this.textBahayaDiabetes = textBahayaDiabetes;
    }

    public void setTextTipsAndtrik(String textTipsAndtrik) {
        this.textTipsAndtrik = textTipsAndtrik;
    }

    public void setTextPengertian(String textPengertian) {
        this.textPengertian = textPengertian;
    }

    public void setTextPengetahuanUmum(String textPengetahuanUmum) {
        this.textPengetahuanUmum = textPengetahuanUmum;
    }

    public void setTextBahayaDiabetes(String textBahayaDiabetes) {
        this.textBahayaDiabetes = textBahayaDiabetes;
    }

    public String getTextTipsAndtrik() {
        return textTipsAndtrik;
    }

    public String getTextPengertian() {
        return textPengertian;
    }

    public String getTextPengetahuanUmum() {
        return textPengetahuanUmum;
    }

    public String getTextBahayaDiabetes() {
        return textBahayaDiabetes;
    }
}
