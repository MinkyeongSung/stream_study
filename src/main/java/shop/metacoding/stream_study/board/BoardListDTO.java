package shop.metacoding.stream_study.board;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardListDTO {
    private Integer id;
    private String content;
    private String athour;

    public BoardListDTO(Board board) {
        this.id = board.getId();
        this.content = board.getContent();
        this.athour = board.getAthour();
    }

}
