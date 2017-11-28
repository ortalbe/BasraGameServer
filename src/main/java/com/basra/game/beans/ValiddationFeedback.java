package com.basra.game.beans;

import javax.xml.bind.annotation.*;

/**
 * Created by Ortal on 11/23/2017.
 */

@XmlRootElement
public class ValiddationFeedback {

    private String messageText;
    private String sevirity;

    public ValiddationFeedback(String messageText, String sevirity) {
        this.messageText = messageText;
        this.sevirity = sevirity;
    }
    @XmlElement
    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    @XmlElement
    public String getSevirity() {
        return sevirity;
    }

    public void setSevirity(String sevirity) {
        this.sevirity = sevirity;
    }
}
