package com.iesam.AlonsoDeMadrigal.domain.models;

public class TeachingRoom extends Classroom {

    private Integer chairNum;
    private String boardType;

    public Integer getChairNum() {
        return chairNum;
    }

    public void setChairNum(Integer chairNum) {
        this.chairNum = chairNum;
    }

    public String getBoardType() {
        return boardType;
    }

    public void setBoardType(String boardType) {
        this.boardType = boardType;
    }
}
