package entity;

import javax.persistence.*;

@Entity(name = "laptop_table")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lap_id")
    private long lapId;
    private String brand;

    //------------mapping---------------
    @OneToOne(mappedBy = "laptop") // mapped to field in Student class, where this Private Laptop laptop//
    private Student student;

    //------------mapping---------------

    public Laptop(long lapId, String brand) {
        this.lapId = lapId;
        this.brand = brand;
    }

    public Laptop() {
    }

    public long getLapId() {
        return lapId;
    }

    public void setLapId(long lapId) {
        this.lapId = lapId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
