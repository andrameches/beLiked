package com.example.abesg.beliked.Utils.Other;

import android.os.Environment;

public class FilePaths {

    //"storage/emulated/0"
    public String ROOT_DIR = Environment.getExternalStorageDirectory().getPath();

    public String PICTURES = ROOT_DIR + "/Pictures";
    public String CAMERA = ROOT_DIR + "/DCIM/camera";
    public String DOWNLOADS = ROOT_DIR + "/Download";

    public String FIREBASE_IMAGE_STORAGE = "photos/users/";

}