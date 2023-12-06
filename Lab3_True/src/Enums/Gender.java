package Enums;

public enum Gender {
    Male(" "), Female("а "), Neither("о "), ALL("");
    private String ending;

    Gender(String ending){
        this.ending = ending;
    }
}
