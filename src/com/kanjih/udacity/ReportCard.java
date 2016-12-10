package com.kanjih.udacity;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Class responsible for store a student’s grades for a particular year
 * The class file is intended to represent a report card.
 * 
 * @author kanjih
 *
 */
public class ReportCard implements Serializable {
  
  private static final long serialVersionUID = 8164108848015100669L;
  
  private String className;
  private Integer classYear;
  private Double classAvgNotePercent;
  private ArrayList<StudentGrade> listClassGrades = new ArrayList<StudentGrade>();
  

  public ReportCard(String className, Integer classYear, Double classAvgNotePercent, 
      ArrayList<StudentGrade> listClassGrades) {
    super();
    this.className = className;
    this.classYear = classYear;
    this.classAvgNotePercent = classAvgNotePercent;
    this.listClassGrades = listClassGrades;
    
  }

  public ReportCard(String className, Integer classYear,  Double classAvgNotePercent) {
    super();
    this.className = className;
    this.classYear = classYear;
    this.classAvgNotePercent = classAvgNotePercent;
    
  }
  
  
  public ReportCard(String className, Integer classYear) {
    super();
    this.className = className;
    this.classYear = classYear;
    this.classAvgNotePercent = 0d;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public Integer getClassYear() {
    return classYear;
  }

  public void setClassYear(Integer classYear) {
    this.classYear = classYear;
  }

  public Double getClassAvgNotePercent() {
    return classAvgNotePercent;
  }

  public void setClassAvgNotePercent(Double classAvgNotePercent) {
    this.classAvgNotePercent = classAvgNotePercent;
  }
 

  public ArrayList<StudentGrade> getListClassGrades() {
    return listClassGrades;
  }

  public void setListClassGrades(ArrayList<StudentGrade> listClassGrades) {
    this.listClassGrades = listClassGrades;
  }
  
  public void addClassGrades(StudentGrade studentGrade){
    this.calculateAvg(studentGrade);
    listClassGrades.add(studentGrade);
    
  }
  
  public void addClassGrades(String idStudent, int gradePercent){
    StudentGrade studentGrade = new StudentGrade(idStudent, gradePercent);
    this.calculateAvg(studentGrade);
    listClassGrades.add(studentGrade);
    
  }
  
  private void calculateAvg(StudentGrade studentGrade){
    double value = classAvgNotePercent.doubleValue() * listClassGrades.size();
    value = ( value + studentGrade.getGradePercent()) / (listClassGrades.size() + 1);
    classAvgNotePercent = value;
    
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    StringBuilder ret = new StringBuilder();
    ret.append("Class: ").append(className).append(" year: ")
    .append(classYear).append(" class grade:").append(classAvgNotePercent)
    .append("\n").append("By Students:\n");
    
    for(StudentGrade studentGrade : listClassGrades) {
      ret.append(studentGrade.toString()).append("\n");
    }
    
    return ret.toString();
  }
  
  
  
  
}


class StudentGrade {
  
  private String idStudent;
  private Integer gradePercent;
  
  
  public StudentGrade(String idStudent) {
    super();
    this.idStudent = idStudent;
  }
  
  public StudentGrade(String idStudent, Integer classNotePercent) {
    super();
    this.idStudent = idStudent;
    this.gradePercent = classNotePercent;
  }

  public String getIdStudent() {
    return idStudent;
  }

  public void setIdStudent(String idStudent) {
    this.idStudent = idStudent;
  }

  public Integer getGradePercent() {
    return gradePercent;
  }

  public void setGradePercent(Integer gradePercent) {
    this.gradePercent = gradePercent;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public String toString() {
   return "Student:" + idStudent + " grade:" +  gradePercent;
  }
  
  
}
