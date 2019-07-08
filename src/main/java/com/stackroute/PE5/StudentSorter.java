package com.stackroute.PE5;
import java.util.Comparator;


public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        //check if age of students is same

        if(student1.getAge() == student2.getAge()) {
            //if age same then check with names

            if(student1.getName().compareTo(student2.getName()) == 0)
                //if names are also same then check with id
                return student1.getId().compareTo(student2.getId());

            else
                //if names are not same
                return student1.getName().compareTo(student2.getName());
        }

        else if(student1.getAge()>student2.getAge())
            //if ages are not same(student 1 age is greater than student2)
            return 1;

        else
            //if student2 age is greater than student1
            return -1;
    }
}
