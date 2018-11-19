public class Printer {
    public int sheetsRemaining;
    public int tonerVolume;

    public Printer(int sheetsRemaining, int tonerVolume){
        this.sheetsRemaining = sheetsRemaining;
        this.tonerVolume = tonerVolume;
    }

    //methods

    public int getSheetsRemaining() {
        return sheetsRemaining;
    }


    public void print(int n1, int n2) {
        int sheetsUsed = (n1 * n2);
        if ((this.sheetsRemaining >= sheetsUsed)&&(this.tonerVolume >= sheetsUsed)){
            this.sheetsRemaining -= sheetsUsed;
            this.tonerVolume -= sheetsUsed;
        }
    }

    public void refill(int i) {
        this.sheetsRemaining += i;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }
}
