package com.nudgenow.nudgesurvey.models;



import java.util.List;

public class RadioButton {
    private String questionType;
    private String question;
    private String description;
    private List<String> options;
    private String sId;
    private List<AttachmentType> attachments;

    public RadioButton() {
    }

    public RadioButton(String questionType, String question, String description, List<String> options, String sId, List<AttachmentType> attachments) {
        this.questionType = questionType;
        this.question = question;
        this.description = description;
        this.options = options;
        this.sId = sId;
        this.attachments = attachments;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public List<AttachmentType> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentType> attachments) {
        this.attachments = attachments;
    }
}
