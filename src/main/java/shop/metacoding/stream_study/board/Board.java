package shop.metacoding.stream_study.board;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Board {
    private Integer id;
    private String title;
    private String content;
    private String athour;

    @Builder
    public Board(Integer id, String title, String content, String athour) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.athour = athour;
    }
}
