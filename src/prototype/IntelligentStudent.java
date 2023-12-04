package src.prototype;

public class IntelligentStudent extends Student {
    int IQ;

    IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.IQ = student.IQ;
    }

    IntelligentStudent(double averageBatchPsp, String batchName) {
        super(averageBatchPsp, batchName);
    }

    public IntelligentStudent clone() {
//        IntelligentStudent intelligentStudent = new IntelligentStudent();
//        intelligentStudent.batchName = this.batchName;
//        intelligentStudent.averageBatchPsp = this.averageBatchPsp;
//
//        return intelligentStudent;
        return new IntelligentStudent(this);
    }
}
