package Ex1;

import Ex1.Model.FaceID;
import Ex1.Model.FingerPrint;
import Ex1.Model.FreeUnlock;
import Ex1.Model.PIN;

public class Presenter {
    public void unlock(int mode) {
        if (mode == 1) {
            FreeUnlock freeUnlock = new FreeUnlock();
            freeUnlock.unlock();
        } else if (mode == 2) {
            PIN pin = new PIN();
            pin.setCode();
            pin.unlock();
        } else if (mode == 3) {
            FaceID faceID = new FaceID();
            faceID.setFace();
            faceID.unlock();
        } else {
            FingerPrint fingerPrint = new FingerPrint();
            fingerPrint.setPrint();
            fingerPrint.unlock();
        }
    }
}
