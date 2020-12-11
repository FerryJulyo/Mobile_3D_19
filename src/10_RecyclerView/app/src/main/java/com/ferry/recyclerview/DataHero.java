package com.ferry.recyclerview;

import android.os.Parcel;
import android.os.Parcelable;
import android.provider.ContactsContract;

public class DataHero implements Parcelable {

    private String namaHero;
    private String descp;
    private Integer image,gbrHero;

    public DataHero(String namaHero, String descp, Integer image, Integer gbrHero) {
        this.namaHero = namaHero;
        this.descp = descp;
        this.image = image;
        this.gbrHero = gbrHero;
    }

    protected DataHero(Parcel in) {
        namaHero = in.readString();;
        descp = in.readString();;
        image = in.readInt();
        gbrHero = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(namaHero);
        dest.writeString(descp);
        dest.writeInt(image);
        dest.writeInt(gbrHero);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<DataHero> CREATOR = new Creator<DataHero>() {
        @Override
        public DataHero createFromParcel(Parcel in) {
            return new DataHero(in);
        }

        @Override
        public DataHero[] newArray(int size) {
            return new DataHero[size];
        }
    };

    public String getnamaHero() {
        return namaHero;
    }

    public void setnamaHero(String namaHero) {
        this.namaHero = namaHero;
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer getGbrHero() {
        return gbrHero;
    }

    public void setGbrHero(Integer gbrHero) {
        this.gbrHero = gbrHero;
    }
}
