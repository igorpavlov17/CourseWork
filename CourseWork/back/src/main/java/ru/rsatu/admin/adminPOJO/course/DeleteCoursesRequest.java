package ru.rsatu.admin.adminPOJO.course;

public class DeleteCoursesRequest {

    private Long courseId;

    public DeleteCoursesRequest() {
    }

    public DeleteCoursesRequest(Long courseId) {
        this.courseId = courseId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
}
