package com.example.scrabble_gamestate.scrabble;

import com.example.scrabble_gamestate.game.GamePlayer;
import com.example.scrabble_gamestate.game.actionMsg.GameAction;

import java.io.Serializable;

/**
 *Updates the game state to match the current presentation of the board and checks if the played
 * word is a real word.
 *
 * @author Sydney Wells
 * @author Sarah Bunger
 * @author Kavya Mandla
 * @author Meredith Marcinko
 * @version February 2019
 */
public class PlayWordActionComputer extends GameAction implements Serializable {
    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public PlayWordActionComputer(GamePlayer player) {
        super(player);
    }
}
