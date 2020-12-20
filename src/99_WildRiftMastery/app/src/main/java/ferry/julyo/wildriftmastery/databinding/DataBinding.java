package ferry.julyo.wildriftmastery.databinding;

public class DataBinding {
    private String studentName;
    private String studentNim;
    private String studentMatkul;

    public DataBinding(String studentName, String studentMatkul, String studentNim){
        this.studentName = studentName;
        this.studentNim = studentNim;
        this.studentMatkul = studentMatkul;
    }

    public DataBinding(){

    }

    public String getStudentName() {

        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNim() {
        return studentNim;
    }

    public void setStudentNim(String studentNim) {
        this.studentNim = studentNim;
    }


    public String getStudentMatkul(){
        return studentMatkul;
    }

    public void setStudentMatkul(String studentMatkul){
        this.studentMatkul = studentMatkul;
    }
}
