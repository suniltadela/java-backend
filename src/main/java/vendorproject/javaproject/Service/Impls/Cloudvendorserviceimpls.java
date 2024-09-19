package vendorproject.javaproject.Service.Impls;

import org.springframework.stereotype.Service;
import vendorproject.javaproject.Repositary.CloudvendorReopsitory;
import vendorproject.javaproject.Service.CloudvendorService;
import vendorproject.javaproject.model.Cloudvendor;
@Service
public class Cloudvendorserviceimpls implements CloudvendorService {
    CloudvendorReopsitory cloudvendorReopsitory;
    public Cloudvendorserviceimpls(CloudvendorReopsitory cloudvendorReopsitory) {
        this.cloudvendorReopsitory = cloudvendorReopsitory;
    }


    @Override
    public String createvendordetails(Cloudvendor cloudvendor) {
        cloudvendorReopsitory.save(cloudvendor);
        return "succesfully created";
    }

    @Override
    public String updatevendordetails(Cloudvendor cloudvendor) {
        cloudvendorReopsitory.save(cloudvendor);
        return "succesfully updated";
    }

    @Override
    public Cloudvendor getvendordetail(String vendorid) {
        return cloudvendorReopsitory.findById(vendorid).get();
    }

    @Override
    public String deletevendordetails(String vendorid) {
        cloudvendorReopsitory.deleteById(vendorid);
        return "succesfully deleted";
    }
}
