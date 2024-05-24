package protect;

public class Car {

    public String benPublic;
    private String benPrivate;
    protected String benProtected;

    String benDefault;
    protected   String year;
    protected String colour;

    protected CarProtected carProtected = new CarProtected();


    private class CarPrıvate{

    }

    protected class CarProtected{

    }

    public class CarPublic{

    }

}



