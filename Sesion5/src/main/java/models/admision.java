package models;

public class admision {
}

/**
 * @param student
 */

public void calcScholarship(Student student){
    if(student.getAverage() >= 80){
        student.setScholarship(true);
    } else {
        student.setScholarship(false);
    }
}
}
