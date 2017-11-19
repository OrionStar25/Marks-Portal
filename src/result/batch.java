/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package result;

import java.util.*;

/**
 *
 * @author orionstar
 */
public class batch {
    
    student[] students;
    int n;
    
    batch()
    {
        students = new student[300];
        n=0;
    }
    public void fill_student(student s)
    {
        students[n] = s;
        n++;
    }
    
    public student search(String rollno)
    {
        int i;

        for(i=0;i<n;i++)
        {
            if(students[i] != null && rollno.compareTo(students[i].rollno) == 0)
            {
                return students[i];
            }
        }
        return null;
    }
    
    void delete(student s)
    {
        int i;
        
        for(i=0;i<n;i++)
        {
            if(students[i] != null && s.rollno.compareTo(students[i].rollno) == 0)
            {
                students[i] = null;
                return;
            }
        }
    }
    
}
