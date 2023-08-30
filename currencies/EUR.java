package currencies;
public class EUR extends converter {
    public EUR () {
        INR=89.871;
        USD=1.0869;
        EUR=1.0;
        GBP=0.8605;
        KWD=0.3352;
        JPY=158.86;
        KYD=0.9056;
    }
    public double EURToINR (double euros) { return (euros*INR); }

    public double EURToUSD (double euros) { return (euros*USD); }

    public double EURToGBP (double euros) { return (euros*GBP); }

    public double EURToJPY (double euros) { return (euros*JPY); }

    public double EURToKWD (double euros) { return (euros*KWD); }

    public double EURToKYD (double euros) { return (euros*KYD); }
}
