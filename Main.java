import pengguna.Mhs;

class Main {
    public static void main(String[] args) {
        
        Mhs mhs = new Mhs("ini_username", "ini_password");

        mhs.setNama("Naufhal Ardyansyah Wibowo");
        mhs.setNim("G.111.20.0006");
        mhs.setSmt(6);

        System.out.println("Nama Mhs: " + mhs.getNama());
        System.out.println("Nim Mhs: " + mhs.getNim());
        System.out.println("Smt Mhs: " + mhs.getSmt());
        System.out.println("Username: " + mhs.getUsername());
        System.out.println("Password: " + mhs.getPassword());


    }
}