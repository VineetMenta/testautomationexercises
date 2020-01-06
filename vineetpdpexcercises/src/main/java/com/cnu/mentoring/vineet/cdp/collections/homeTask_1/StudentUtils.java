package com.cnu.mentoring.vineet.cdp.collections.homeTask_1;

import java.util.HashMap;
import org.apache.log4j.Logger;

public class StudentUtils {

    private static final Logger LOGGER = Logger.getLogger(StudentUtils.class);
    private HashMap<Integer, Student> studentDetails = new HashMap<>();

    public void addNewStudent(Student student) {
        if (!studentDetails.containsKey(student.getStudentId()))
            studentDetails.put(student.getStudentId(), student);
        else
            LOGGER.info("This student with same ID is already added please add a new student");
    }

    public void removeStudent(int studentId){
        if(studentDetails.containsKey(studentId))
            studentDetails.remove(studentDetails.get(studentId));
        else
            LOGGER.info("The student with given ID is not available. Please try again with a valid Student ID");
    }

    public void modifyStudent(int studentId, Student student){
        if(studentDetails.containsKey(studentId)){
            studentDetails.remove(studentId);
            addNewStudent(student);
        }
        else
            LOGGER.info("The student with the given ID is not available. Please try with a valid Student ID");
    }

    public void displayStudentDetails(){
        LOGGER.info(studentDetails);
    }
}
