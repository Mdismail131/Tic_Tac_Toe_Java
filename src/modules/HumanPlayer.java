package modules;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class HumanPlayer extends Player{
    private int rank;
    private int age;

}
