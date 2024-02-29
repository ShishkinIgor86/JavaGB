package org.example.controllers;

import org.example.vews.UserInterface;
import java.util.List;
public class ControlStudiedCommand {
    UserInterface userInterface = new UserInterface();

    public String[] addCommands(List<String[]> data, List<String[]> commandsFile) {
        String[] listCommands = new String[2];
        int numberEntry = userInterface.selectingEntryNumber(data);
        if (numberEntry != 0) {
            userInterface.showEntryOne(data.get(numberEntry - 1), commandsFile, numberEntry);
            listCommands[0] = String.valueOf(numberEntry);
            listCommands[1] = userInterface.enteringCommand();
        }
        return listCommands;
    }
}