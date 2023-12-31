package com.nudgenow.nudgesurvey.models;



import java.util.List;

public class MoodBoard {
    private String questionType;
    private String question;
    private String description;
    private List<String> options;
    private String sId;
    private List<AttachmentType> attachments;

    public MoodBoard(String questionType, String question, String description, List<String> options, String sId, List<AttachmentType> attachments) {
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

    public String getQuestion() {
        return question;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getOptions() {
        return options;
    }

    public String getsId() {
        return sId;
    }

    public List<AttachmentType> getAttachments() {
        return attachments;
    }

    public static class AttachmentType {
        // You would need to define the fields and methods for the AttachmentType class here.
        // This class would have similar fields and methods as the MoodBoard class.
    }
}
