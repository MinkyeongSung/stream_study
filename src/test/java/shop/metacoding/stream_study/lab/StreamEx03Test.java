package shop.metacoding.stream_study.lab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import shop.metacoding.stream_study.board.Board;
import shop.metacoding.stream_study.board.BoardDetailDTO;
import shop.metacoding.stream_study.board.BoardListDTO;

public class StreamEx03Test {

    @Test
    public void ex02() {
        Board b1 = Board.builder()
                .id(1)
                .title("제목1")
                .content("내용1")
                .athour("ssar")
                .build();

        Board b2 = Board.builder()
                .id(2)
                .title("제목2")
                .content("내용2")
                .athour("ssar")
                .build();

        Board b3 = Board.builder()
                .id(3)
                .title("제목3")
                .content("내용3")
                .athour("cos")
                .build();

        List<Board> boardList = Arrays.asList(b1, b2, b3);
        List<BoardListDTO> responseDTOs = boardList.stream()
                .filter(board -> !board.getAthour().equals("cos"))
                .map(board -> new BoardListDTO(board))
                .collect(Collectors.toList());

        System.out.println(responseDTOs);
    }

    @Test
    public void ex01() {
        Board board = Board.builder()
                .id(1)
                .title("제목1")
                .content("내용1")
                .athour("ssar")
                .build();

        BoardDetailDTO responseDTO = new BoardDetailDTO(board);
        System.out.println(responseDTO);
    }

}
