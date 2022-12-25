public class Radio {
    private int currentStation;
    private int currentVolume;
    private  int maxStation;

    public Radio () {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount -1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation ++;

        } else {
            currentStation = 0;
        }

    }
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;

        } else {
            currentStation = maxStation;
        }

    }

    public void decreaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
    }






}
