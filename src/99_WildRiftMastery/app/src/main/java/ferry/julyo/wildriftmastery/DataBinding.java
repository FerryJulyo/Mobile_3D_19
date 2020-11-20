package ferry.julyo.wildriftmastery;

public class DataBinding {
    private String Name;
    private String Nim;
    private String Matkul;
    private String Akun;

    public DataBinding(String Name,String Matkul, String Akun, String Nim){
        this.Name = Name;
        this.Nim = Nim;
        this.Matkul = Matkul;
        this.Akun = Akun;
    }

    public DataBinding(){

    }

    public String getName() {

        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String Nim) {
        this.Nim = Nim;
    }

    public String getAkun() {

        return Akun;
    }

    public void setAkun(String Akun){
        this.Akun = Akun;
    }

    public String getMatkul(){
        return Matkul;
    }

    public void setMatkul(String Matkul){
        this.Matkul = Matkul;
    }
}