package LabsProject.Commands;

import LabsProject.Recivers.Reciver;
import LabsProject.NetworkInteraction.Result;

import java.io.Serializable;
import java.sql.SQLException;

public class Request implements Command, Serializable {
    private String nickname;

    @Override
    public Result execute(Reciver reciver) throws SQLException {
        return null;
    }

    public void addNick(String nickname) {
        this.nickname = nickname;
    }

}
