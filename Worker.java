public class Worker {

    private static int id = 1;
    private String name;
    private String phone;
    private String email;
    private int idWorker;

    public Worker(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.idWorker = Worker.id++;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getIdWorker() {
        return idWorker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Worker [name=" + name + ", phone=" + phone + ", email=" + email + ", idWorker=" + idWorker + "]";
    }

}
