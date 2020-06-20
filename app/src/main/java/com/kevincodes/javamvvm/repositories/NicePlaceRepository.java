package com.kevincodes.javamvvm.repositories;

import androidx.lifecycle.MutableLiveData;

import com.kevincodes.javamvvm.models.NicePlace;

import java.util.ArrayList;
import java.util.List;

public class NicePlaceRepository {

    private static NicePlaceRepository instance;
    private ArrayList<NicePlace> dataSet = new ArrayList<>();

    public static synchronized NicePlaceRepository getInstance() {
        if (instance == null) {
            instance = new NicePlaceRepository();
        }
        return instance;
    }

    // pretends to get data from a web service or online source
    public MutableLiveData<List<NicePlace>> getNicePlaces() {
        setNicePlaces();

        MutableLiveData<List<NicePlace>> mData = new MutableLiveData<>();
        mData.setValue(dataSet);

        return mData;
    }

    private void setNicePlaces() {
        dataSet.add(
                new NicePlace("Havasu Falls","https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg")
        );
        dataSet.add(
                new NicePlace("Trondheim","https://i.redd.it/tpsnoz5bzo501.jpg")
        );
        dataSet.add(
                new NicePlace("Portugal","https://i.redd.it/qn7f9oqu7o501.jpg")
        );
        dataSet.add(
                new NicePlace("Rocky Mountain National Park","https://i.redd.it/j6myfqglup501.jpg")
        );
        dataSet.add(
                new NicePlace("Havasu Falls","https://i.redd.it/0h2gm1ix6p501.jpg")
        );
        dataSet.add(
                new NicePlace("Mahahual","https://i.redd.it/k98uzl68eh501.jpg")
        );
        dataSet.add(
                new NicePlace("Frozen Lake","https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg")
        );
        dataSet.add(
                new NicePlace("Austrailia","https://i.redd.it/obx4zydshg601.jpg")
        );
    }
}
