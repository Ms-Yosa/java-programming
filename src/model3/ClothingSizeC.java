package model2;

public enum ClothingSizeB {
    S("Small"), M("Medium"), L("Large");

    private String description;
    ClothingSizeB(String description){
        this.description = description;
    }

    public String toString(){
        return description;
    }
}
