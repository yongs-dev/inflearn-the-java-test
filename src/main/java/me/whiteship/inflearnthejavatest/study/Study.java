package me.whiteship.inflearnthejavatest.study;

public class Study {
    private StudyStatus status = StudyStatus.DRAFT;

    public StudyStatus getStatus() {
        return this.status;
    }

    private int limit;

    public int getLimit() {
        return this.limit;
    }

    private String name;

    public String getName() {
        return name;
    }

    public Study(int limit) {
        if(limit < 0) {
            throw new IllegalArgumentException("limit 0보다 커야한다.");
        }
        this.limit = limit;
    }

    public Study(int limit, String name) {
        this.limit = limit;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Study{" +
                "status=" + status +
                ", limit=" + limit +
                ", name='" + name + '\'' +
                '}';
    }
}
