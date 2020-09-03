package Ex3.Vehicles.Bicycles.Cycles;

import Ex3.IMusicable;

public class Bicycle implements IMusicable {


    @Override
    public void PlayMusic() {
        System.out.println("Playing on bike.");
    }

    @Override
    public void StopMusic() {

    }

    @Override
    public void SkipSong() {

    }

    @Override
    public void BackSong() {

    }
}
