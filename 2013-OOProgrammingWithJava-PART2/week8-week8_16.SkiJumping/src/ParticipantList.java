
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class ParticipantList {
    ArrayList<Participant> participants;
    
    public ParticipantList() {
        this.participants = new ArrayList<Participant>();
    }
    
    public void add(Participant participant) {
        participants.add(participant);
    }
    
    public void setJumpOrder() {
        Collections.sort(participants);
    }
    
    public void setWinningOrder() {
        participants.sort(Collections.reverseOrder());
    }
    
    public ArrayList<Participant> getJumpers() {
        return participants;
    }
}
