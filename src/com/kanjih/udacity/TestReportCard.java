package com.kanjih.udacity;

public class TestReportCard {
  
  public static void main(String [] args){
    ReportCard rep = new ReportCard("101", 2016);
    rep.addClassGrades("x1", 7);
    rep.addClassGrades("x2", 7);
    rep.addClassGrades("x3", 7);
    rep.addClassGrades("x4", 7);
    rep.addClassGrades("x5", 5);
    
    System.out.println(rep.toString());
    
  }

}
