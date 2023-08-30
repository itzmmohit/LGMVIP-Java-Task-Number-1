package currencies;
public class KYD extends converter {
    public KYD() {
        INR=99.221;
        USD=1.2;
        EUR=1.1042;
        GBP=0.9501;
        KWD=0.3700;
        JPY=175.39;
        KYD=1.0;
    }
    public double KYDToINR (double dollars) { return (dollars*INR); }

    public double KYDToEUR (double dollars) { return (dollars*EUR); }

    public double KYDToGBP (double dollars) { return (dollars*GBP); }

    public double KYDToJPY (double dollars) { return (dollars*JPY); }

    public double KYDToUSD (double dollars) { return (dollars*USD); }

    public double KYDToKWD (double dollars) { return (dollars*KWD); }
}
