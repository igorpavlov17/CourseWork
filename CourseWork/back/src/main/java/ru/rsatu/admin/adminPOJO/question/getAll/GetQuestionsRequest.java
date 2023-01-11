package ru.rsatu.admin.adminPOJO.question.getAll;

public class GetQuestionsRequest {

    private Long studyProgramId;

    public GetQuestionsRequest() {
    }

    public GetQuestionsRequest(Long studyProgramId) {
        this.studyProgramId = studyProgramId;
    }

    public Long getStudyProgramId() {
        return studyProgramId;
    }

    public void setStudyProgramId(Long studyProgramId) {
        this.studyProgramId = studyProgramId;
    }
}
