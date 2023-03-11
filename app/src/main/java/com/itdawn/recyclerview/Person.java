package com.itdawn.recyclerview;

public class Person {
    int id, imageId;
    String personName, personInfo;

    public Person(int id, String personName, String personInfo, int imageId) {
        this.id = id;
        this.personName = personName;
        this.personInfo = personInfo;
        this.imageId = imageId;
    }

    public int getId() {
        return id;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonInfo() {
        return personInfo;
    }

    public int getImageId() {
        return imageId;
    }
}
