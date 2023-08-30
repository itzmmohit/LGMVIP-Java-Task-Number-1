package currencies;
public class USD extends converter {
    public USD () {
        INR=82.684;
        USD=1.0;
        EUR=0.9200;
        GBP=0.7917;
        KWD=0.3084;
        JPY=146.16;
        KYD=0.8333;
    }

    public double USDToINR (double dollars) {
        return (dollars*INR);
    }

    public double USDToEUR (double dollars) {
        return (dollars*EUR);
    }

    public double USDToGBP (double dollars) {
        return (dollars*GBP);
    }

    public double USDToJPY (double dollars) {
        return (dollars*JPY);
    }

    public double USDToKWD (double dollars) {
        return (dollars*KWD);
    }

    public double USDToKYD (double dollars) {
        return (dollars*KYD);
    }
}