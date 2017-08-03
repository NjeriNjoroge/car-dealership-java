//business logic
class Vehicle{
  private int mPrice;
  private int mYear;
  private int mMiles;
  private String mBrand;
  private String mModel;
//constructor
  public Vehicle(int year, String brand, String model, int miles, int price) {
     mYear = year;
     mBrand = brand;
     mModel = model;
     mMiles = miles;
     mPrice = price;
   }

  public boolean worthBuying(int maxPrice){
    return (mPrice < maxPrice);
  }

  public int getPrice(){
    return mPrice;
  }

  public int getYear(){
    return mYear;
  }

  public int getMiles(){
    return mMiles;
  }

  public String getModel(){
    return mModel;
  }

  public String getBrand(){
    return mBrand;
  }
}
