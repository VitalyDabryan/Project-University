package model;

import allComparator.StudComparator;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement(name = "studentEntry")
@XmlType(propOrder = { "fullName", "universityId", "avgExamScore" })
public class Student implements StudComparator<Student> {
    @SerializedName("fullName")
    String fullName;
    @SerializedName("IdUniversity") String universityId;
    @SerializedName("course") double currentCourseNumber;
    @SerializedName("avgScore") double avgExamScore;

    public Student(String fullName, String universityId, double currentCourseNumber, double avgExamScore) {
        this.fullName = fullName;
        this.universityId = universityId;
        this.currentCourseNumber = currentCourseNumber;
        this.avgExamScore = avgExamScore;
    }

    public Student(String fullName, String universityId, double avgExamScore) {
        this.fullName = fullName;
        this.universityId = universityId;
        this.avgExamScore = avgExamScore;
    }

    public Student() {
     }

     @XmlElement(name = "fullName") public String getFullName() {
        return fullName;
    }

    @XmlElement(name = "universityId") public String getUniversityId() {
        return universityId;
    }

    @XmlTransient
    public double getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    @XmlElement(name = "avgExamScore") public double getAvgExamScore() {
        return avgExamScore;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public void setAvgExamScore(double avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    @Override
    public String toString() {
        return "model.Student{" +
                "fullName='" + fullName + '\'' +
                ", universityId='" + universityId + '\'' +
                ", currentCourseNumber=" + currentCourseNumber +
                ", avgExamScore=" + avgExamScore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Double.compare(student.getCurrentCourseNumber(),
                getCurrentCourseNumber()) == 0 && Double.compare(student.getAvgExamScore(),
                getAvgExamScore()) == 0 && getFullName().equals(student.getFullName()) &&
                getUniversityId().equals(student.getUniversityId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getUniversityId(),
                getCurrentCourseNumber(), getAvgExamScore());
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}
