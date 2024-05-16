package com.cakmak.enm;

public enum Week {
    MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5);

    private int key;
    private Week(int key){
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}
