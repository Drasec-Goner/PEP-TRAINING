// java provides abstract class for containing common members for subclasses !
// but what about uncommon members ?
// for that java provides interfaces, interface is used to keep uncommon members.

interface ownerEssentials{
    void activateDriver();
    void deactivateDriver();
    void setDriverStatus();
    void setDriverCommision();
    void checkReports();
    }
    
    interface driverEssentials{
    void acceptRide();
    void cancelRide();
    void checkCommission();
    void rateCustomer();
    void setStatus();
    }
    
    interface customerEssentials{
    void bookRide();
    void addMoneytoWallet();
    void payforRide();
    void scheduleRide();
    void rateDriver();
    }
    
    abstract class Authentication{
    public abstract void login();
    public abstract void signup();
    }
    
    class Owner extends Authentication implements ownerEssentials{
    
    @Override
    public void login() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void signup() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void activateDriver() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void deactivateDriver() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void setDriverStatus() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void setDriverCommision() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void checkReports() {
    // TODO Auto-generated method stub
    
    }
    
    }
    class Driver extends Authentication implements driverEssentials{
    
    @Override
    public void login() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void signup() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void acceptRide() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void cancelRide() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void checkCommission() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void rateCustomer() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void setStatus() {
    // TODO Auto-generated method stub
    
    }
    
    }
    class Customer extends Authentication implements customerEssentials{
    
    @Override
    public void login() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void signup() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void bookRide() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void addMoneytoWallet() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void payforRide() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void scheduleRide() {
    // TODO Auto-generated method stub
    
    }
    
    @Override
    public void rateDriver() {
    // TODO Auto-generated method stub
    
    }
    
    }
    
    
    public class Program {
    
    public static void main(String[] args) {
    
    // Instead of Creating the Object of Class , we shall create the object of Interface.
    
    ownerEssentials ownerOBJ = new Owner();
    
    driverEssentials driverOBJ = new Driver();
    
    customerEssentials customerOBJ = new Customer();
    
    // the summary with the help of creating objects of interface , we restricted
    // objects to be able to access only the functionalities defined in interface.
    
    // no object can access the functionality of other interfaces.
    
    // hence , hiding the unnecessary functions and showing only the relevant functions.
    // thanks to abstraction
    // we use interface and abstract classes to implement abstraction in java.
    
    }
    }