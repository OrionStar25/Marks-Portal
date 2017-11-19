
package result;

//assuming A+ at 90,B+ at 80, B at 70, C at 60 D at 50
//total marks = 100
//total attendance out of 30


public class student {
    String rollno,grade;
    int attendance;
    int leave;
    int ass1,ass2,ass3,ass4,ass5,mid1,mid2,end1,end2,mid_marks;
    double result,tot_att;
    int p1,p2,p3;
    
    student(String roll,int att,int leave,int ass1,int ass2,int ass3,int ass4,int ass5,int mid1,int mid2,int end1,int end2,int p1,int p2,int p3)
    {
        rollno = roll;
        attendance = att;
        this.leave = leave;
        this.ass1 = ass1;
        this.ass2 = ass2;
        this.ass3 = ass3;
        this.ass4 = ass4;
        this.ass5 = ass5;
        this.mid1 = mid1;
        this.mid2 = mid2;
        this.end1 = end1;
        this.end2 = end2;
        
        this.calculate(p1,p2,p3);
    }
    
    void calculate(int p1,int p2,int p3)
    {
        if(mid1 > mid2)
        {
            mid_marks = mid1;
        }
        else
        {
            mid_marks = mid2;
        }
        
        result = (mid_marks + ass1 + ass2 + ass3 + ass4 + ass5 + end1 + end2)*100/800.0;
        tot_att = (attendance + leave)*100/30.0;
        
        if(tot_att >= 75)
        {
            if(result >= p1)
            {
                grade = "A+";
            }
            else
            if(result >= p2)
            {
                grade = "B+";
            }
            else
            if(result >= p3)
            {
                grade = "B";
            }
            else
            {
                grade = "F";
            } 
        }
        else
        {
            grade = "F";
        }
    }
}
