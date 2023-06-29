package com.green.java.dao;

import com.green.java.dao.model.BoardDetailVo;
import com.green.java.dao.model.BoardEntity;
import com.green.java.dao.model.BoardSelDto;
import com.green.java.dao.model.BoardVo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MyConntest {
    public static void main(String[] args) {

        BoardDao boardDao = new BoardDao();
       // BoardEntity entity = new BoardEntity();
        BoardSelDto dto = new BoardSelDto();
        //dto.setIboard(1000);
        dto.setPage(2);
        dto.setRow(30);
        List<BoardVo> result = boardDao.selBoard(dto);

       // BoardDetailVo result = boardDao.selBoardDetail(dto);
        System.out.printf("r: %s \n", result);

        /*entity.setTitle("제목2");
        entity.setCtnt("본문2");
        entity.setIuser(8);
        entity.setIboard(1003);
        int result = boardDao.insBoard(entity);
        System.out.println("result : " +result);*/
       /* entity.setTitle("제목7");
        entity.setCtnt("본문7");
        entity.setIuser(8);
        entity.setIboard(1003);
        int result1= boardDao.updBoard(entity);
        System.out.println("result : " +result1);*/
       /* MyConnection mc = new MyConnection();
         try {
            Connection con = mc.getConn();
         } catch (SQLException e){
             e.printStackTrace();
         } catch (ClassNotFoundException e){
             e.printStackTrace();
         }*/
    }
}
