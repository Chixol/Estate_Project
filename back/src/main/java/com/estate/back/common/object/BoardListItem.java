package com.estate.back.common.object;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import com.estate.back.entity.BoardEntity;

import lombok.Getter;

@Getter
public class BoardListItem {
    private Integer receptionNumber;
    private Boolean status;
    private String title;
    private String writerId;
    private String writeDatetime;
    private Integer viewCount;

    private BoardListItem(BoardEntity boardEntity) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date datetime = simpleDateFormat.parse(boardEntity.getWriteDatetime()); // 예외 처리
        simpleDateFormat = new SimpleDateFormat("yy.MM.dd"); // 날짜 형태 변환 yyyy-MM-dd -> yy.MM.dd
        String writeDatetime = simpleDateFormat.format(datetime);

        String writerId = boardEntity.getWriterId();
        writerId =writerId.substring(0, 1) + "*".repeat(writerId.length() - 1); // 첫번째 글자를 제외한 나머지 "*"로 표기

        this.receptionNumber = boardEntity.getReceptionNumber();
        this.status = boardEntity.getStatus();
        this.title = boardEntity.getTitle();
        this.writerId = writerId;
        this.writeDatetime = writeDatetime;
        this.viewCount = boardEntity.getViewCount();
    }

    public static List<BoardListItem> getList(List<BoardEntity> boardEntities) throws Exception { // List<BoardEntity> -> List<BoardListItem>
        List<BoardListItem> boardList = new ArrayList<>();

        for (BoardEntity boardEntity : boardEntities) {
            BoardListItem boardListItem = new BoardListItem(boardEntity);
            boardList.add(boardListItem);
        }

        return boardList;

    }
}
