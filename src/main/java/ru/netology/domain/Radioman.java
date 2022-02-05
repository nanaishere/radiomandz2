package ru.netology.domain;

public class Radioman {

    private int maxStation;
    private int minStation;
    private int currentStation;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }

        this.currentVolume = currentVolume;
    }

    public void upVolume(){
        if (currentVolume >= maxVolume){
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume++;
    }

    public void downVolume(){
        if (currentVolume <= minVolume){
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume--;
    }

    public void nextStation(){
        if (currentStation == maxStation){
            this.currentStation = minStation;
            return;
        }
        this.currentStation++;
    }
    public void prevStation(){
        if (currentStation == minStation){
            this.currentStation = maxStation;
            return;
        }
        this.currentStation--;
    }

}
