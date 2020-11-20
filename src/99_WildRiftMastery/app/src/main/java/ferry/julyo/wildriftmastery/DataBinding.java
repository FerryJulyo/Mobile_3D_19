package ferry.julyo.wildriftmastery;

public class DataBinding {
    private String studentName;
    private String studentNim;
    private String studentMatkul;
    private String studentAkun;

    public DataBinding(String studentName, String studentMatkul, String studentAkun, String studentNim){
        this.studentName = studentName;
        this.studentNim = studentNim;
        this.studentMatkul = studentMatkul;
        this.studentAkun = studentAkun;
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

    public String getStudentAkun() {

        return studentAkun;
    }

    public void setStudentAkun(String studentAkun){
        this.studentAkun = studentAkun;
    }

    public String getStudentMatkul(){
        return studentMatkul;
    }

    public void setStudentMatkul(String studentMatkul){
        this.studentMatkul = studentMatkul;
    }
}
