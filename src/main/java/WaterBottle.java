public class WaterBottle {
    public int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    //methods go here


    public int getVolume() {
        return volume;
    }

    public void haveDrink() {
        this.volume -= 10;
    }

    public int empty() {
        this.volume = 0;
        return this.volume;
    }


    public void fill() {
        this.volume = 100;
    }
}
