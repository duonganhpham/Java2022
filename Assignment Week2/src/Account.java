public class Account {
    private String tenTaiKhoan;
    private Double soDu;
    //contructor method
    public Account(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }
    public Account(String tenTaiKhoan, Double soDu) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.soDu = soDu;
    }
    //getter and setter
    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }
    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }
    public Double getSoDu() {
        return soDu;
    }
    public void setSoDu(Double soDu) {
        this.soDu = soDu;
    }
    //method 
    public void rutTien(Double x){
        soDu = soDu - x;
    }
    public void nhanTien(Double x){
        soDu = soDu + x;
    }
}
