package com.cnu.mentoring.vineet.cdp.collections.homeTask_1;

public class Driver {
    public static void main(String[] args) {
        CollectionsTasks tasks = new CollectionsTasks();
        tasks.arrayListExample();
        tasks.linkedListExample();
        tasks.hashmapExample();
        tasks.linkedHashMapExample();
        tasks.hashSetExample();
        tasks.treeSetExample();
        tasks.treeMapExample();

        // Additional Task
        studentOperations();
    }

    public static void studentOperations(){

        StudentUtils studentUtils = new StudentUtils();

        Student ajay = new Student(10,"Ajay", 90);
        Student vijay = new Student(13,"Vijay", 57);
        Student sanjay = new Student(14,"Sanjay", 69);
        Student prajay = new Student(18,"Prajay", 77);

        studentUtils.addNewStudent(ajay);
        studentUtils.addNewStudent(vijay);
        studentUtils.addNewStudent(sanjay);
        studentUtils.addNewStudent(prajay);

        studentUtils.displayStudentDetails();

        studentUtils.addNewStudent(new Student(10,"Ajith", 100));
        studentUtils.modifyStudent(14, new Student(14,"Sanjith", 69));
        studentUtils.removeStudent(10);

        studentUtils.displayStudentDetails();
    }
}
