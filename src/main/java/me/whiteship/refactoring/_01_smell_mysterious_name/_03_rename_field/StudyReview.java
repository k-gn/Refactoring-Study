package me.whiteship.refactoring._01_smell_mysterious_name._03_rename_field;

// Record
// Java 14 version 부터 사용 가능
// Project - project, module 버전 확인 / Settings - compiler 버전 확인
public record StudyReview(String reviewer, String review) {

    // Method 도 만들 수 있다. (class 와 비슷하지만 다르다.)
    // VO, DTO 를 Record로 간단하게 만들 수 있다.
    public void print() {
        System.out.println("???");
    }
}
