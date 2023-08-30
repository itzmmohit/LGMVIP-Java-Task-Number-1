package currencies;
public class KWD extends converter {
    public KWD() {
        INR=268.14;
        USD=3.2430;
        EUR=2.9836;
        GBP=2.5675;
        KWD=1.0;
        JPY=474.00;
        KYD=2.7025;
    }

    public double KWDToINR (double dinar) { return (dinar*INR); }

    public double KWDToEUR (double dinar) { return (dinar*EUR); }

    public double KWDToGBP (double dinar) { return (dinar*GBP); }

    public double KWDToJPY (double dinar) { return (dinar*JPY); }

    public double KWDToUSD (double dinar) { return (dinar*USD); }

    public double KWDToKYD (double dinar) { return (dinar*KYD); }
}
