package com.company;

import java.util.ArrayList;
import java.util.List;

public class SpecialService implements SpecialObservable{
    private List<String> specService = new ArrayList<String>();
    private List<SpecialObserver> regular = new ArrayList<>();



    public void addspecService(String specService){
        this.specService.add(specService);
        notifyAllGuest();
    }
    public void removespecService(String specService){
        this.specService.remove(specService);
        notifyAllGuest();
    }

    @Override
    public void registerGuest(SpecialObserver regular) {
        this.regular.add(regular);
    }

    @Override
    public void unregisterGuest(SpecialObserver Guest) {
        this.regular.remove(Guest);
    }

    @Override
    public void notifyAllGuest() {
        for(SpecialObserver SpecialGuest: this.regular){
            SpecialGuest.update(this.specService);
        }
    }

}
