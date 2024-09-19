package vendorproject.javaproject.Service;

import vendorproject.javaproject.model.Cloudvendor;

public interface CloudvendorService {
    public String createvendordetails(Cloudvendor cloudvendor);
    public String updatevendordetails(Cloudvendor cloudvendor);
    public Cloudvendor getvendordetail(String vendorid);
    public String deletevendordetails(String vendorid);
//    public <List>Cloudvendor
}
