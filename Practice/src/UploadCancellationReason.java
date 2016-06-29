
public enum UploadCancellationReason{

    UnknownError("unknown"),
    OldClient("old client"),
    NoOrderPlaced("no order placed"),
    AssetGeneration("asset generation"),
    UploadInProgress("upload");
    
//    static String countryCode = "XF";
//    static String cartCountryCode = "CA";

    private String value;

       
    public static UploadCancellationReason reasonWithValue(String value) {
        if(value!=null){
        for(UploadCancellationReason cur: UploadCancellationReason.values())
        {
            if(value.equalsIgnoreCase(cur.getValue())){
                return cur;
            }
        }
        }
        return null;
//    if (countryCode.equalsIgnoreCase("xf")) {
//    	System.out.println("sfgdht");
//        countryCode = "CA";
//    }
//
//    System.out.println("CountryCode: " +countryCode);
//    if (cartCountryCode == null) {
//       
//    } else if (!cartCountryCode.equalsIgnoreCase(countryCode)) {
//        throw new IllegalArgumentException("Provided country: "+cartCountryCode+" does not match store country: "+countryCode);
//        
//        
//    }
//    return cartCountryCode;
    }
    UploadCancellationReason(String value) {
        this.value = value;
    }

    public String getValue() {
    	return value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static void main(String args[]){
        
//        ShiftOperator.disp();
    	String str = null;
    	System.out.println("String str = " +str);
    	System.out.println("cur : " +reasonWithValue("upload"));
//    	System.out.println("cartCountryCode: " +cartCountryCode);
//    	System.out.println("countryCode: " +countryCode);
    }
    
}
