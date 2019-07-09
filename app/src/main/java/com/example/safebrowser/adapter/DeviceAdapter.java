package com.example.safebrowser.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.safebrowser.R;
import com.example.safebrowser.model.Device;

import java.util.List;

public class DeviceAdapter extends RecyclerView.Adapter<DeviceAdapter.DevAdapter> {
    List<Device> deviceList;

    public DeviceAdapter(List<Device> deviceList){
        this.deviceList = deviceList;
    }

    @NonNull
    @Override
    public DevAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View listDevice = layoutInflater.inflate(R.layout.item_list_device,viewGroup,false);
        DevAdapter viewHolder = new DevAdapter(listDevice);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DevAdapter devAdapter, int i) {
        Device device = deviceList.get(i);
        //nanti perbaiki dengan info devicenya.
        devAdapter.computerName.setText(device.getTitle());
        devAdapter.lastAccess.setText(device.getCurrentDate());
    }

    @Override
    public int getItemCount() {
        return deviceList.size();
    }

    public class DevAdapter extends RecyclerView.ViewHolder {
        public TextView computerName, lastAccess;
        public DevAdapter(@NonNull View itemView) {
            super(itemView);
            computerName = itemView.findViewById(R.id.device_name);
            lastAccess = itemView.findViewById(R.id.device_last_accessed);
        }
    }
}
