public class CreateRecharge
{
    IRechargeVendor vendor;
    IRechargeDataBaseRepository dbRepository;

    public CreateRecharge(IRechargeVendor vendor, IRechargeDataBaseRepository dbRepository) {
        this.vendor = vendor;
        this.dbRepository = dbRepository;
    }

    public execute(RechargeDTO rechargeDto){
        
    }
}
