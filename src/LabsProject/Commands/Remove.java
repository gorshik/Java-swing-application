package LabsProject.Commands;


import LabsProject.Recivers.DataBaseReciver;
import LabsProject.Recivers.Reciver;
import LabsProject.NetworkInteraction.Result;

import java.sql.SQLException;

public class Remove extends AbstractCommand {
    public Remove(String arguments) {
        super(arguments);
    }

    @Override
    public Result execute(Reciver reciver) throws SQLException {
        DataBaseReciver DBreciver = (DataBaseReciver) reciver;
        int count = DBreciver.removeHuman(this.getArguments(), this.getNickname());
        if (count == 1) {
            return new Result("Insert " + this.getArguments() + " succesfully", DBreciver.getAllHuman());
        }
        else {
            return new Result("Can't remove " + this.getArguments(), DBreciver.getAllHuman());
        }
    }
}