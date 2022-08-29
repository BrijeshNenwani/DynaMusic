package com.brijeshsapps.dynamosic;

import android.media.Image;
import android.net.Uri;
import android.widget.ImageView;

import java.io.Serializable;

public class AudioModel implements Serializable {
    String path, title,duration;
    Uri image;

    public AudioModel(String path, String title, String duration){
        this.path=path;
        this.duration=duration;
        this.title=title;
        this.image=image;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Uri getImage() {
        return image;
    }

    public void setImage(Uri image) {
        this.image = image;
    }


}

