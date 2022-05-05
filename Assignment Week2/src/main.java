public class main {
    public static void main(String[] args){
        Account anAccount = new Account("PhamAnhDuong");
        anAccount.setSoDu(20194532d);
        //Rut Tien
        anAccount.rutTien(100d);
        System.out.println(anAccount.getSoDu());
        //Nhan Tien
        anAccount.nhanTien(200d);
        System.out.println(anAccount.getSoDu());
    }
}
