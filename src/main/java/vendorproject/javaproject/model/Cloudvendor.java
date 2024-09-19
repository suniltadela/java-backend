package vendorproject.javaproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="check_vendor_table")
public class Cloudvendor {
    @Id
    private String vendorid;
    private String vendorname;
    private String vendorage;
    private String vendoradress;
    public Cloudvendor() {
    }
    public Cloudvendor(String vendorid, String vendorname, String vendorage, String vendoradress) {
        this.vendorid = vendorid;
        this.vendorname = vendorname;
        this.vendorage = vendorage;
        this.vendoradress = vendoradress;
    }
    public String getVendorid() {
        return vendorid;
    }

    public void setVendorid(String vendorid) {
        this.vendorid = vendorid;
    }

    public String getVendorname() {
        return vendorname;
    }

    public void setVendorname(String vendorname) {
        this.vendorname = vendorname;
    }

    public String getVendorage() {
        return vendorage;
    }

    public void setVendorage(String vendorage) {
        this.vendorage = vendorage;
    }

    public String getVendoradress() {
        return vendoradress;
    }

    public void setVendoradress(String vendoradress) {
        this.vendoradress = vendoradress;
    }
}
