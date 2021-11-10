package type;

public enum InitializationType {

    HINT(0);

    private final int initialization;

    InitializationType(int initialization){
        this.initialization = initialization;
    }

    public int getInitialization(){
        return this.initialization;
    }
}
