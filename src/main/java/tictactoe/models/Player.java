package tictactoe.models;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    private String playerName;

    private PlayerPiece playerPiece;

}
