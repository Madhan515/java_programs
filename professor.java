
class UniversityMember {
    int MemberId;

    void checkIn() {
        System.out.println(MemberId + " Checked IN!");
    }
}

class Staff extends UniversityMember {
    String department;

    void attendMeeting() {
        System.out.println("Attend Meeting: " + department);
    }
}

class Professor extends Staff {
    String Subject;

    void conductLecture() {
        System.out.println("Conduct Lecture: " + Subject);
    }
}

class AdminOfficer extends Staff {
    String OfficeRoom;

    void processFiles() {
        System.out.println("Process Files: " + OfficeRoom);
    }
}

public class professor {
    public static void main(String[] args) {

        Professor p = new Professor();
        AdminOfficer a = new AdminOfficer();

        
        p.MemberId = 1;
        p.department = "Computer Science Engineering";
        p.Subject = "Cyber Security";

        p.checkIn();
        p.attendMeeting();
        p.conductLecture();

        System.out.println("---------");

        
        a.MemberId = 2;
        a.department = "Artificial Intelligence";
        a.OfficeRoom = "Student Files Verifying!";

        a.checkIn();
        a.attendMeeting();
        a.processFiles();
    }
}
