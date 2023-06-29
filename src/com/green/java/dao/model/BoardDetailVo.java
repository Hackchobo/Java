package com.green.java.dao.model;

public class BoardDetailVo {
    private int iboard;
    private String title;
    private String ctnt;
    private String writer;
    private String writerMainPic;
    private String createdAt;

    public BoardDetailVo(int iboard, String title, String ctnt, String writer, String writerMainPic, String createdAt) {
        this.iboard = iboard;
        this.title = title;
        this.ctnt = ctnt;
        this.writer = writer;
        this.writerMainPic = writerMainPic;
        this.createdAt = createdAt;
    }

    public int getIboard() {
        return iboard;
    }

    public String getTitle() {
        return title;
    }

    public String getCtnt() {
        return ctnt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getWriter() {
        return writer;
    }

    public String getWriterMainPic() {
        return writerMainPic;
    }


    public String toString() {
        return String.format("iboard: %d, title: %s, ctnt: %s, " +
                            "createdAt: %s, writer: %s, writerMainPic: %s"
                            , iboard, title,ctnt,createdAt,writer,writerMainPic);
    }
}
