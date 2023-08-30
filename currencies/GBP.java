package currencies;
public class GBP extends converter {
    public GBP () {
        INR=104.44;
        USD=1.2631;
        EUR=1.1621;
        GBP=1.0;
        KWD=0.3895;
        JPY=184.61;
        KYD=1.0526;
    }
    public double GBPToINR (double pounds) { return (pounds*INR); }

    public double GBPToUSD (double pounds) { return (pounds*USD); }

    public double GBPToEUR (double pounds) { return (pounds*EUR); }

    public double GBPToJPY (double pounds) { return (pounds*JPY); }

    public double GBPToKWD (double pounds) { return (pounds*KWD); }

    public double GBPToKYD (double pounds) { return (pounds*KYD); }
}

