package com.study.study_springboots.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.study.study_springboots.beans.BoardBean;

public class DataInfors {
    public HashMap<String, String> getSearchFormData(){
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "하선");
        searchForm.put("id", "ID0001");
        return searchForm;
    }

    public ArrayList<String> getTablesListWithString(){
        ArrayList<String> tablesListWithString = new ArrayList<String>();
        tablesListWithString.add("@mdo");
        tablesListWithString.add("@fat");
        tablesListWithString.add("@twitter");
        return tablesListWithString;
    }

    public HashMap<String, Object> getBundlesData() {
        DataInfors dataInfor = new DataInfors();
        HashMap<String, String> searchForm = dataInfor.getSearchFormData();
        ArrayList<String> tablesListWithString = dataInfor.getTablesListWithString();
        
        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tablesListWithString", tablesListWithString);

        bundlesData.put("dataWithBoardBean", dataInfor.getDataWithBoardBean());
        bundlesData.put("dataListWithBoardBean", dataInfor.getDataListWithBoardBean());


        return bundlesData;
    }

    public BoardBean getDataWithBoardBean(){
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");

        return boardBean;
    }

    public ArrayList<BoardBean> getDataListWithBoardBean(){
        ArrayList<BoardBean> membersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("Jacob");
        boardBean.setContent("Thornton");
        boardBean.setUserName("@fat");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("Larry");
        boardBean.setContent("Bird");
        boardBean.setUserName("@twitter");
        membersList.add(boardBean);

        return membersList;
    }
}
