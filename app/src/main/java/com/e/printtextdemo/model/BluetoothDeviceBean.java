package com.e.printtextdemo.model;

import lombok.Data;

/**
 * Created by weioule
 * on 2020/1/1
 */

@Data
public class BluetoothDeviceBean {
    private String address;
    private String name;
    private boolean isSelected;
}
