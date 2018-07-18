public class PlayingCat {
    public static void main(String[] args) {
        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);
    }

    // Write a method, isCatPlaying, that takes 2 parameters, and returns true if cat is playing.
    // Parameters = [
    //      { name: "summer", type: "boolean"},
    //      { name: "temperature", type: "int" }
    // ]
    // The cats play if the temperature is between 25 and 35
    // During the summer, the cats play if the temperature is between 25 and 45.
    // I'm going to assume this is celsius...
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if  (temperature >= 25 && temperature <= 45 ) {
                return true;
            }
            return false;
        }
        if  (temperature >= 25 && temperature <= 35 ) {
            return true;
        }
        return false;
    }
}
