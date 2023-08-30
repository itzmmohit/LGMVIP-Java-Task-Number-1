package currencies;
public class JPY extends converter {
    public JPY() {
        INR=0.5657;
        USD=0.006842;
        EUR=0.006295;
        GBP=0.005417;
        KWD=0.002110;
        JPY=1.0;
        KYD=0.005701;
    }

    public double JPYToUSD (double yen) { return (yen * USD); }

    public double JPYToEUR (double yen) { return (yen *EUR); }

    public double JPYToGBP (double yen) { return (yen * GBP); }

    public double JPYToINR (double yen) { return (yen * INR); }

    public double JPYToKWD (double yen) { return (yen * KWD); }

    public double JPYToKYD (double yen) { return (yen * KYD); }
}