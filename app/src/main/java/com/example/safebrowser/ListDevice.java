package com.example.safebrowser;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.safebrowser.adapter.DeviceAdapter;
import com.example.safebrowser.model.Device;

import java.util.ArrayList;
import java.util.List;

public class ListDevice extends Fragment {
    List<Device> deviceList = new ArrayList<>();

    public ListDevice(){
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Device device = new Device("Reza Computers", "222.wewqs.co", "29/12/2000");
        deviceList.add(device);
        device = new Device("Azra Computer", "222.wewqwd.co", "33/12/422");
        deviceList.add(device);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_device, container, false);

        RecyclerView rvDevice = (RecyclerView) view.findViewById(R.id.list_device);

        DeviceAdapter deviceAdapter  =new DeviceAdapter(deviceList);
        rvDevice.setAdapter(deviceAdapter);
        rvDevice.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

}
