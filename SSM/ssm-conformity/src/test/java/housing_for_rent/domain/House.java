package housing_for_rent.domain;

public class House {
    private int id;
    private String name;
    private String phone;
    private String address;
    private int mon_rent;
    private String state;

    public House(String name, String phone, String address, int mon_rent, String state) {
//        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.mon_rent = mon_rent;
        this.state = state;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMon_rent() {
        return mon_rent;
    }

    public void setMon_rent(int mon_rent) {
        this.mon_rent = mon_rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return id +
                "\t\t" + name +
                "\t\t" + phone +
                "\t\t" + address +
                "\t\t" + mon_rent +
                "\t\t" + state;
    }
}
