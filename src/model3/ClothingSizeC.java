package model3;

public enum ClothingSizeC {
    S("Small"), M("Medium"), L("Large");

    private String description;
    ClothingSizeC(String description){
        this.description = description;
    }

    public String toString(){
        return description;
    }
}
