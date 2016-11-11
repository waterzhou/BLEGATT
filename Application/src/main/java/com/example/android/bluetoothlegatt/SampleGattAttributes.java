/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static {
        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "GAP Service");
        attributes.put("00001801-0000-1000-8000-00805f9b34fb", "GATT Service");
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("00001812-0000-1000-8000-00805f9b34fb", "HID Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // Sample Characteristics.
        attributes.put("00002a00-0000-1000-8000-00805f9b34fb", "Device Name");
        attributes.put("00002a01-0000-1000-8000-00805f9b34fb", "Appearance");
        attributes.put("00002a02-0000-1000-8000-00805f9b34fb", "Peripheral Privacy");
        attributes.put("00002a03-0000-1000-8000-00805f9b34fb", "Reconnection Address");
        attributes.put("00002a04-0000-1000-8000-00805f9b34fb", "Peripheral Preferred Connection Parameters");
        attributes.put("00002a05-0000-1000-8000-00805f9b34fb", "Service Changed");
        attributes.put("00002a22-0000-1000-8000-00805f9b34fb", "HID Boot Key Input Report");
        attributes.put("00002a23-0000-1000-8000-00805f9b34fb", "System ID");
        attributes.put("00002a24-0000-1000-8000-00805f9b34fb", "Model Number");
        attributes.put("00002a25-0000-1000-8000-00805f9b34fb", "Serial Number");
        attributes.put("00002a26-0000-1000-8000-00805f9b34fb", "Firmware Version");
        attributes.put("00002a27-0000-1000-8000-00805f9b34fb", "Hardware Version");
        attributes.put("00002a28-0000-1000-8000-00805f9b34fb", "Software Version");


        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put("00002a2a-0000-1000-8000-00805f9b34fb", "IEEE Reg Cert Data List");
        attributes.put("00002a32-0000-1000-8000-00805f9b34fb", "HID Boot Key Output Report");
        attributes.put("00002a37-0000-1000-8000-00805f9b34fb", "Heart Rate Measurement");
        attributes.put("00002a4a-0000-1000-8000-00805f9b34fb", "HID Information");
        attributes.put("00002a4b-0000-1000-8000-00805f9b34fb", "HID Report Map");
        attributes.put("00002a4c-0000-1000-8000-00805f9b34fb", "HID Control Point");
        attributes.put("00002a4d-0000-1000-8000-00805f9b34fb", "HID Report");
        attributes.put("00002a4e-0000-1000-8000-00805f9b34fb", "HID Protocol Mode");
        attributes.put("00002a50-0000-1000-8000-00805f9b34fb", "PNP ID");
        attributes.put("00002a82-0000-1000-8000-00805f9b34fb", "HID Audio");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
