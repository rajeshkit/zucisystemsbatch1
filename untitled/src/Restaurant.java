public class Restaurant {
    private int id;
    private String name;
    private String address;
    private long phone;
    private String doe;
    Restaurant(){

    }

    public Restaurant(int id, String name, String address, long phone, String doe) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.doe = doe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getDoe() {
        return doe;
    }

    public void setDoe(String doe) {
        this.doe = doe;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", doe='" + doe + '\'' +
                '}';
    }
}
